package com.ustglobal.exception.customizecheckedexception;

public class InvalidAmountException extends Exception {

	private String msg = "Daily limit is 40000";
	
	public String getMessage() {
      return msg;
	}
}
