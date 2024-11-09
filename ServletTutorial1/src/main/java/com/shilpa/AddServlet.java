package com.shilpa;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int i = Integer.parseInt(req.getParameter("first_num"));
		int j = Integer.parseInt(req.getParameter("second_num"));
		int sum = i+j;
		//URL Rewriting
		//resp.sendRedirect("SqServlet?k="+sum);
		//Sessions
		/*HttpSession session=req.getSession();
		session.setAttribute("sum", sum);*/
		Cookie cookie=new Cookie("sum",sum+"");
		resp.addCookie(cookie);
		resp.sendRedirect("SqServlet");
	}
}
