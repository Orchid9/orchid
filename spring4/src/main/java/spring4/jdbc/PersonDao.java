package spring4.jdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *不推荐使用  JdbcDaoSupport 而是直接使用JdbcTemplate 作为Dao 类成员变量
 * @author Administrator
 *
 */

@Repository
public class PersonDao extends JdbcDaoSupport{
	@Autowired
	public void setDatasource2(DataSource dataSource){
		setDataSource(dataSource);
	}
	
	public Person get(Integer id){
		String sql="select * from person where id = ?";
		RowMapper<Person> rowMapper=new BeanPropertyRowMapper<>(Person.class);
		return getJdbcTemplate().queryForObject(sql, rowMapper,id);
				
		
	}
	
}
