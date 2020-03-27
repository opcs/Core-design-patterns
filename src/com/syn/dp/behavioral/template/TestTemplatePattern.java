package com.syn.dp.behavioral.template;

public class TestTemplatePattern {

	public static void main(String[] args) {
		ProcessingOrder shopVisit = new ShopOffline();
		shopVisit.doShopping();
		
		ProcessingOrder onlineShopVisit = new Flipkart();
		onlineShopVisit.doShopping();

	}

}
