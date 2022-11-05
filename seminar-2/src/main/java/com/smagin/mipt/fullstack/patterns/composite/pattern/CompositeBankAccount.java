package com.smagin.mipt.fullstack.patterns.composite.pattern;

import java.util.ArrayList;
import java.util.List;

import com.smagin.mipt.fullstack.patterns.model.Account;


public class CompositeBankAccount implements Account {
	
	//Collection of child accounts.
    private List<Account> childAccounts = new ArrayList<Account>();
    
	@Override
	public void accountType() {
		for (Account account : childAccounts) {
			account.accountType();
        }
	}
	
	//Adds the account to the composition.
    public void add(Account account) {
    	childAccounts.add(account);
    }

    //Removes the account from the composition.
    public void remove(Account account) {
    	childAccounts.remove(account);
    }
}
