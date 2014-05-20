/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.behavioral.command;

/**
 *
 * @author Kevin Canning
 */
public class MainDriver {
    public static void main(String[] args) {
        Lunch lunch = new Lunch();  
        Command lunchCommand = new LunchCommand( lunch); 
        Dinner dinner = new Dinner(); 
        Command dinnerCommand = new DinnerCommand( dinner); 
        MealInvoker mealInvoker = new MealInvoker( lunchCommand); 
        mealInvoker.invoke();
        mealInvoker.setCommand(dinnerCommand); 
        mealInvoker.invoke();
    }
}
