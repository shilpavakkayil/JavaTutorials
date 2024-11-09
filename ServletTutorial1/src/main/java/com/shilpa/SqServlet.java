package com.shilpa;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SqServlet
 */
@WebServlet("/SqServlet")
public class SqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SqServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int num = (int)request.getAttribute("sum");
		//response.getWriter().println("I am the second servlet and the square of the sum is "+num*num);
		//int sum = Integer.parseInt(request.getParameter("k"));
		//session
		/*
		 * HttpSession session= request.getSession(); int sum =
		 * (int)session.getAttribute("sum");
		 */
		int sum=0;
		Cookie cookies[]=request.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("sum"))
			{
				sum=Integer.parseInt(c.getValue());
			}
		}
		response.getWriter().println("I am the second servlet and the square of the sum is "+sum*sum);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
