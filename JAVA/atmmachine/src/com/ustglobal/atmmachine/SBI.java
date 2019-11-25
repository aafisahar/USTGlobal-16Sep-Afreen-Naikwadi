package com.ustglobal.atmmachine;

public class SBI implements ATM {

	@Override
	public void validateCard() {
		System.out.println("Sbi validate card");
	}

	@Override
	public void getInfo() {
		System.out.println("Sbi get info");
	}

}
