package com.ustglobal.jdbcmoduletest.util;

import com.ustglobal.jdbcmoduletest.dao.ContactImplDao;

public class ContactManager {

	private ContactManager() {
		
	}
	
	public static ContactImplDao getContactDao() {
		return new ContactImplDao();
	}
}
