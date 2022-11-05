package com.smagin.mipt.fullstack.introduction.bankapp.repository;

import com.smagin.mipt.fullstack.introduction.bankapp.model.Account;
import org.springframework.stereotype.Component;

@Component
public interface AccountRepository {
	
	Account findByAccountId(Long accountId);
}
