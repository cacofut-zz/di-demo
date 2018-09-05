/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.config;

import br.com.diagnosticit.service.GreetingRepository;
import br.com.diagnosticit.service.GreetingService;
import br.com.diagnosticit.service.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author cristianoca
 */
@Configuration
public class GreetingServiceConfig {
    
    @Bean
    public GreetingServiceFactory greetingServiceFactory( GreetingRepository greetingRepository ){
        return new GreetingServiceFactory(greetingRepository);
    }
    
    @Bean
    @Primary
    @Profile({"default", "en"})
    public GreetingService primaryGreetingService( GreetingServiceFactory greetingServiceFactory ){
        return greetingServiceFactory.createGreetingService( "en" );
    }
    
    @Bean
    @Primary
    @Profile("es")
    public GreetingService primarySpanishGreetingService( GreetingServiceFactory greetingServiceFactory ){
        return greetingServiceFactory.createGreetingService("es");
    }
    
    @Bean
    @Primary
    @Profile("de")
    public GreetingService primaryGermanGreetingService( GreetingServiceFactory greetingServiceFactory ){
        return greetingServiceFactory.createGreetingService("de");
    }
}
