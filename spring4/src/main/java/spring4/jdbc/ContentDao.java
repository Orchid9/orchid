package spring4.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository
public class ContentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Content get(Integer id){
		String sql="select * from content where id = ?";
		RowMapper<Content> rowMapper=new BeanPropertyRowMapper<>(Content.class);
		Content content=jdbcTemplate.queryForObject(sql, rowMapper,1);
		//System.out.println(content);
		return content;
	}
}
