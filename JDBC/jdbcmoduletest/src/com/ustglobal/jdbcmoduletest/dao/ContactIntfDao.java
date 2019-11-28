package com.ustglobal.jdbcmoduletest.dao;

import java.util.ArrayList;

import com.ustglobal.jdbcmoduletest.dto.ContactInfo;

public interface ContactIntfDao {

	public ArrayList<ContactInfo> showAllContacts();
	public ContactInfo searchContact(String name);
	public void operateOnContact(int n);
	
}
