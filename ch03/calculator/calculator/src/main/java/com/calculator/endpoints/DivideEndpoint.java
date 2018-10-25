/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.endpoints;

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
@Path("/divide")
@ApplicationScoped
public class DivideEndpoint {

    @GET
    @Path("/{a}/{b}")
    public String divide(@PathParam("a") double a, @PathParam("b") double b) {
        return "divide:" + a + "; " + b;
    }

}
