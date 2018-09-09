package com.fico.guice.google_guice_xample.binding;

import com.fico.guice.google_guice_xample.aop.MessageLogger;
import com.fico.guice.google_guice_xample.aop.MessageSentLoggable;
import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class AOPModule extends AbstractModule {

	@Override
	protected void configure() {
		 bindInterceptor(Matchers.any(),
	                Matchers.annotatedWith(MessageSentLoggable.class),
	                new MessageLogger()
	        );

	}

}
