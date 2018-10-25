/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.endpoints;

import com.calculator.computation.service.AbstractComputationService;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author DProkopiuk
 */
@Path("subtract")
@ApplicationScoped
public class SubtractEndpoint {
    
    @GET
    @Path("/{params:.*}")
    @Produces(value = MediaType.TEXT_PLAIN)
    public String subtract(@PathParam("params") String params) {
        //double[] inParams = parsePath(params);
        return "subtract";
    }

}
