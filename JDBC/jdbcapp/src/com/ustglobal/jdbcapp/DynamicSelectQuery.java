package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FileReader reader = null;

		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
			
			String url = prop.getProperty("url");
			con = DriverManager.getConnection(url, prop);
			String sql = prop.getProperty("select-query1");
					
			String eid = args[0];
			int id = Integer.parseInt(eid);
			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();
			while(rs.next()) {

				String name = rs.getString("name");
				int sal = rs.getInt("salary");
				String gender = rs.getString("gender");

				System.out.println("Id: "+id);
				System.out.println("Name: "+name);
				System.out.println("Salary: "+sal);
				System.out.println("Gender: "+gender);
				System.out.println("---------------------------");
			}

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
				if(rs!=null ) {
					rs.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
