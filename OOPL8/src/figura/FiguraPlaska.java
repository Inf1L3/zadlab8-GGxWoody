/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author Przemek
 */
public abstract class FiguraPlaska extends FiguraGeometryczna {
    public abstract double obliczObwod();

    @Override
    public String toString() {
        return "Obliczanie parametrow figury plaskiej";
    }
    
    
}
