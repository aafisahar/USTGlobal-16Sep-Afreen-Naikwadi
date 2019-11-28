package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery {

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
			
			
			pstmt = con.prepareStatement(prop.getProperty("update-query"));
			
			String eid = args[0];
			int id = Integer.parseInt(eid);
			pstmt.setInt(4, id);
			
			String name = args[1];
			pstmt.setString(1, name);
			
			String esal = args[2];
			int sal = Integer.parseInt(esal);
			pstmt.setInt(2, sal);
			
			String gender = args[3];
			pstmt.setString(3, gender);
			
			int count = pstmt.executeUpdate();

			System.out.println(count+ " Row(s) updated");

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
