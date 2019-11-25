package com.ustglobal.empapp.dao;

import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public ArrayList<EmployeeBean> getAllEmployeeData() {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			ArrayList<EmployeeBean> result = new ArrayList<>();
			
			while(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				int id = rs.getInt("id");
				bean.setId(id);
				String name = rs.getString("name");
				bean.setName(name);
				int sal = rs.getInt("salary");
				bean.setSal(sal);
				String gender = rs.getString("gender");
				bean.setGender(gender);
				
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
		public EmployeeBean searchEmployeeData(int id) {
		
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			String sql= "select * from employee_info where id = ?";
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, id);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					EmployeeBean bean = new EmployeeBean();
					
					bean.setId( rs.getInt("id"));
					bean.setName(rs.getString("name"));
					bean.setSal( rs.getInt("salary"));
					bean.setGender(rs.getString("gender"));
					
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
		public int insertEmployeeData(int id, String name, int sal,String gender) {
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			String sql= "insert into employee_info values(?,?,?,?)";
			Connection con = null;
			PreparedStatement pstmt = null;
			FileReader reader = null;

			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				con = DriverManager.getConnection(url);
				
				pstmt = con.prepareStatement(sql);
				
				pstmt.setInt(1, id);
				
				pstmt.setString(2, name);
				
				pstmt.setInt(3, sal);
				
				pstmt.setString(4, gender);
				
				int count = pstmt.executeUpdate();

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
					if(pstmt!=null) {
						pstmt.close();
					}
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
			return 0;
		}
		@Override
		public int updateEmployeeData(int id, String name, int sal,String gender) {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public int deleteEmployeeData(int id) {
			// TODO Auto-generated method stub
			return 0;
		}
	
}
