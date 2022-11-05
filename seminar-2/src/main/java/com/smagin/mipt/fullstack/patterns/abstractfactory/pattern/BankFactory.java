package com.smagin.mipt.fullstack.patterns.abstractfactory.pattern;

import com.smagin.mipt.fullstack.patterns.model.Account;
import com.smagin.mipt.fullstack.patterns.model.Bank;
import com.smagin.mipt.fullstack.patterns.model.ICICIBank;
import com.smagin.mipt.fullstack.patterns.model.YesBank;


public class BankFactory extends AbstractFactory {
	final String ICICI_BANK = "ICICI";
	final String YES_BANK   = "YES";
	
	//use getBank method to get object of name bank   
	//It is factory method for object of name bank
	@Override
	Bank getBank(String bankName) {
		if(ICICI_BANK.equalsIgnoreCase(bankName)){  
			return new ICICIBank();  
		} else if(YES_BANK.equalsIgnoreCase(bankName)){  
			return new YesBank();  
		}  
		return null;
	}

	@Override
	Account getAccount(String accountType) {
		return null;
	}

}
