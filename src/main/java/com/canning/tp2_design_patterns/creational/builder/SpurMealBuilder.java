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
public class SpurMealBuilder implements MealBuilder {
    private Meal meal;
    
    public SpurMealBuilder() {
        meal = new Meal();
    }
    
    @Override
    public void buildDrink() {
        meal.setDrink("Castle Beer");
    }
    
    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Double Chicken Burger");
    }
    
    @Override
    public void buildSide() {
        meal.setSide("Fresh Hot Chips");
    }
    
    @Override
    public Meal getMeal() {
        return meal;
    }
}
