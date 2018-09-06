package com.capgemini.employeeapp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.employeeapp.dao.EmployeeDeo;
import com.capgemini.employeeapp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDeo {
	private List<Employee> employees=new ArrayList<>();
	
@Override
public List<Employee> findAllEmployees() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Employee findEmployeeById(int employeeId) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public boolean deleteEmployee(int employeeid) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean addEmployee(Employee employee) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public Employee updateEmployee(Employee employee) {
	// TODO Auto-generated method stub
	return null;
}

}
