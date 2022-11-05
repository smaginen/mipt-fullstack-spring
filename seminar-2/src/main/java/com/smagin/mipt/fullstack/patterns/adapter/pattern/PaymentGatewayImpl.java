package com.smagin.mipt.fullstack.patterns.adapter.pattern;

import com.smagin.mipt.fullstack.patterns.model.Account;


public class PaymentGatewayImpl implements PaymentGateway{
	@Override
	public void doPayment(Account account1, Account account2){
		System.out.println("Do payment using Payment Gateway");
	}
	
}
