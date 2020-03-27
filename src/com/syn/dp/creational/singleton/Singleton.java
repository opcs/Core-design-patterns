package com.syn.dp.creational.singleton;

public class Singleton {
	
	private static volatile Singleton instance=null;
	
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized(Singleton.class) {
				if(instance==null) {
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
	
	public Object readResolve() {
		return getInstance();
	}
	

	public static void main(String[] args) {
		Singleton s1 = getInstance();
		Singleton s2 = getInstance();
		
		if(s1==s2) {
			System.out.println("Singleton - true");
		}else {
			System.out.println("Singleton - false");
		}

	}

}
