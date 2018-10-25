/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Denis
 */
@javax.ws.rs.ApplicationPath("common")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method. It is automatically
     * populated with all resources defined in the project. If required, comment
     * out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {        
        resources.add(com.calculator.endpoints.AddEndpoint.class);
        resources.add(com.calculator.endpoints.DivideEndpoint.class);
        resources.add(com.calculator.endpoints.MultiplyEndpoint.class);
        resources.add(com.calculator.endpoints.SubtractEndpoint.class);
    }

}
