package com.syn.dp.behavioral.chainOfResponsibility;

public class TestChainOfResponsibility {

	public static void main(String[] args) {
		LoanApproval m = new Manager();
		LoanApproval d = new Director();
		LoanApproval vp = new VicePresident();
		
		m.setNextLoanApproval(d);
		d.setNextLoanApproval(vp);
		
		m.approveLoan(new Loan(1000000));

	}

}
