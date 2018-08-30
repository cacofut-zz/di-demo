/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit;

/**
 *
 * @author cristianoca
 */
public class LoginController {
    
    private Login login;
    
    private String input; 
    private String senha; 
    private String botaoEntrar;
    
    public LoginController(Login login) {
        this.login = login;
    }
    
    public void eventodoBotao(){
        String user = input;
        login.setUsuario(user);
        updateView();
        
    }
    
    public void updateView(){
        
    }
    
}
