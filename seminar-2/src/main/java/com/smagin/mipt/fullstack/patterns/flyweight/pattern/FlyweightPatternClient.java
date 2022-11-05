package com.smagin.mipt.fullstack.patterns.flyweight.pattern;

import com.smagin.mipt.fullstack.patterns.model.Account;


public class FlyweightPatternClient {

	public static void main(String[] args) {
		for(int i=0; i < 10; ++i) {
			Account account = (Account)AccountFlyweightFactory.getAccount("SAVING");
			account.accountType();
		}
	}
}
