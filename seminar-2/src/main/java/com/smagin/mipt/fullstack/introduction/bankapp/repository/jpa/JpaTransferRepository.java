package com.smagin.mipt.fullstack.introduction.bankapp.repository.jpa;

import com.smagin.mipt.fullstack.introduction.bankapp.model.Account;
import com.smagin.mipt.fullstack.introduction.bankapp.model.Amount;
import com.smagin.mipt.fullstack.introduction.bankapp.repository.TransferRepository;

public class JpaTransferRepository implements TransferRepository {

	@Override
	public void transfer(Account accountA, Account accountB, Amount amount) {
		System.out.println("Transfering amount from account A to B via JPA implementation");
	}

}
