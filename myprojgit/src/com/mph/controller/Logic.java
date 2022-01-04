package com.mph.controller;

import java.util.Scanner;

import com.mph.model.Employee;

public class Logic {
	public class EmployeeController  {
		String ename;
		String sal ;
		public void addEmployee() {
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Last Name:");
		String lname = sc.next();
		emp.setEname(lname);
		}
	}
	}

