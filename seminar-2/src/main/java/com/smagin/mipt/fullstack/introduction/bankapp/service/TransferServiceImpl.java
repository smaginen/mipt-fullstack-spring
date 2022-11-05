package com.smagin.mipt.fullstack.introduction.bankapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.smagin.mipt.fullstack.introduction.bankapp.model.Account;
import com.smagin.mipt.fullstack.introduction.bankapp.model.Amount;
import com.smagin.mipt.fullstack.introduction.bankapp.repository.AccountRepository;
import com.smagin.mipt.fullstack.introduction.bankapp.repository.TransferRepository;
@Component
public class TransferServiceImpl implements TransferService {
	@Value("read properties")

	AccountRepository accountRepository;
	
	TransferRepository transferRepository;
	
	public TransferServiceImpl(AccountRepository accountRepository, TransferRepository transferRepository) {
		super();
		this.accountRepository = accountRepository;
		this.transferRepository = transferRepository;
	}

	@Override
	public void transferAmmount(Long a, Long b, Amount amount) {
		Account accountA = accountRepository.findByAccountId(a);
		Account accountB = accountRepository.findByAccountId(b);
		transferRepository.transfer(accountA, accountB, amount);
	}

}
