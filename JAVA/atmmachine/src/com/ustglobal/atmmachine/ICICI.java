package com.ustglobal.atmmachine;

public class ICICI implements ATM {
	
	@Override
	public void validateCard() {
        System.out.println("Icici validate card");		
	}

	@Override
	public void getInfo() {
		 System.out.println("Icici get info");			
	}


}
