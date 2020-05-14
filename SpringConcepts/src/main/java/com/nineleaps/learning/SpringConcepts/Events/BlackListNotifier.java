package com.nineleaps.learning.SpringConcepts.Events;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;

public class BlackListNotifier {

	private String notificationAddress;

	public void setNotificationAddress(String notificationAddress) {
		this.notificationAddress = notificationAddress;
	}

	@Async

	@EventListener({ BlackListEvent.class })

	@Order(10)
	public void onApplicationEvent(BlackListEvent event) {
		System.out.println("Event Recieved from onApplicationEvent1...!!");
	}

	@EventListener({ BlackListEvent.class })

	@Order(1)
	public void onApplicationEvent2(BlackListEvent event) {
		System.out.println("Event Recieved from onApplicationEvent2...!!");
	}

	/*
	 * @EventListener public void
	 * onApplicationEvent3(EntityCreatedEvent<BlackListObject> event) {
	 * System.out.println("Event Recieved from onApplicationEvent3...!!"); }
	 */

}
