package com.ustglobal.empapp;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Press 1 to show all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search single employee data");
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch) {
		
		case 1:
			EmployeeDAO dao = EmployeeManager.getEmployeeDEO();
			ArrayList<EmployeeBean> result = dao.getAllEmployeeData();
			
			for(EmployeeBean bean : result) {
				System.out.println("Id: "+bean.getId());
				System.out.println("Name: "+bean.getName());
				System.out.println("Salary: "+bean.getSal());
				System.out.println("Gender: "+bean.getGender());
			}
		    
			break;
			
		case 2:
			EmployeeDAO dao2 = EmployeeManager.getEmployeeDEO();
			System.out.println("Enter id: ");
			int id1 = sc.nextInt();
			System.out.println("Enter name: ");
			String name = sc.next();
			System.out.println("Enter salary: ");
			int sal = sc.nextInt();
			System.out.println("Enter gender: ");
			String gender = sc.next();
			dao2.insertEmployeeData(id1, name, sal, gender);
				
			break;
		case 3:
			EmployeeDAO dao3 = EmployeeManager.getEmployeeDEO();
			System.out.println("Enter id: ");
			int id2 = sc.nextInt();
			System.out.println("Enter name: ");
			String name2 = sc.next();
			System.out.println("Enter salary: ");
			int sal2 = sc.nextInt();
			System.out.println("Enter gender: ");
			String gender2 = sc.next();
			dao3.updateEmployeeData(id2, name2, sal2, gender2);
				
			break;
		case 4: 
			EmployeeDAO dao4 = EmployeeManager.getEmployeeDEO();
			System.out.println("Enter id: ");
			int id3 = sc.nextInt();
			dao4.deleteEmployeeData(id3);
			break;
			
		case 5:
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDEO();
			int id = sc.nextInt();
			EmployeeBean bean = dao5.searchEmployeeData(id);
			if(bean!=null) {
				System.out.println("Id: "+bean.getId());
				System.out.println("Name: "+bean.getName());
				System.out.println("Salary: "+bean.getSal());
				System.out.println("Gender: "+bean.getGender());
			} else {
				System.out.println("No data found");
			}
			break;
		}
		
		}
		
	}
