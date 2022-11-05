package com.smagin.mipt.fullstack.patterns.facade.pattern;


public class FacadePatternClient {
	public static void main(String[] args) {
		BankingServiceFacade serviceFacade = new BankingServiceFacadeImpl();
		serviceFacade.moneyTransfer();
	}

}
