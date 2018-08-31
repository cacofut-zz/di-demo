/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 *
 * @author cristianoca
 */
@Component
public class LifeCicleDemoBean implements InitializingBean, DisposableBean, 
        BeanNameAware, BeanFactoryAware, ApplicationContextAware{

    public LifeCicleDemoBean() {
        System.out.println("## I´m in the LifeCycleBean Constructor");
    }
    
    //Interface BeanNameAware
    @Override
    public void setBeanName(String nameBean) {
        System.out.println("## O nome do Bean: " + nameBean);
    }

    //Interface BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory bf) throws BeansException {
        System.out.println("## O BeanFactory foi setado ");
    }
    
    //Interface ApplicationContextAware
    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        System.out.println("## O ApplicationContextAware foi setado ");
    }
                
    public void beforeInit(){
        System.out.println("## - Before Init = chamado pelo Bean Post Processor");
    }     
               
    @PostConstruct
    public void postConstruct(){
        System.out.println("## O PostConstruct método anotado foi chamado ");
    }
            
    //Interface InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## Depois de setar as propriedades do LifeCicleDemoBean");
    }
               
    public void afterInit(){
        System.out.println("## - After Init = chamado pelo Bean Post Processor");
    }    
    
    @PreDestroy
    public void preDestroy(){
        System.out.println("## O PreDestroy método anotado foi chamado ");
    }
            
    //Interface DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("## O Bean LifeCicleDemoBean foi terminado ");
    }

}
