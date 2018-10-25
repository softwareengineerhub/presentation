/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.action;

/**
 *
 * @author Denis
 */
public interface CalculatorAction {

    public double calculateResult(ActionType actionType, double... data);

}
