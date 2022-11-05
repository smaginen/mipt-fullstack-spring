package com.smagin.mipt.fullstack.patterns.adapter.pattern;

import com.smagin.mipt.fullstack.patterns.model.Account;

public interface PaymentGateway {
	void doPayment(Account account1, Account account2);
}
