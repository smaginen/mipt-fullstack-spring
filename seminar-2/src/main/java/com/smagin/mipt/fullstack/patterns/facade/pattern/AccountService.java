package com.smagin.mipt.fullstack.patterns.facade.pattern;

import com.smagin.mipt.fullstack.patterns.model.Account;
import com.smagin.mipt.fullstack.patterns.model.SavingAccount;


public class AccountService {

	public static Account getAccount(String accountId) {
		return new SavingAccount();
	}
}
