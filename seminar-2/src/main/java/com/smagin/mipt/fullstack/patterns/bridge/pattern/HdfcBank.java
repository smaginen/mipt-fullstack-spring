package com.smagin.mipt.fullstack.patterns.bridge.pattern;

/**
 * 
 * Refine abstraction 2 in bridge pattern
 */
public class HdfcBank extends Bank {

	public HdfcBank(Account account) {
		super(account);
	}
	@Override
	Account openAccount() {
		System.out.print("Open your account with HDFC Bank");
		return account;
	}

}
