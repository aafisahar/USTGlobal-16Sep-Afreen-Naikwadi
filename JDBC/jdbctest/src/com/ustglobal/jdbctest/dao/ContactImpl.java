package com.ustglobal.jdbctest.dao;

import java.sql.*;

import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.jdbctest.dto.ContactInfo;

public class ContactImpl implements ContactIntf {
	
		 String url = "jdbc:mysql://localhost:3306/ust_ty_web_db?user=root&password=root";
		 String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
		
		 String INSERT_SQL = "insert into employee_info values(?,?,?,?)";
		 String UPDATE_SQL = "update employee_info set password=? where id=?";
		

	@Override
	public ContactInfo showAllContacts() {
		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt = con.prepareStatement("select * from employee_info");	) {
				
				try(ResultSet rs = pstmt.executeQuery()) {
					while(rs.next()) {
						
						ContactInfo info = new ContactInfo();
						
						info.setName(rs.getString("name"));
						info.setNumber(rs.getInt("number"));
						info.setGroup(rs.getString("group"));
						
						return info;
					} 
				}
			}
		}catch (Exception e) {

			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public ContactInfo searchContact(String name) {
		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt = con.prepareStatement("select * from employee_info where name=?");	
				
				pstmt.setString(1, name);
				try(ResultSet rs = pstmt.executeQuery()) {
					if(rs.next()) {
						
						ContactInfo info = new ContactInfo();
						
						info.setName(rs.getString("name"));
						info.setNumber(rs.getInt("number"));
						info.setGroup(rs.getString("group"));
						
						return info;
					} else {
						return null;
					}
				}
			}
		}catch (Exception e) {

			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public void operateOnContact() {
		// TODO Auto-generated method stub
		
	}
}
