package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Indexontroller
 */

@WebServlet("/IndexController")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IndexController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//response.sendRedirect("OrderToCash.jsp");
		response.sendRedirect("OrderToCash.jsp");

		/*
		 * String OrderToShipConfirm = request.getParameter("OrderToShipConfirm");
		 * String LdtAutomation = request.getParameter("LdtAutomation");
		 * 
		 * if (OrderToShipConfirm != null) {
		 * 
		 * System.out.println(OrderToShipConfirm); //System.out.println(LdtAutomation);
		 * 
		 * }
		 */

		/*
		 * Enumeration<?> en = request.getParameterNames(); while (en.hasMoreElements())
		 * { String parameterName = (String) en.nextElement(); String parameterValue =
		 * request.getParameter(parameterName);
		 * System.out.println(parameterName+":"+parameterValue); }
		 */

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//String OrderToShipConfirm = request.getParameter("OrderToShipConfirm");
		//System.out.println(OrderToShipConfirm);
		doGet(request, response);
		// RequestDispatcher rd = request.getRequestDispatcher("/OrderToCash.jsp");
		//response.sendRedirect("OrderToCash.jsp");
		// rd.forward(request, response);

	}

}
