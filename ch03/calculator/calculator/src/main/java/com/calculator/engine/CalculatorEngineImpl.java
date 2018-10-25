/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.engine;

import java.util.stream.DoubleStream;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Denis
 */
@Dependent
public class CalculatorEngineImpl implements CalculatorEngine {

    @Override
    public double add(double... params) {
        return DoubleStream.of(params).sum();
    }

    @Override
    public double subtrack(double... params) {
        double result = 0;
        for (double item : params) {
            result -= item;
        }
        return result;
    }

    @Override
    public double multiply(double... params) {
        double result = 1;
        for (double item : params) {
            result *= item;
        }
        return result;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }

}
