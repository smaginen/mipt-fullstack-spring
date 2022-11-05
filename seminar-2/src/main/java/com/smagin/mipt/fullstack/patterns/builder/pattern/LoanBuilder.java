package com.smagin.mipt.fullstack.patterns.builder.pattern;

public interface LoanBuilder {
	void loanApply();
	void loanApproval();
	void loanSanction();
	Loan loanDisburse();
}
