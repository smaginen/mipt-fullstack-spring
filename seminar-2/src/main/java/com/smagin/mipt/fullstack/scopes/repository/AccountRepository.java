package com.smagin.mipt.fullstack.scopes.repository;

import com.smagin.mipt.fullstack.scopes.model.Account;

public interface AccountRepository {
	
	Account findByAccountId(Long accountId);
}
