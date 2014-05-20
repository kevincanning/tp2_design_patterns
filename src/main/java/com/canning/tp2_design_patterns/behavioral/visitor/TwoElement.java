/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.behavioral.visitor;

/**
 *
 * @author Kevin
 */
public class TwoElement implements NumberElement{
    int a;
    int b;
          
    public TwoElement(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override 
    public void accept(NumberVisitor visitor) {
        visitor.visit(this); 
    }

}
