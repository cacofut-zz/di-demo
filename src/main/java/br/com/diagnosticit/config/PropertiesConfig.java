/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.config;

import br.com.diagnosticit.exemplobeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.PropertiesPropertySource;

/**
 *
 * @author cristiano
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertiesConfig {
    
    @Value("${diagnosticit.username}")
    private String username;
    
    @Value("${diagnosticit.password}")
    private String password;
    
    @Value("${diagnosticit.url}")
    private String url;
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer phc = new PropertySourcesPlaceholderConfigurer();
        return phc;
    }
    
    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fds = new FakeDataSource();
        fds.setUserName(username);
        fds.setPassword(password);
        fds.setUrl(url);
        return fds;
    }
    
}
