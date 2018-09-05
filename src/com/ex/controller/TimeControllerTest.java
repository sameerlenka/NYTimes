package com.ex.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.io.*;

import javax.servlet.http.*;
import org.junit.Test;


public class TimeControllerTest {
	
	String api1 = "https://www.nytimes.com/section/world";
	String api2 = "https://www.nytimes.com/section/politics";
	String api3 = "https://www.nytimes.com/section/science";
	String api4 = "https://www.nytimes.com/section/health";
	String api5 = "https://www.nytimes.com/section/sports";
	
	@Test
	public void checkServiceApi1(){
		 HttpServletRequest request = mock(HttpServletRequest.class);       
	        HttpServletResponse response = mock(HttpServletResponse.class);    

	        when(request.getParameter("value")).thenReturn("world");
	        try{
	        	StringWriter stringWriter = new StringWriter();
	        	PrintWriter writer = new PrintWriter(stringWriter);
	        	when(response.getWriter()).thenReturn(writer);

	        	new TimeController().doGet(request, response);

	        	verify(request, atLeast(1)).getParameter("value");
	        	writer.flush();
	        	assertTrue(stringWriter.toString().contains(api1));
	        }catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	@Test
	public void checkServiceApi2(){
		 HttpServletRequest request = mock(HttpServletRequest.class);       
	        HttpServletResponse response = mock(HttpServletResponse.class);    

	        when(request.getParameter("value")).thenReturn("politics");
	        try{
	        	StringWriter stringWriter = new StringWriter();
	        	PrintWriter writer = new PrintWriter(stringWriter);
	        	when(response.getWriter()).thenReturn(writer);

	        	new TimeController().doGet(request, response);

	        	verify(request, atLeast(1)).getParameter("value");
	        	writer.flush();
	        	assertTrue(stringWriter.toString().contains(api2));
	        	
	        }catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	@Test
	public void checkServiceApi3(){
		 HttpServletRequest request = mock(HttpServletRequest.class);       
	        HttpServletResponse response = mock(HttpServletResponse.class);    

	        when(request.getParameter("value")).thenReturn("science");
	        try{
	        	StringWriter stringWriter = new StringWriter();
	        	PrintWriter writer = new PrintWriter(stringWriter);
	        	when(response.getWriter()).thenReturn(writer);

	        	new TimeController().doGet(request, response);

	        	verify(request, atLeast(1)).getParameter("value");
	        	writer.flush();
	        	assertTrue(stringWriter.toString().contains(api3));
	        	
	        }catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	@Test
	public void checkServiceApi4(){
		 HttpServletRequest request = mock(HttpServletRequest.class);       
	        HttpServletResponse response = mock(HttpServletResponse.class);    

	        when(request.getParameter("value")).thenReturn("health");
	        try{
	        	StringWriter stringWriter = new StringWriter();
	        	PrintWriter writer = new PrintWriter(stringWriter);
	        	when(response.getWriter()).thenReturn(writer);

	        	new TimeController().doGet(request, response);

	        	verify(request, atLeast(1)).getParameter("value");
	        	writer.flush();
	        	assertTrue(stringWriter.toString().contains(api4));
	        	
	        }catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	@Test
	public void checkServiceApi5(){
		 HttpServletRequest request = mock(HttpServletRequest.class);       
	        HttpServletResponse response = mock(HttpServletResponse.class);    

	        when(request.getParameter("value")).thenReturn("sports");
	        try{
	        	StringWriter stringWriter = new StringWriter();
	        	PrintWriter writer = new PrintWriter(stringWriter);
	        	when(response.getWriter()).thenReturn(writer);

	        	new TimeController().doGet(request, response);

	        	verify(request, atLeast(1)).getParameter("value");
	        	writer.flush();
	        	assertTrue(stringWriter.toString().contains(api5));
	        	
	        }catch (Exception e) {
				e.printStackTrace();
			}
	}
}
