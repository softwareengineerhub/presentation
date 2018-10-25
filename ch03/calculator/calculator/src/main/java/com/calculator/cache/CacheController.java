/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.cache;

/**
 *
 * @author DProkopiuk
 */
public interface CacheController {

    public void put(String params, Double value);

    public Double get(String params);
}
