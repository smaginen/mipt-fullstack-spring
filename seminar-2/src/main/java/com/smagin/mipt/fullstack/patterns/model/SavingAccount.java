package com.smagin.mipt.fullstack.patterns.model;


public class SavingAccount implements Account{

	@Override
	public void accountType() {
		System.out.println("SAVING ACCOUNT");
	}

}
