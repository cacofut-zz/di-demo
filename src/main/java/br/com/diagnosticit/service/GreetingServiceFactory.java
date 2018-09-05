/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.service;

/**
 *
 * @author cristianoca
 */
public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
    
    public GreetingService createGreetingService( String lang ){
        switch( lang ){
            case "en" :
                return new GreetingPrimary(greetingRepository);
            case "de" :
                return new GreetingGermanService(greetingRepository);
            case "es" :
                return new GreetingSpanishService(greetingRepository);
            default:               
                return new GreetingPrimary(greetingRepository);
        }
    }
}
