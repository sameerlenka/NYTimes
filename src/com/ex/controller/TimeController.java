package com.ex.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TimeController
 */
public class TimeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static Map<String,String> apiMap = new HashMap<String, String>();
    /**
     * Default constructor. 
     */
    public TimeController() {
    	apiMap.put("world", "https://www.nytimes.com/section/world");
    	apiMap.put("politics", "https://www.nytimes.com/section/politics");
    	apiMap.put("science", "https://www.nytimes.com/section/science");
    	apiMap.put("health", "https://www.nytimes.com/section/health");
    	apiMap.put("sports", "https://www.nytimes.com/section/sports");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html;charset=UTF-8");
			
			PrintWriter out = response.getWriter();
		    try {
		        out.println(apiMap.get(request.getParameter("value")));
		        //response.sendRedirect(apiMap.get(request.getParameter("value")));
		    } finally {
		        out.close();
		    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
