/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.engine;

/**
 *
 * @author Denis
 */
public interface CalculatorEngine {
    
    public double add(double...params);
    
    public double subtrack(double...params);
    
    public double multiply(double...params);
    
    public double divide(double a, double b);
    
}
