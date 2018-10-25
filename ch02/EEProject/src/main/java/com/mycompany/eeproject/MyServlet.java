/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eeproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asusadmin
 */
@WebServlet(name = "MyServlet", urlPatterns = {"/MyServlet"})
public class MyServlet extends HttpServlet {

    @Resource(name="myQueue") 
    private Destination destination;
    @Resource(name="myConnectionFactory") 
    private ConnectionFactory connectionFactory;
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            System.out.println("service()");
            Connection c = connectionFactory.createConnection();
            System.out.println("c="+c);
            Session session = c.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Message msg = session.createTextMessage("Message for JMS");
            MessageProducer messageProducer = session.createProducer(destination);
            messageProducer.send(msg);
        } catch (JMSException ex) {
            throw new RuntimeException(ex);
        }
    }

}
