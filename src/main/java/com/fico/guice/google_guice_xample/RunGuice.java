package com.fico.guice.google_guice_xample;

import java.util.Scanner;

import com.fico.guice.google_guice_xample.binding.AOPModule;
import com.fico.guice.google_guice_xample.modules.BasicModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class RunGuice 
{
    public static void main( String[] args )
    {
    	Injector injector = Guice.createInjector(new BasicModule(), new AOPModule());
        Communication comms = injector.getInstance(Communication.class);
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                System.exit(0);
            } else {
               comms.sendMessage(input);
            	
            }
            
        }
    }
}
