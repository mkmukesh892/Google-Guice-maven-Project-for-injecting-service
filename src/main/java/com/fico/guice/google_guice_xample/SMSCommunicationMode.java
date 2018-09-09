package com.fico.guice.google_guice_xample;

import java.util.logging.Logger;

import com.fico.guice.google_guice_xample.aop.MessageSentLoggable;
import com.fico.guice.google_guice_xample.constant.CommunicationModel;
import com.google.inject.Inject;

public class SMSCommunicationMode implements CommunicationMode {

	@Inject
    private Logger logger;

    public CommunicationModel getMode() {
        return CommunicationModel.SMS;
    }

    @MessageSentLoggable
    public boolean sendMessage(String message) {
        logger.info("SMS message sent");
        return true;
    }

}
