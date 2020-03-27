package com.syn.dp.behavioral.template;

public abstract class ProcessingOrder {
	abstract public void selectProduct();
	abstract public void makePayment();
	abstract public void deliver();
	
	public final void doShopping() {
		selectProduct();
		makePayment();
		deliver();
		
	}

}
