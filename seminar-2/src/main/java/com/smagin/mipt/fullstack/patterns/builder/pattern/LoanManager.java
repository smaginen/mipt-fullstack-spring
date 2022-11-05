package com.smagin.mipt.fullstack.patterns.builder.pattern;


public class LoanManager {
	private LoanBuilder loanBuilder;

	public LoanManager(LoanBuilder loanBuilder) {
		super();
		this.loanBuilder = loanBuilder;
	}
	
	public Loan buildLoan(){
		this.loanBuilder.loanApply();
		this.loanBuilder.loanApproval();
		this.loanBuilder.loanSanction();
		return this.loanBuilder.loanDisburse();
	}
}
