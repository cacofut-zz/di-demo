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
public class GreetingSpanishService implements GreetingService{

    private GreetingRepository greetingRepository;

    public GreetingSpanishService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
        
    @Override
    public String sayHello() {
        return this.greetingRepository.getSpanishGreeting();
    }
    
}
