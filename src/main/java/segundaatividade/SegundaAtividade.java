/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaatividade;

import java.util.Locale;
import java.util.Scanner;
import segundaatividade.Employee;
/**
 *
 * @author rafae
 */
public class SegundaAtividade { 

/*

Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
afetado pela porcentagem) e mostrar novamente os dados do funcionário

*/
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Employee Emp = new Employee();
        System.out.println("Enter your name: ");
        Emp.Name = sc.nextLine();
        
        System.out.println("Enter gross salary: ");
        Emp.GrossSalary = sc.nextDouble();
        
        System.out.println("Tax: ");
        Emp.Tax = sc.nextDouble();
        
        System.out.println();
        System.out.println("Employee: "+ Emp);
        
        System.out.println("Wich porcentage to increase salary? ");
        double porcentage = sc.nextDouble();
        Emp.IncreaseSalary(porcentage);
        
        System.out.println("Updated data: "+ Emp);
        
    }
    
}
