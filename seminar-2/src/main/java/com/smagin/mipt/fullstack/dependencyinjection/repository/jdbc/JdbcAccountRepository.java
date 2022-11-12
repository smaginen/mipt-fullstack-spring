package com.smagin.mipt.fullstack.dependencyinjection.repository.jdbc;

import org.springframework.stereotype.Repository;

import com.smagin.mipt.fullstack.dependencyinjection.model.Account;
import com.smagin.mipt.fullstack.dependencyinjection.model.Amount;
import com.smagin.mipt.fullstack.dependencyinjection.repository.AccountRepository;
@Repository
public class JdbcAccountRepository implements AccountRepository {

	@Override
	public Account findByAccountId(Long accountId) {
		return new Account(accountId, "Ivan Ivanov", new Amount(3000.0));
	}

}
