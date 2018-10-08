/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan38.hitunglingkaran;

/**
 *
 * @author rickyyudhaa
 */
public class Circlecalculator {
    double radius,wide,round;
    
    public double radius(double diameter) {
        radius = diameter/2;
        return radius;
    }
    public double circleWide(double r) {
        wide = Math.PI*r*r;
        return wide;
    }
    public double circleRound(double r) {
        wide = 2*Math.PI*r;
        return wide;
    }
}
