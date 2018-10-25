/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.endpoints;

import com.calculator.computation.service.AbstractComputationService;
import com.calculator.computation.service.ComputationService;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author DProkopiuk
 */
@Path("/add")
@ApplicationScoped
public class AddEndpoint {

    @Inject
    @Named("add")
    private ComputationService computationService;
   

    @GET
    @Path("/{params:.*}")
    @Produces(value = MediaType.TEXT_PLAIN)
    public double add(@PathParam("params") String params) {
     //   System.out.println("computationService="+computationService);
      //  return 1;
        return computationService.process(params);
    }

}
