package com.ustglobal.jdbcmoduletest.contact;

import java.util.ArrayList;
import java.util.Scanner;

import com.ustglobal.jdbcmoduletest.dao.ContactIntfDao;
import com.ustglobal.jdbcmoduletest.dto.ContactInfo;
import com.ustglobal.jdbcmoduletest.util.ContactManager;

public class App {

	public static void main(String[] args) {
		System.out.println("Press 1 to show all contacts");
		System.out.println("Press 2 to search contact");
		System.out.println("Press 3 to operate on contact");

		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		switch(ch) {

		case 1:   ContactIntfDao dao = ContactManager.getContactDao();
		          ArrayList<ContactInfo> result = dao.showAllContacts();
		          for(ContactInfo bean : result) {
		        	  System.out.println("Name: "+bean.getName());
		        	  System.out.println("Number: "+bean.getNumber());
		        	  System.out.println("Group: "+bean.getGroup());
		          }
		          break;
			
		case 2:   ContactIntfDao dao2 = ContactManager.getContactDao();
		          String name = sc.next();
		          ContactInfo bean = dao2.searchContact(name);
		          if(bean!=null) {
		        	  System.out.println("Name: "+bean.getName());
		        	  System.out.println("Number: "+bean.getNumber());
		        	  System.out.println("Group: "+bean.getGroup());
		          }
		          System.out.println("Press 1 to call");
		  		System.out.println("Press 2 to message");
		  		System.out.println("Press 3 to go back to main menu");

		          int ch2 = sc.nextInt();
		          switch(ch2) {
		          
		          case 1 :  
		        
		          case 2 :
		        	  
		          case 3 :
		          }
		          break;
			
		case 3:

		}
	}
}
