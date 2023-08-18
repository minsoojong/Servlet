package com.sksalstn.servlet.database;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dv/favorites/delete")
public class FavoritesDeleteController extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();	
		
		// 전달받은 id에 대응하는 행을 삭제하는 기능
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		DELETE FROM `favorites` WHERE `id` = '';

		
	}
}
