package com.ustglobal.webapp.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ForwordServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>This is Forword Servlet</h1");
		
		Object obj = new Object();
		req.setAttribute("obj", obj);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/first");
		
		dispatcher.forward(req, resp);
	}
}
