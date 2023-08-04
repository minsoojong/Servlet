package com.sksalstn.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet("/servlet/test05")
	public class test05Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String number = request.getParameter("number");
		
		int dan = Integer.parseInt(number);
		
		out.println("<html><head><title>구구단</title></head><body>");
		out.println("<ul>");
		
		for(int i = 1; i <= 9; i++) {
			out.println("<li>" + dan + " x " + i + " = " + (dan * i) + "</li>");
		}
		
		out.println("</ul></html>");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}