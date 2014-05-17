/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.creational.abstractFactory;

/**
 *
 * @author Kevin
 */
public class AbstractFactory {
    public SpeciesFactory getSpeciesFactory(String type) {
        if("mammal".equals(type)) {
            return new MammalFactory();
        } else {
            return new ReptileFactory();
        }
    }
}
