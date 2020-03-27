package com.syn.dp.structural.proxy;


// protection proxy
public class ProxyImage implements Image{
	
	ActualImage realImage;

	@Override
	public void displayImage() {
		System.out.println("Checking the access rights . . .");
		System.out.println("Everything is good . . .");
		realImage= new ActualImage();
		realImage.displayImage();
		
	}

}
