package com.smagin.mipt.fullstack.patterns.model;


public class CurrentAccount implements Account {

	@Override
	public void accountType() {
		System.out.println("CURRENT ACCOUNT");
	}

}
