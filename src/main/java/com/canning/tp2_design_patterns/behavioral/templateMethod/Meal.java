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
public abstract class Meal {
    public final void doMeal() {
        preprareIngredients();
        cook();
        eat();
        cleanUp();
    }
    
    public abstract void preprareIngredients();
    
    public abstract void cook();
    
    public void eat() {
        System.out.println("Mmm! That's good!");
    }
    
    public abstract void cleanUp();
}
