package com.smagin.mipt.fullstack.dependencyinjection.repository.jdbc;

import org.springframework.stereotype.Repository;

import com.smagin.mipt.fullstack.dependencyinjection.model.Account;
import com.smagin.mipt.fullstack.dependencyinjection.model.Amount;
import com.smagin.mipt.fullstack.dependencyinjection.repository.TransferRepository;
@Repository
public class JdbcTransferRepository implements TransferRepository {

	@Override
	public void transfer(Account accountA, Account accountB, Amount amount) {
		System.out.println("Transfering amount from account A to B via JDBC implementation");
	}

}
