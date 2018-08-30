/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.controller;

import br.com.diagnosticit.service.GreetingService;

/**
 *
 * @author cristianoca
 */
public class GetterInjectedController {
    
    private GreetingService greetingService;
    
    public String sayHello(){
        return greetingService.sayHello();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    
}
