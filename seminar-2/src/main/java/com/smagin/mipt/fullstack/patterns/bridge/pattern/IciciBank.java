package com.smagin.mipt.fullstack.patterns.bridge.pattern;

/**
 * 
 * Refine abstraction 1 in bridge pattern
 */
public class IciciBank extends Bank {

	public IciciBank(Account account) {
		super(account);
	}

	@Override
	Account openAccount() {
		System.out.print("Open your account with ICICI Bank");
		return account;
	}

}
