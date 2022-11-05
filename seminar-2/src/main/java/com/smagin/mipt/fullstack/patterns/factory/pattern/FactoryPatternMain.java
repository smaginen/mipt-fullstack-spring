package com.smagin.mipt.fullstack.patterns.factory.pattern;

import com.smagin.mipt.fullstack.patterns.model.Account;


public class FactoryPatternMain {

	public static void main(String[] args) {
		
		AccountFactory accountFactory = new AccountFactory();
		
		//get an object of SavingAccount and call its accountType() method.
		Account savingAccount = accountFactory.getAccount("SAVING");

		//call accountType method of SavingAccount
		savingAccount.accountType();

		//get an object of CurrentAccount and call its accountType() method.
		Account currentAccount = accountFactory.getAccount("CURRENT");

		//call accountType method of CurrentAccount
		currentAccount.accountType();

	}

}
