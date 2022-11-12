package com.smagin.mipt.fullstack.scopes.repository;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.smagin.mipt.fullstack.scopes.model.Account;
import com.smagin.mipt.fullstack.scopes.model.Amount;
import com.smagin.mipt.fullstack.scopes.repository.AccountRepository;
@Repository
public class JdbcAccountRepository implements AccountRepository {

	@Override
	public Account findByAccountId(Long accountId) {
		return new Account(accountId, "Ivan Ivanov", new Amount(3000.0));
	}
	
	@PostConstruct
	void populateCache(){
		System.out.println("Called populateCache() method");
	}
}
