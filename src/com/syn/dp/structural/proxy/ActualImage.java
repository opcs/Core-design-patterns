package com.syn.dp.structural.proxy;

public class ActualImage implements Image{

	@Override
	public void displayImage() {
		System.out.println("This is real image . . .");
		
	}

}
