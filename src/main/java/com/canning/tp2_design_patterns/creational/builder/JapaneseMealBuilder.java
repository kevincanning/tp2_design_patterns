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
public class JapaneseMealBuilder implements MealBuilder {
    private Meal meal;
    
    public JapaneseMealBuilder() {
        meal = new Meal();
    }
    
    @Override
    public void buildDrink() {
        meal.setDrink("Sake");
    }
    
    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Chicken Teriyaki");
    }
    
    @Override
    public void buildSide() {
        meal.setSide("Miso Soup");
    }
    
    @Override
    public Meal getMeal() {
        return meal;
    }
}
