package com.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.FileDownload;

/**
 * Servlet implementation class OrdrToCashController
 */
@WebServlet("/OrdrToCashController")
public class OrdrToCashController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrdrToCashController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  //Enumeration<?> en = request.getParameterNames(); 
		  
		  
		System.out.println("before calling fileDownload");
		  String parameterValue =  request.getParameter("DownlaodFile");
		  System.out.println(":"+parameterValue); 
		
		  if(parameterValue == "Download") {
			  System.out.println("calling fileDownload");
			  FileDownload fileDownload = new FileDownload();
			  fileDownload.GetOrdrToCashTemp(request, response);
			  
		  }
		  response.sendRedirect("OrderToCash.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doGet(request, response);
	}

}
