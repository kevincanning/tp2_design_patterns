/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.creational.builder;

/**
 *
 * @author Kevin Cannning
 */
public class MainDriver {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.contructMeal();
        
        Meal meal = mealDirector.getMeal();
        System.out.println("Meal for Italian: ");
        System.out.println("Drink is: " + meal.getDrink());
        System.out.println("Main Course is: " + meal.getMainCourse());
        System.out.println("Side is: " + meal.getSide() + "\n");
        
        mealBuilder = new JapaneseMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.contructMeal();
        meal = mealDirector.getMeal();
        System.out.println("Meal for Japanese: ");
        System.out.println("Drink is: " + meal.getDrink());
        System.out.println("Main Course is: " + meal.getMainCourse());
        System.out.println("Side is: " + meal.getSide() + "\n");
        
        mealBuilder = new McDonladsMealBuilder();
        mealDirector = new  MealDirector(mealBuilder);
        mealDirector.contructMeal();
        meal = mealDirector.getMeal();
        System.out.println("Meal for McDonlads: ");
        System.out.println("Drink is: " + meal.getDrink());
        System.out.println("Main Course is: " + meal.getMainCourse());
        System.out.println("Side is: " + meal.getSide() + "\n");
        
        mealBuilder = new SpurMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.contructMeal();
        meal = mealDirector.getMeal();
        System.out.println("Meal for Spur: ");
        System.out.println("Drink is: " + meal.getDrink());
        System.out.println("Main Course is: " + meal.getMainCourse());
        System.out.println("Side is: " + meal.getSide());
    }
}
