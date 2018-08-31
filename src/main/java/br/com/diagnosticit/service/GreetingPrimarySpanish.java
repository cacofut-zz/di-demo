/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 *
 * @author cristianoca
 */
@Service
@Primary
@Profile("es")
public class GreetingPrimarySpanish implements GreetingService{

    @Override
    public String sayHello() {
        return "Primary Spanish";
    }
    
}
