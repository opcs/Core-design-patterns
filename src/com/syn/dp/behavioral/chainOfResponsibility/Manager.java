package com.syn.dp.behavioral.chainOfResponsibility;

public class Manager extends LoanApproval{


	public void approveLoan(Loan loan) {
		if(loan.getAmount()<100000) {
			System.out.println("approved by manager");
		}else {
			System.out.println("passed to Director for approval");
			nextLoanApproval.approveLoan(loan);
		}
	}
	
}
