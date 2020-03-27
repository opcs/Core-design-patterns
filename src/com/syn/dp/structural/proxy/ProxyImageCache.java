package com.syn.dp.structural.proxy;


// remote proxy
public class ProxyImageCache implements Image{
	
	ActualImage realImage;

	@Override
	public void displayImage() {
		// check if object is there in cache... else fetch the new object and send
		System.out.println("Object is not there in cache . . .");

		realImage= new ActualImage();
		realImage.displayImage();
		
	}

}
