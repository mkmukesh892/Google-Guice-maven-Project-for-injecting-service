package com.fico.guice.google_guice_xample;

import com.fico.guice.google_guice_xample.constant.CommunicationModel;

public interface CommunicationMode {
public CommunicationModel getMode();
public boolean sendMessage(String message);
}
