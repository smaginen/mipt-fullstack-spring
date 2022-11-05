package com.smagin.mipt.fullstack.patterns.facade.pattern;

import com.smagin.mipt.fullstack.patterns.model.Account;


public class TransferService {

	public static void transfer(int amount, Account fromAccount, Account toAccount) {
		System.out.println("Transfering Money");
	}
}
