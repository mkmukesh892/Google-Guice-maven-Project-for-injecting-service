package com.fico.guice.google_guice_xample.modules;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.fico.guice.google_guice_xample.Communication;
import com.fico.guice.google_guice_xample.CommunicationMode;
import com.fico.guice.google_guice_xample.DefaultCommunicator;
import com.fico.guice.google_guice_xample.EmailCommunicationMode;
import com.fico.guice.google_guice_xample.IMCommunicationMode;
import com.fico.guice.google_guice_xample.SMSCommunicationMode;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class BasicModule extends AbstractModule {

	@Override
	protected void configure() {
		try {
            bind(Communication.class).toConstructor(Communication.class.getConstructor(Boolean.class));
            bind(Boolean.class).toInstance(true);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(com.fico.guice.google_guice_xample.binding.BasicModule.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(com.fico.guice.google_guice_xample.binding.BasicModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        bind(DefaultCommunicator.class).annotatedWith(Names.named("AnotherCommunicator")).to(DefaultCommunicator.class).asEagerSingleton();

        bind(CommunicationMode.class).annotatedWith(Names.named("IMComms")).to(IMCommunicationMode.class);
        bind(CommunicationMode.class).annotatedWith(Names.named("EmailComms")).to(EmailCommunicationMode.class);
        bind(CommunicationMode.class).annotatedWith(Names.named("SMSComms")).to(SMSCommunicationMode.class);
    }		
}

