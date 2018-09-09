package com.fico.guice.google_guice_xample;

import com.fico.guice.google_guice_xample.aop.MessageSentLoggable;
import com.fico.guice.google_guice_xample.constant.CommunicationModel;

public class EmailCommunicationMode implements CommunicationMode {

	public CommunicationModel getMode() {
        return CommunicationModel.EMAIL;
    }

    @MessageSentLoggable
    public boolean sendMessage(String Message) {
        // throw new UnsupportedOperationException("Not supported yet."); 
    	//To change body of generated methods, choose Tools | Templates.
    	return true;
    }

}
