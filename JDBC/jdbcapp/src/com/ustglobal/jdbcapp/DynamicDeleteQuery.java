package com.ustglobal.jdbcapp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;

		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
			
			String url = prop.getProperty("url");
			con = DriverManager.getConnection(url, prop);
			
			String sql = prop.getProperty("delete-query");
			pstmt = con.prepareStatement(sql);
 
			 pstmt.setInt(1, Integer.parseInt(args[0]));
			
			int count = pstmt.executeUpdate();
			
			System.out.println(count+ " Row(s) deleted");

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				if(con!=null) {
					con.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
