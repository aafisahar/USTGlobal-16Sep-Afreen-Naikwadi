package com.ustglobal.webapp.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SelectEmployeeDetails extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql= "select * from employee_info where id = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		PrintWriter out = resp.getWriter();
		String eid = req.getParameter("text");
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,eid);
			rs = pstmt.executeQuery();
			
			out.println("<table>");
			out.println("<thead>");
			out.println("<th>id</th>");
			out.println("<th>name</th>");
			out.println("<th>salary</th>");
			out.println("<th>gender</th>");
			out.println("</thead>");
			
			if(rs.next()) {
				
				out.println("<tbody>");
				out.println("<tr>");
				out.println("<td>");
				out.println(rs.getInt(1));
				out.println("</td>");
				
				out.println("<td>");
				out.println(rs.getString(2));
				out.println("</td>");
				
				out.println("<td>");
				out.println(rs.getInt(3));
				out.println("</td>");
				
				out.println("<td>");
				out.println(rs.getString(4));
				out.println("</td>");
				
				out.println("</tr>");
				out.println("<tbody>");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			
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
}
