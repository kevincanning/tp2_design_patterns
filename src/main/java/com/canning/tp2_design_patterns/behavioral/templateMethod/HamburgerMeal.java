/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.behavioral.templateMethod;

/**
 *
 * @author Kevin
 */
public class HamburgerMeal extends Meal {

    @Override
    public void preprareIngredients() {
        System.out.println("Getting burgers, buns & french fries!");
    }

    @Override
    public void cook() {
        System.out.println("Cooking burgers on grill & fries in oven!");
    }

    @Override
    public void cleanUp() {
        System.out.println("Throwing away paper plates!");
    }
        
}
