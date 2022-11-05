package com.smagin.mipt.fullstack.aspects.service;


public interface TransferService {
	
	void transfer(String accountA, String accountB, Long amount);
	
}
