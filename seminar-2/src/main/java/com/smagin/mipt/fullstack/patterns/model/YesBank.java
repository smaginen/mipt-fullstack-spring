package com.smagin.mipt.fullstack.patterns.model;


public class YesBank implements Bank{

	@Override
	public void bankName() {
		System.out.println("Yes Bank Pvt. Ltd.");
	}

}
