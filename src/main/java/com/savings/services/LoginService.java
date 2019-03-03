package com.savings.services;

import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

@Component
public class LoginService {
	private JdbcTemplate jdbcTemplate;
	@Autowired
	DataSource dataSource;
	
	 public JdbcTemplate getJdbcTemplate() {
         if(jdbcTemplate==null) {
                         this.jdbcTemplate = new JdbcTemplate(dataSource);                                                                                                                                                                                                                                                                                                                                                                                      
         }
         return jdbcTemplate;
}
	
	
	public boolean checkUser(String id, String pwd) {
		String user = null;
		try {
			String query = "select count(*) from Saving.user where userName = '"+id.trim()+ "' and password = '"+pwd.trim()+"'";	
			user = getJdbcTemplate().queryForObject(query, String.class);
			System.out.println("******************8");
			System.out.println(user);
			/*
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2) );*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		int user1=Integer.parseInt(user);
		if(user1==0)
			return false;
		else 
			return true;
	}

	
}
