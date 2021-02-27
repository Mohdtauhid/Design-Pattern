package com.craterzone.Factory;

public class Main {
	public static void main(String[] args) {
		Notification notification1 = Factory.createNotification("SMS");
		notification1.notifyUser();
		Notification notification2 = Factory.createNotification("PUSH");
		notification2.notifyUser();
		Notification notification3 = Factory.createNotification("EMAIL");
		notification3.notifyUser();
	}
}
