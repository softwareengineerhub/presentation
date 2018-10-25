/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.computation.service;

import com.calculator.action.ActionType;
import com.calculator.action.CalculatorAction;
import com.calculator.cache.CacheController;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author DProkopiuk
 */
@ApplicationScoped
@Named("add")
public class AddComputationService extends AbstractComputationService {

    /*@Inject
    @Named("add")
    private CacheController cacheController;
    @Inject
    private CalculatorAction calculatorAction;
*/
    @Override
    public double process(String params) {
        return 2.0;
        /*Double result = cacheController.get(params);
        if (result == null) {
            double calculatedResult = calculatorAction.calculateResult(ActionType.ADD, process(params));
            cacheController.put(params, calculatedResult);
            return calculatedResult;
        }
        return result;*/
    }

}
