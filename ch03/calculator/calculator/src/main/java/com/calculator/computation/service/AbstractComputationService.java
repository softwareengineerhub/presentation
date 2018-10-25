/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.computation.service;

/**
 *
 * @author DProkopiuk
 */
public abstract class AbstractComputationService implements ComputationService {

    public double[] parsePath(String params) {
        String[] content = params.split("/");
        double[] result = new double[content.length];
        int i = 0;
        for (String item : content) {
            result[i++] = Double.parseDouble(item);
        }
        return result;
    }

}
