package com.craterzone.singleton;

public class Singleton {
	private static Singleton obj;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (obj == null) {
			synchronized (Singleton.class) {
				if (obj == null) {
					obj = new Singleton(); 
				}
			}
		}
		return obj;
	}

	public void doSomething() {
		System.out.println("I am Singleton Class");
	}
}
