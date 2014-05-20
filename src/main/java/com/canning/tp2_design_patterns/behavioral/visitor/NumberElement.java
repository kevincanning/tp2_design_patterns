/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.behavioral.visitor;

/**
 *
 * @author Kevin Canning
 */
public interface NumberElement {
    public void accept(NumberVisitor visitor);
}
