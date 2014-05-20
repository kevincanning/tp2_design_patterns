/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.behavioral.iterator;

import java.util.Iterator;

/**
 *
 * @author Kevin Canning
 */
public class MainDriver {
    public static void main(String[] args) {
        Item i1 = new Item("Spaghetti", 7.50f); 
        Item i2 = new Item("Hamburger", 6.00f); 
        Item i3 = new Item("Chicken sandwich", 6.50f);
        
        Menu menu = new Menu(); 
        menu.addItem(i1); 
        menu.addItem(i2); 
        menu.addItem(i3);
        
        System.out.println("Displaying Menu: "); 
        Iterator<Item> iterator = menu.iterator(); 
        while(iterator.hasNext()) {
            Item item = iterator.next(); 
            System.out.println(item); 
        }
        
        System.out.println("\nRemoving last item returned"); 
        iterator.remove(); 
        System.out.println("\nDisplaying Menu: ");
        iterator = menu.iterator(); 
        while(iterator.hasNext()) { 
            Item item = iterator.next(); 
            System.out.println(item); 
        }
    }
}
