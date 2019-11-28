package com.ustglobal.webapp.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class CreateCookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie cookie = new Cookie("ename", "Afreen");
		cookie.setMaxAge(1000);
		resp.addCookie(cookie);
		PrintWriter out = resp.getWriter();
		out.println("<h1>Cookie created</h1>");
	}
}
