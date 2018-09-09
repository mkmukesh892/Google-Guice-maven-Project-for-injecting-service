package com.fico.guice.google_guice_xample;

import java.util.Date;
import java.util.logging.Logger;

import com.google.inject.Inject;

public class Communication {
final Date start= new Date();
@Inject
private Logger logger;
@Inject
private DefaultCommunicator communicator;

public Communication(Boolean keepRecords) {
	if(keepRecords) {
		System.out.println("Keeping records");
	}
}
public boolean sendMessage(String message) {
	return communicator.sendMessage(message);
}
public DefaultCommunicator getCommunicator() {
	return this.communicator;
}
}