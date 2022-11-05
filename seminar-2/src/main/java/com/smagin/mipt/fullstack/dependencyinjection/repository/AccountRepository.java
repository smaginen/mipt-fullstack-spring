package com.smagin.mipt.fullstack.dependencyinjection.repository;

import com.smagin.mipt.fullstack.dependencyinjection.model.Account;

public interface AccountRepository {
	
	Account findByAccountId(Long accountId);
}
