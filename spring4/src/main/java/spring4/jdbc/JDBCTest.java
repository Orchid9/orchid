package spring4.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class JDBCTest {
	
	private ApplicationContext ctx=null;
	private JdbcTemplate jdbcTemplate;
	private ContentDao contentdao;
	private PersonDao persondao;
	{
		ctx=new ClassPathXmlApplicationContext("beans.xml");
		jdbcTemplate=(JdbcTemplate) ctx.getBean("jdbcTemplate");
		contentdao=ctx.getBean(ContentDao.class);
		persondao=ctx.getBean(PersonDao.class);
	}
	
	@Test
	public void testPersonDao(){
		System.out.println(persondao.get(1));
	}
	 
	@Test
	public void testContentDao(){
		System.out.println(contentdao.get(1));
	}
	
	
	/**
	 * 获取单个列的值,或做统计查询
	 */
	
	
	@Test
	public void testQueryForObject2(){
		String sql="select count(id) from content";
		long count=jdbcTemplate.queryForObject(sql, Long.class);
		System.out.println(count);
	}
	
	
	/**
	 * 查到实体类的集合
	 * 注意调用的不是 queryForList 方法
	 */
	
	@Test
	public void testQueryForList(){
		String sql="select * from content where id < ?";
		RowMapper<Content> rowMapper=new BeanPropertyRowMapper<>(Content.class);
		List<Content> contents=jdbcTemplate.query(sql, rowMapper,2);
		System.out.println(contents);
	}
	
	
	
	/**
	 * 从数据库中获取一条记录，实际得到对应的一个对象
	 * 注意不是调用queryForObject(String sql, Class<Content> requiredType, Object... args) 方法!
	 * 而需要	   queryForObject(String sql, RowMapper<Content> rowMapper, Object... args)
	 * 1. 其中的RowMapper 指定如何去映射结果集的行，常用的实现类BeanPropertyRowMapper
	 * 2. 使用sql 中列的别名完成列名和类名的映射,例如title title
	 * 3. 不支持级联属性, jdbcTemplate 到底是JDBC 的小工具，而不是ORM 框架
	 */
	
	@Test
	public void testQueryForObject(){
		String sql="select * from content where id = ?";
		RowMapper<Content> rowMapper=new BeanPropertyRowMapper<>(Content.class);
		Content content=jdbcTemplate.queryForObject(sql, rowMapper,1);
		System.out.println(content);
	}
	
	
	/**
	 *执行批量更新: 批量的Insert update delete 
	 *最后一个参数是Object[] 的List 类型: 因为修改一条记录需要一个Object 的数组,那么多条就需要多个 Object 的数组
	 */
	@Test
	public void testBatchUpdate(){
		String sql="insert into content(price,text) values(?,?)";
		List<Object[]> batchArgs=new ArrayList<>(); 
		
		batchArgs.add(new Object[]{"321","312"});
		batchArgs.add(new Object[]{"321","312"});
		batchArgs.add(new Object[]{"321","312"});
		
		jdbcTemplate.batchUpdate(sql, batchArgs);
	}
	
	
	/**
	 * 执行insert, update, delete
	 */
	@Test
	public void testUpdate(){
		String sql="UPDATE content SET price = ? where id = ?";
		jdbcTemplate.update(sql, "111", 1);
		
	}
	
	
	
	
	
	@Test
	public void testDataSource() {
		DataSource dataSource=ctx.getBean(DataSource.class);
		try {
			System.out.println(dataSource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
