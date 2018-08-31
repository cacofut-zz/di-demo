/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 *
 * @author cristianoca
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor{
    
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if( bean instanceof LifeCicleDemoBean){
            (( LifeCicleDemoBean ) bean ).beforeInit();
        }
        
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if( bean instanceof LifeCicleDemoBean){
            (( LifeCicleDemoBean ) bean ).afterInit();
        }
        
        return bean;
    }
}
