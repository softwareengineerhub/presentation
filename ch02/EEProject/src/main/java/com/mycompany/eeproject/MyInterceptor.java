/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eeproject;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author asusadmin
 */
public class MyInterceptor {
    
    @AroundInvoke
    public Object proceeed(InvocationContext ctx) throws Exception{
        System.out.println("@Before proceed");
        return ctx.proceed();
    }
    
}
