package com.smagin.mipt.fullstack.introduction.bankapp.repository;

import com.smagin.mipt.fullstack.introduction.bankapp.model.Account;

public interface AccountRepository {
	
	Account findByAccountId(Long accountId);
}
