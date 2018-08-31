/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author cristianoca
 */
public class PropertyInjectedControllerTest {
    
    private PropertyInjectedController property;
    
    @Before
    public void setUp() throws Exception {       
        this.property = new PropertyInjectedController();
        
    }
    
    @Test
    public void testar(){        
        Assert.assertEquals( "Olá GreetingPropertyInjectedServiceImpl", this.property.sayHello() );
    }
}
