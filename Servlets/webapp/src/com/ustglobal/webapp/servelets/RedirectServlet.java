package com.ustglobal.webapp.servelets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class RedirectServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String search = req.getParameter("search");
		String select = req.getParameter("select");
		
		if(select.equals("Google")) {
		    resp.sendRedirect("https://www.google.com/search?q="+search);
		}
		else if (select.equals("Bing")) {
			resp.sendRedirect("https://www.bing.com/search?q="+search);
		}
		else if (select.equals("Yahoo")) {
			resp.sendRedirect("https://in.search.yahoo.com/search?p="+search);
		}
	}
	
}
