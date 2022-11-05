package com.smagin.mipt.fullstack.patterns.abstractfactory.pattern;


public class FactoryProducer {
	final static String BANK    = "BANK";
	final static String ACCOUNT = "ACCOUNT";
	
	public static AbstractFactory getFactory(String factory){
		if(BANK.equalsIgnoreCase(factory)){
			return new BankFactory();
		}else if(ACCOUNT.equalsIgnoreCase(factory)){
			return new AccountFactory();
		}
		return null;
	}
}
