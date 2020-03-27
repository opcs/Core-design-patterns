package com.syn.dp.structural.proxy;

public class TestProxyPattern {

	public static void main(String[] args) {
		ProxyImage proxy = new ProxyImage();
		proxy.displayImage();
		
		ProxyImageCache proxyCache = new ProxyImageCache();
		proxyCache.displayImage();

	}

}
