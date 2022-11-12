package com.smagin.mipt.fullstack.introduction.bankapp.repository.jdbc;

import com.smagin.mipt.fullstack.introduction.bankapp.model.Account;
import com.smagin.mipt.fullstack.introduction.bankapp.model.Amount;
import com.smagin.mipt.fullstack.introduction.bankapp.repository.AccountRepository;

public class JdbcAccountRepository implements AccountRepository {

	@Override
	public Account findByAccountId(Long accountId) {
		return new Account(accountId, "Ivan Ivanov", new Amount(3000.0));
	}

}
