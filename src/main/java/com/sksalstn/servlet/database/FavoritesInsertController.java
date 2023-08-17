package com.sksalstn.servlet.database;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sksalstn.servlet.common.MysqlService;

@WebServlet("/db/favorites/insert")
public class FavoritesInsertController extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();	
		
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "INSERT INTO `favorites`\r\n"
				+ "(`name`, `url`, `createdAt`, `updateAt`)\r\n"
				+ "VALUE\r\n"
				+ "('인스타', 'http://instagram.com', now(), now());";
		
		int count = mysqlService.update(query);
		
		mysqlService.disconnect();
		
		response.sendRedirect("/datebase/test/favorites-list.jsp");
		

	}

}