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
public class MainDriver {
    public static void main(String[] args) {
        Meal meal1 = new HamburgerMeal();
        System.out.println("HAMBURGER MEAL:");
        meal1.doMeal();
        System.out.println("");
        Meal  meal2 = new CheeseBurgerMeal();
        System.out.println("CHEESE BURGER MEAL:");
        meal2.doMeal();
    }
}
