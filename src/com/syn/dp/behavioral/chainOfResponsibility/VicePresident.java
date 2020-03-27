package com.syn.dp.behavioral.chainOfResponsibility;

public class VicePresident extends LoanApproval{

	public void approveLoan(Loan loan) {
		System.out.println("approved by VP");
	}
}
