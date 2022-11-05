package com.smagin.mipt.fullstack.introduction.bankapp.repository.jdbc;

import com.smagin.mipt.fullstack.introduction.bankapp.model.Account;
import com.smagin.mipt.fullstack.introduction.bankapp.model.Amount;
import com.smagin.mipt.fullstack.introduction.bankapp.repository.TransferRepository;

public class JdbcTransferRepository implements TransferRepository {

	@Override
	public void transfer(Account accountA, Account accountB, Amount amount) {
		System.out.println("Transfering amount from account A to B via JDBC implementation");
	}

}
