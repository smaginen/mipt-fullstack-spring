package com.smagin.mipt.fullstack.patterns.proxy.pattern;

import com.smagin.mipt.fullstack.patterns.model.Account;
import com.smagin.mipt.fullstack.patterns.model.SavingAccount;


public class ProxySavingAccount implements Account{
	
	private Account savingAccount;
	
	@Override
	public void accountType() {
		if(savingAccount == null){
			savingAccount = new SavingAccount();
		}
		savingAccount.accountType();
	}

}
