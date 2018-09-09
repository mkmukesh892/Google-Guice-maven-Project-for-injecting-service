package com.fico.guice.google_guice_xample.constant;

public enum CommunicationModel {
EMAIL("Email"), SMS("SMS"), IM("IM"), PHONE("phone");
	final String name;
	private CommunicationModel(String name) {
		this.name = name;
	}
}
