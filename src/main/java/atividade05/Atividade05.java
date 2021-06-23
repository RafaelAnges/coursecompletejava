/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade05;

import java.util.Locale;
import java.util.Scanner;
import atividade05.Conta;
/**
 *
 * @author rafae
 */
public class Atividade05 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
         Conta conta;
        
        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        
        System.out.println("Enter account holder: ");
        String holder = sc.next();
        
        System.out.println("Is there na initial deposit (y/n)? ");
        char conf = sc.next().charAt(0);
        
        if (conf == 'y') {
            System.out.println("Enter initial deposit value: ");
            double balance = sc.next().charAt(0);
            conta = new Conta(number, holder, balance);
        } else{
            conta = new Conta(number, holder);
        }
        
        System.out.println();
        System.out.println("Account data:\n");
        System.out.println(conta);
        
        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);
        System.out.println("Updated account data:\n");
        System.out.println(conta);
        
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        conta.withdraw(withdrawValue);
        System.out.println("Updated account data:\n");
        System.out.println(conta);
        
        
        
    }
}
