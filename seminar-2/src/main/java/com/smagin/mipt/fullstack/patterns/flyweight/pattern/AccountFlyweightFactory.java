package com.smagin.mipt.fullstack.patterns.flyweight.pattern;

import java.util.HashMap;
import java.util.Map;

import com.smagin.mipt.fullstack.patterns.model.Account;
import com.smagin.mipt.fullstack.patterns.model.CurrentAccount;
import com.smagin.mipt.fullstack.patterns.model.SavingAccount;


public class AccountFlyweightFactory {
	private static final Map<String, Account> flyweight = new HashMap<String, Account>();

	   public static Account getAccount(String accountType) {
		   Account account = (Account)flyweight.get(accountType);

	      if(account == null) {
	    	  if("SAVING".equals(accountType)){
	    		  account = new SavingAccount();
	    	  }else if("CURRENT".equals(accountType)){
	    		  account = new CurrentAccount();
	    	  }
	    	  flyweight.put(accountType, account);
	      }
	      return account;
	   }
}
