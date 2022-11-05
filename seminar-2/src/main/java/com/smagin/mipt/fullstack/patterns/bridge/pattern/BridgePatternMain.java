package com.smagin.mipt.fullstack.patterns.bridge.pattern;

/**
 * 
 * Demonstration of bridge design pattern
 */
public class BridgePatternMain {

	public static void main(String[] args) {
		Bank icici = new IciciBank(new CurrentAccount());
		Account current = icici.openAccount();
		current.accountType();
		
		Bank hdfc = new HdfcBank(new SavingAccount());
		Account saving = hdfc.openAccount();
		saving.accountType();
	}

}
