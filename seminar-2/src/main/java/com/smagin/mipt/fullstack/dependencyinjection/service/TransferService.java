package com.smagin.mipt.fullstack.dependencyinjection.service;

import com.smagin.mipt.fullstack.dependencyinjection.model.Amount;

public interface TransferService {
	
	void transferAmmount(Long a, Long b, Amount amount);
}
