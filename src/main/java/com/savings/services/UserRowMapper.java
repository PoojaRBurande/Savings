package com.savings.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.savings.beans.UserBean;

public class UserRowMapper implements RowMapper<Object>{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UserBean user=new UserBean();
		user.setId(rs.getString(""));
		user.setPwd(rs.getString(""));
		return user;
	}

}
