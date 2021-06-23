/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terceiraatividade;

import java.util.Locale;
import java.util.Scanner;
import terceiraatividade.Stundent;
/**
 *
 * @author rafae
 */
public class TerceiraAtividade {
    
    /*
    
    Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano 
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam 
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para 
resolver este problema.
    
    */
    
    public static void main(String[] args){
        

     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     Stundent stundent = new Stundent();
     
     System.out.println("Enter your name? ");
     stundent.name = sc.nextLine();
     
     System.out.println("Grade 1 semester? ");
     stundent.n1 = sc.nextDouble();
     
     System.out.println("Grade 2 semester? ");
     stundent.n2 = sc.nextDouble();
     
     System.out.println("Grade 3 semester? ");
     stundent.n3 = sc.nextDouble();
     
     System.out.println();
     
    System.out.printf("FINAL GRADE = "+ stundent);
    
}}
