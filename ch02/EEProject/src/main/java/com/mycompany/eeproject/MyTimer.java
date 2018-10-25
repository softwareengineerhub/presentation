/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eeproject;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.*;

/**
 *
 * @author asusadmin
 */
@Singleton
@Startup
public class MyTimer {
    
    @Resource
    private TimerService timerService;
    
    @PostConstruct
    public void init(){
        ScheduleExpression expression  = new ScheduleExpression();
        expression.second("*/10");
        expression.minute("*");
        expression.hour("*");
        timerService.createCalendarTimer(expression, new TimerConfig(null, false));
    }
    
    @Timeout
    public void doTask(Timer t){
        System.out.println("Hello");
    }

    @Schedule(minute ="*", hour = "*", second = "*/15", persistent = false)
    public void doTask2(){
        System.out.println("Hello2");
    }



    
}
