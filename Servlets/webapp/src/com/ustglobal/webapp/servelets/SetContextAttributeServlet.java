package com.ustglobal.webapp.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SetContextAttributeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	ServletContext context = getServletContext();
	Object obj = new Object();
	context.setAttribute("obj", obj);
	
	PrintWriter out = resp.getWriter();
	out.println("<h1>Setting Context Attribute to obj</h1>");
	
	}
}
