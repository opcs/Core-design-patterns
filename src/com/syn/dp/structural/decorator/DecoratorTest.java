package com.syn.dp.structural.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		System.out.println("Test 1");
        Phone phone = new AndroidPhone(new BasicPhone());
        phone.printModel();
        System.out.println("Test 2");
        Phone phone1 = new IPhone(phone);
        phone1.printModel();

	}
}
