package com.ustglobal.jdbctest.dao;

import com.ustglobal.jdbctest.dto.ContactInfo;

public interface ContactIntf {

	public ContactInfo showAllContacts();
	public ContactInfo searchContact(String name);
	public void operateOnContact();
}
