package com.smagin.mipt.fullstack.dependencyinjection.repository;

import com.smagin.mipt.fullstack.dependencyinjection.model.Account;
import com.smagin.mipt.fullstack.dependencyinjection.model.Amount;

public interface TransferRepository {
	
	void transfer(Account accountA, Account accountB, Amount amount);
}
