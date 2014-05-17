/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.structural.bridge;

/**
 *
 * @author Kevin
 */
public class BigEngine implements Engine {
    int horsePower;
    
    public BigEngine() {
        horsePower = 350;
    }
    
    @Override
    public int go() {
        System.out.println("The Big Engine is running!");
        return horsePower;
    }
}
