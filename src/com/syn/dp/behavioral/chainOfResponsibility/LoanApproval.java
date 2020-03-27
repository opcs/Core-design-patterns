package com.syn.dp.behavioral.chainOfResponsibility;

public abstract class LoanApproval {

	protected LoanApproval nextLoanApproval;

	public void setNextLoanApproval(LoanApproval nextLoanApproval) {
		this.nextLoanApproval = nextLoanApproval;
	}

	public abstract void approveLoan(Loan loan);
	
	
}
