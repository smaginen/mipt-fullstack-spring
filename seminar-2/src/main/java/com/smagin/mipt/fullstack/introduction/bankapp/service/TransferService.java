package com.smagin.mipt.fullstack.introduction.bankapp.service;

import com.smagin.mipt.fullstack.introduction.bankapp.model.Amount;

public interface TransferService {
	
	void transferAmmount(Long a, Long b, Amount amount);
}
