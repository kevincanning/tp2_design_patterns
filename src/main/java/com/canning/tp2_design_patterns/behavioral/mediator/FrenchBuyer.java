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
public class FrenchBuyer extends Buyer {
    public FrenchBuyer(Mediator mediator) {
        super(mediator, "euro");
        mediator.registerFrenchBuyer(this);
    }
}
