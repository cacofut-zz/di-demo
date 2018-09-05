/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 *
 * @author cristianoca
 */
//@Service
public class GreetingGetterInjectedServiceImpl implements GreetingService{

    @Override
    public String sayHello() {
        return "Olá GreetingGetterInjectedServiceImpl";
    }
    
}
