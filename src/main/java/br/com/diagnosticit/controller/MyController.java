/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.controller;

import org.springframework.stereotype.Controller;

/**
 *
 * @author cristianoca
 */
@Controller
public class MyController {
    
    public String hello(){
        System.out.println("Olá Mundo");
        return "foo";
    }
}
