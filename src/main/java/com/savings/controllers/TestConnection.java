package com.savings.controllers;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class TestConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", null);
			// here sonoo is database name, root is username and password
			Statement stmt = (Statement) con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Saving.user");
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2) );
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
