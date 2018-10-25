/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asusadmin
 */
public class MyServlet1 extends HttpServlet {

    @Override
    public void init(){
        System.out.println("init(). hashCode="+hashCode());
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("This is MyServlet1. hashCode="+hashCode());
    }
    
    @Override
    public void destroy(){
        System.out.println("destroy(). hashCode="+hashCode());
    }
    
}
