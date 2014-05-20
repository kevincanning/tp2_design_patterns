/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.behavioral.templateMethod;

/**
 *
 * @author Kevin Canning
 */
public class CheeseBurgerMeal extends Meal {

    @Override
    public void preprareIngredients() {
        System.out.println("Getting ground beef & Cheese!");
    }

    @Override
    public void cook() {
        System.out.println("Cooking ground beef in pan!");
    }
    
    @Override
    public void eat(){
        System.out.println("The Cheese Burgers are tasty!");
    }

    @Override
    public void cleanUp() {
        System.out.println("Doing the dishes!");
    }
    
}
