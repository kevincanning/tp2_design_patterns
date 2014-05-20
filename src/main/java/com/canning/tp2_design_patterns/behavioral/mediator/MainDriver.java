/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.behavioral.mediator;

/**
 *
 * @author Kevin Canning
 */
public class MainDriver {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Buyer swedishBuyer = new SwedishBuyer(mediator); 
        Buyer frenchBuyer = new FrenchBuyer(mediator); 
        float sellingPriceInDollars = 10.0f;
        
        AmericanSeller americanSeller = new AmericanSeller(mediator, sellingPriceInDollars); 
        DollarConverter dollarConverter = new DollarConverter(mediator);        
             
        float swedishBidInKronor = 55.0f; 
        while (!swedishBuyer. attemptToPurchase(swedishBidInKronor)) { 
            swedishBidInKronor += 15.0f; 
        } 
        
        float frenchBidInEuros = 3.0f; 
        while (!frenchBuyer.attemptToPurchase(frenchBidInEuros)) { 
            frenchBidInEuros += 1.5f; 
        }

    }
}
