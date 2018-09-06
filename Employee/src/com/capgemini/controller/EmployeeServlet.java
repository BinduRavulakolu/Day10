package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.domain.Employee;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	   private ArrayList<Employee> employee=new ArrayList<>();
	   
	   @Override
	public void init() throws ServletException {
		   employee.add(new Employee(1223,"Raju",15000.0,"deptA"));
		   employee.add(new Employee(1243,"Ravi",16000.0,"deptB"));
		   employee.add(new Employee(1253,"Ramu",18000.0,"deptC"));
		   employee.add(new Employee(1226,"Seetha",17000.0,"deptD"));
	}
	  
    public EmployeeServlet() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		String employeeNumber=request.getParameter("username");
		int empnumber=Integer.parseInt(employeeNumber);
		for(Employee e:employee)
		if(e.getEmployeeId()==empnumber)
		{
//			out.println("<style>table,th,td {border:1px solid black; border-collapse: collapse;}</style>");
		        out.println("EmployeeName: "+e.getEmployeeName()+" EmployeeSalary: "+e.getSalary()+" Department: "+e.getDeptname());
		}
	}
}
