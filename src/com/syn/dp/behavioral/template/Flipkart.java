package com.syn.dp.behavioral.template;

public class Flipkart extends ProcessingOrder {

	@Override
	public void selectProduct() {
		System.out.println("------online shopping------");
		System.out.println("search for the relative product");
		System.out.println("Add to cart");
		System.out.println("Checkout");

	}

	@Override
	public void makePayment() {
		System.out.println("add address details");
		System.out.println("select mode of payment");
		System.out.println("make payment");

	}

	@Override
	public void deliver() {
		System.out.println("Your product will be delivered in 3-4 working days");
		System.out.println("Continue shopping");
		System.out.println("--------------------------------------");

	}

}
