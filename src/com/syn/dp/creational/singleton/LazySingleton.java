package com.syn.dp.creational.singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private static volatile LazySingleton instance=null;
	
	private LazySingleton() {
	}
	
	public static LazySingleton getInstance() {
		if(instance==null) {
			synchronized(LazySingleton.class) {
				if(instance==null) {
					instance= new LazySingleton();
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve() {
		return getInstance();
	}
}
