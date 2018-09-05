/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.controller;

import br.com.diagnosticit.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 *
 * @author cristianoca
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    //@Qualifier("greetingPropertyInjectedServiceImpl")
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
    
           
}
