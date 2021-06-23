/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

/**
 *
 * @author rafae
 */
public class CurrencyConverter {
    
    public double buy;
    public double iof1;
    
    public static double iof = 6.0;
    
    public static double convert(double price, double buy){
       double valor = price * buy;
       return valor = (iof * valor / 100)+ valor;
    }
    
    
     
    
}
