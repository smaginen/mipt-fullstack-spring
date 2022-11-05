package com.smagin.mipt.fullstack.patterns.abstractfactory.pattern;

import com.smagin.mipt.fullstack.patterns.model.Account;
import com.smagin.mipt.fullstack.patterns.model.Bank;


public abstract class AbstractFactory {
	
	abstract Bank getBank(String bankName);
	
	abstract Account getAccount(String accountType);
}
