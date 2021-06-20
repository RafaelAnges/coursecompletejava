/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraatividade;

import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;
import primeiraatividade.Retangulo;
        
/**
 *
 * @author rafae
 */
public class PrimeiraAtividade {
    
    public static void main (String[] args){
      
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo ret = new Retangulo();
        
        
        System.out.println("Enter a width: ");
        double width = sc.nextDouble();
        
        System.out.println("Enter a height: ");
        double height = sc.nextDouble();
        
        ret.setWidth(width);
        ret.setHeight(height);
        
        
        System.out.printf("AREA = %.2f%n ", ret.area());
        System.out.printf("PERIMETER = %.2f%n ", ret.perimeter());
        System.out.printf("DIAGONAL = %.2f%n ", ret.diagonal());
        
        sc.close();
    }
}
