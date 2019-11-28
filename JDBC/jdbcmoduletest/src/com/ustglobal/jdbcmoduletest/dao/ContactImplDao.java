package com.ustglobal.jdbcmoduletest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ustglobal.jdbcmoduletest.dto.ContactInfo;

public class ContactImplDao implements ContactIntfDao{


	@Override
	public ArrayList<ContactInfo> showAllContacts() {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from contact";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			ArrayList<ContactInfo> result = new ArrayList<>();

			while(rs.next()) {
				ContactInfo bean = new ContactInfo();

				String name = rs.getString("name");
				bean.setName(name);
				int number = rs.getInt("number");
				bean.setNumber(number);
				String group = rs.getString("group");
				bean.setGroup(group);

				result.add(bean);
			}
			return result;

		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(con!=null) {
					con.close();
				}

				if(stmt!=null) {
					stmt.close();
				}

				if(rs!=null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public ContactInfo searchContact(String name) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql= "select * from employee_info where name = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				ContactInfo bean = new ContactInfo();

				bean.setName(rs.getString("name"));
				bean.setNumber(rs.getInt("number"));
				bean.setGroup(rs.getString("group"));

				return bean;

			} else {
				return null;
			}

		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(con!=null) {
					con.close();

					pstmt.close();
				}

				if(rs!=null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


	}

	@Override
	public void operateOnContact(int n) {

		if(n==1) {
			
		} else if(n==2) {
			
		} else if(n==3) {
			
		}
	}
}
