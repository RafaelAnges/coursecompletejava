/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade05;

/**
 *
 * @author rafae
 */
public class Conta {
    private int number;
    private String holder;
    private double balance;
    
    
    public Conta(int number, String holder){
        this.number = number;
        this.holder = holder;
    
}
    
    public Conta(int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
        
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

   
    /**
     * @return the holder
     */
    public String getHolder() {
        return holder;
    }

    /**
     * @param holder the holder to set
     */
    public void setHolder(String holder) {
        this.holder = holder;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    
    
    public void deposit(double amount){
        balance += amount;
        
    }
    
    public void withdraw(double amount){
        balance -= amount + 5.0;
    }
    
    public String toString(){
        return "Conta: "
                +number
                +", Holder: "
                +holder
                +", Balance: $"
                +String.format("%.2f", balance);
    }
    
    
    
    
}
