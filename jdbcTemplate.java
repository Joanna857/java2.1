package TS;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class jdbcTemplate {
	public static void main(String[] args) {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		
		String sql = "select * from druid_ts";
		List<User> list= jt.query(sql,new BeanPropertyRowMapper<User>(User.class));
		
		for(User user : list) {
			System.out.println(user);
		}
		
	}

	
	
	  

	}


