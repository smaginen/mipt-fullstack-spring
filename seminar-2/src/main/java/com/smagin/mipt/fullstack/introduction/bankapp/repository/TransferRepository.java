package com.smagin.mipt.fullstack.introduction.bankapp.repository;

import com.smagin.mipt.fullstack.introduction.bankapp.model.Account;
import com.smagin.mipt.fullstack.introduction.bankapp.model.Amount;

public interface TransferRepository {
	
	void transfer(Account accountA, Account accountB, Amount amount);
}
