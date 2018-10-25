/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.cache;

import javax.cache.annotation.CacheDefaults;
import javax.cache.annotation.CacheKey;
import javax.cache.annotation.CachePut;
import javax.cache.annotation.CacheResult;
import javax.cache.annotation.CacheValue;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author DProkopiuk
 */
@CacheDefaults(cacheName = "subtract")
@ApplicationScoped
@Named("subtract")
public class SubtractCacheController implements CacheController {

    @CachePut
    @Override
    public void put(@CacheKey String params, @CacheValue Double value) {
    }

    @CacheResult
    @Override
    public Double get(String params) {
        return null;
    }
    
}
