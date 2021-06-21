/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaatividade;

/**
 *
 * @author rafae
 */
public class Employee {
    public String Name;
    public double GrossSalary;
    public double Tax;
    
    
    public double NetSalary(){
        return GrossSalary - Tax;
    }
    
    public String toString(){
        return Name
                + ", $ "
                + String.format("%.2f", NetSalary());
    }
    
    public void IncreaseSalary(double porcentage){
        this.GrossSalary = (((GrossSalary * porcentage)/100) + GrossSalary); 
        
        
}
    
}
