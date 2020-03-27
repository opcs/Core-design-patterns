package com.syn.dp.behavioral.visitor;

public class CEO implements Visitor {

	private String ceoName;

	public CEO(String ceoName) {
		this.ceoName = ceoName;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	@Override
	public void visit(Visitable vis) {
		Employee emp = (Employee) vis;
		emp.setPerformanceStatus("Good");

		System.out.println("This is to Certify that " + emp.getName() + " performed " + emp.getPerformanceStatus() + " "
				+ " in his quarter year, this rating has been given by CEO " + this.getCeoName()
				+ " . Thank you and all the best for your future");

	}

}
