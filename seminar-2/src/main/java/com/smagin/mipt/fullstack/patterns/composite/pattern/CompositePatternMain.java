package com.smagin.mipt.fullstack.patterns.composite.pattern;

import com.smagin.mipt.fullstack.patterns.model.CurrentAccount;
import com.smagin.mipt.fullstack.patterns.model.SavingAccount;


public class CompositePatternMain {

	public static void main(String[] args) {
		//Saving Accounts
		SavingAccount savingAccount1 = new SavingAccount();
		SavingAccount savingAccount2 = new SavingAccount();
		
		//Current Account
		CurrentAccount currentAccount1 = new CurrentAccount();
		CurrentAccount currentAccount2 = new CurrentAccount();
		
		//Composite Bank Account
		CompositeBankAccount compositeBankAccount1 = new CompositeBankAccount();
		CompositeBankAccount compositeBankAccount2 = new CompositeBankAccount();
		CompositeBankAccount compositeBankAccount = new CompositeBankAccount();
		
		//Composing the bank accounts
		compositeBankAccount1.add(savingAccount1);
		compositeBankAccount1.add(currentAccount1);
		
		compositeBankAccount2.add(currentAccount2);
		compositeBankAccount2.add(savingAccount2);
		
		compositeBankAccount.add(compositeBankAccount2);
		compositeBankAccount.add(compositeBankAccount1);
		
		compositeBankAccount.accountType();
	}

}
