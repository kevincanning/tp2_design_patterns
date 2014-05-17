/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.creational.builder;

/**
 *
 * @author Kevin
 */
public class McDonladsMealBuilder implements MealBuilder {
    private Meal meal;
    
    public McDonladsMealBuilder() {
        meal = new Meal();
    }
    
    @Override
    public void buildDrink() {
        meal.setDrink("Coke");
    }
    
    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Large Big Mac");
    }
    
    @Override
    public void buildSide() {
        meal.setSide("McFlurry");
    }
    
    @Override
    public Meal getMeal() {
        return meal;
    }
}
