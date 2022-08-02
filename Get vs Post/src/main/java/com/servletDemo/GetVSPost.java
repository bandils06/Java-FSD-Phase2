package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class GetVSPost extends HttpServlet{
	
	// doGet method is used for addition
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int sum = a+b;
		
		PrintWriter out = res.getWriter();
		out.println("Addition result is: " + sum);
		
//		System.out.println("Result is "+sum);
	}
	
	
	// doPost method is used for Subtraction.
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("numb1"));
		int b = Integer.parseInt(req.getParameter("numb2"));
		int result = a-b;
		
		PrintWriter out = res.getWriter();
		out.println("Subtraction result is: " + result);
	}

}
