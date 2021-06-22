/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terceiraatividade;

/**
 *
 * @author rafae
 */
public class Stundent {
    public String name;
    public String finalGrade;
    public double n1;
    public double n2;
    public double n3;
    public double result;
    public double rest;
    
    public double calculation(){
        return result  = n1 + n2 + n3;
    }
     public double rest(){
        return rest = 60 - result;
    }
    
    public String finalGrade1(){
        if (result >= 60 ){
            return finalGrade = "PASS";
        }else if (result < 60){
            return finalGrade = "FAILED "+"\n" + "MISSING " +String.format("%.2f", rest())+" POINTS";
        }
        return finalGrade;
    }
    
   
    
    public String toString(){
        return calculation()+"0"
                +"\n"
                + finalGrade1();
        
    }
    
    
}
