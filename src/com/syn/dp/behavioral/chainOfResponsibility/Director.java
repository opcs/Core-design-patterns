package com.syn.dp.behavioral.chainOfResponsibility;

public class Director extends LoanApproval{

	public void approveLoan(Loan loan) {
		if(loan.getAmount()<500000) {
			System.out.println("approved by Director");
		}else {
			System.out.println("passed to VP for approval");
			nextLoanApproval.approveLoan(loan);
		}
	}
	
}
