package com.smagin.mipt.fullstack.patterns.decorator.pattern;


public class CurrentAccount implements Account{
	
	@Override
	public String getTotalBenefits() {
		return "There is no withdrwal limit for current account";
	}

}
