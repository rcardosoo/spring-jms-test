package br.com.novio.jmstest.messaging;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import br.com.novio.jmstest.model.Notification;

@Component
public class Receiver {

	@JmsListener(destination = "notificationbox", containerFactory = "myFactory")
	public void receiveMessage(Notification notification) {
		System.out.println("Received <" + notification + ">");
	}
}
