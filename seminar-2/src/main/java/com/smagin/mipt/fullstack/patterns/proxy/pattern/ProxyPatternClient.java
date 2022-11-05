package com.smagin.mipt.fullstack.patterns.proxy.pattern;

import com.smagin.mipt.fullstack.patterns.model.Account;


public class ProxyPatternClient {

	public static void main(String[] args) {
		Account account = new ProxySavingAccount();
		account.accountType();
	}

}
