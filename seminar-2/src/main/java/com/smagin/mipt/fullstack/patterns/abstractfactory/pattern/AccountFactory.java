package com.smagin.mipt.fullstack.patterns.abstractfactory.pattern;

import com.smagin.mipt.fullstack.patterns.model.Account;
import com.smagin.mipt.fullstack.patterns.model.Bank;
import com.smagin.mipt.fullstack.patterns.model.CurrentAccount;
import com.smagin.mipt.fullstack.patterns.model.SavingAccount;


public class AccountFactory extends AbstractFactory {
	final String CURRENT_ACCOUNT = "CURRENT";
	final String SAVING_ACCOUNT  = "SAVING";
	
	@Override
	Bank getBank(String bankName) {
		return null;
	}

	//use getAccount method to get object of type Account   
	//It is factory method for object of type Account
	@Override
    public Account getAccount(String accountType){  
    	if(CURRENT_ACCOUNT.equals(accountType)) {  
    		return new CurrentAccount();  
    	}else if(SAVING_ACCOUNT.equals(accountType)){  
    		return new SavingAccount();  
    	}   
    	return null;  
    }

}
