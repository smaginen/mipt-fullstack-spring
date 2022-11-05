package com.smagin.mipt.fullstack.factorybean.service;

import com.smagin.mipt.fullstack.factorybean.repository.IAccountRepository;


public class TransferService {
	IAccountRepository accountRepository;
	public TransferService(IAccountRepository accountRepository){
		this.accountRepository = accountRepository;
	}
	public void transfer(String accountA, String accountB, Double amount){
		System.out.println("Amount has been tranferred");
	}
}
