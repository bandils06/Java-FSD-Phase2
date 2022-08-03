package com.configServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class Config extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		out.println("<h1>Configuration Successful</h1>");
	}
}
