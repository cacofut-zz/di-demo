/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.config;

import br.com.diagnosticit.exemplobeans.FakeDataSource;
import br.com.diagnosticit.exemplobeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.PropertiesPropertySource;

/**
 *
 * @author cristiano
 */
@Configuration
@PropertySource("classpath:datasource.properties")
@PropertySources({
    @PropertySource("classpath:datasource.properties"),
    @PropertySource("classpath:jms.properties")
})
public class PropertiesConfig {
    
    @Value("${diagnosticit.username}")
    private String username;
    
    @Value("${diagnosticit.password}")
    private String password;
    
    @Value("${diagnosticit.url}")
    private String url;
    
    @Value("${diagnosticit.jms.username}")
    private String jmsUsername;
    
    @Value("${diagnosticit.jms.password}")
    private String jmsPassword;
    
    @Value("${diagnosticit.jms.url}")
    private String jmsUrl;
    
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
    
    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fds = new FakeJmsBroker();
        fds.setUserName(jmsUsername);
        fds.setPassword(jmsPassword);
        fds.setUrl(jmsUrl);
        return fds;
    }
}
