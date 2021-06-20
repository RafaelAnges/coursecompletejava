/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraatividade;

/**
 *
 * @author rafae
 */
public class Retangulo {

    private double width;
    private double height;

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return width + width + height + height;
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }
}
