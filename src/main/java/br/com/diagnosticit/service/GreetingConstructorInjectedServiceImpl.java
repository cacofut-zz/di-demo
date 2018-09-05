/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 *
 * @author cristianoca
 */
//@Service
public class GreetingConstructorInjectedServiceImpl implements GreetingService{

    @Override
    public String sayHello() {
        return "Olá GreetingConstructorInjectedServiceImpl";
    }
    
    
}
