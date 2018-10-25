/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eeproject;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.interceptor.Interceptors;

/**
 *
 * @author asusadmin
 */
@Singleton
@Interceptors({MyInterceptor.class})
public class MySingleton {
    
    @PostConstruct
    public void init(){
        
    }
    
    public void m1(){
        
    }
    
    @PreDestroy
    public void destroy(){
        
    }
    
}
