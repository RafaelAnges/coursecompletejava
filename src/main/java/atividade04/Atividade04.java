/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class Atividade04 {
    
    /*
    
    Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por 
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda 
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.
    
    */
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is the dollar price? ");
        double price = sc.nextDouble();
        
        System.out.println("How many dollars will be bought? ");
        double buy = sc.nextDouble();
        
        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.convert(price, buy));
        
        
}
}

