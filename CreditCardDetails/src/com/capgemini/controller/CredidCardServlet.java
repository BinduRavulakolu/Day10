package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/creditCard")
public class CredidCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CredidCardServlet() {
        super();
       
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		String name=request.getParameter("username");
		String creditNo=request.getParameter("number");
		long cardNo=(long)Integer.parseInt(creditNo);
		String cv=request.getParameter("cvv");
		int cvv=Integer.parseInt(cv);
		String month=request.getParameter("month");
		int mm=Integer.parseInt(month);
		String year=request.getParameter("year");
		int yy=Integer.parseInt(year);
		
		out.println("Card Holder name: "+name+"<br>Card number: "+cardNo+"<br>cvv: "+cvv+"<br>month and year:"+mm+" "+yy);
		
	out.close();	
	}
   



}
