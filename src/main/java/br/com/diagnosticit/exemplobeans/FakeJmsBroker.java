/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.exemplobeans;

/**
 *
 * @author cristiano
 */
public class FakeJmsBroker {
    
    private String userName;
    private String password;
    private String url;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "FakeJmsBroker{" + "userName=" + userName + ", password=" + password + ", url=" + url + '}';
    }
    
 
    
}
