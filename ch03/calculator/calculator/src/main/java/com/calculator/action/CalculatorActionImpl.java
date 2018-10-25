/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.action;

import com.calculator.engine.CalculatorEngine;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 *
 * @author Denis
 */
@Dependent
public class CalculatorActionImpl implements CalculatorAction {
    
    @Inject
    private CalculatorEngine calculatorEngine;

    @Override
    public double calculateResult(ActionType actionType, double... data) {
        switch (actionType) {
            case ADD:
                return calculatorEngine.add(data);
            case SUBTRACT:
                return calculatorEngine.subtrack(data);
            case MULTIPLY:
                return calculatorEngine.multiply(data);
            case DIVIDE:
                return calculatorEngine.divide(data[0], data[1]);
            default:
                throw new IllegalArgumentException("Unknown type of action: " + actionType);
        }
    }

}
