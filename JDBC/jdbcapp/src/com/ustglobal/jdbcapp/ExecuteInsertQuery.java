package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		FileReader reader = null;

		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
			
			String url = prop.getProperty("url");
			con = DriverManager.getConnection(url, prop);
			
			// Step 3 : Issue the SQL query
			String sql = prop.getProperty("insert-query");
			stmt = con.createStatement();
			int count = stmt.executeUpdate(sql);
			
			// Step 4 : Read the Result 

			System.out.println(count+ " Row(s) inserted");

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			// Step 5 : Close all the JDBC Objects
			try {
				if(con!=null) {
					con.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
