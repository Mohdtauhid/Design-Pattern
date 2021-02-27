package com.craterzone.singleton;

public class Main {

	public static void main(String[] args) {

		Singleton object1 = Singleton.getInstance();

		Singleton object2 = Singleton.getInstance();
		
		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());
		
	}

}
