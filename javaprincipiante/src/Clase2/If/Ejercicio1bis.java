/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2.If;

/**
 *
 * @author EducaciónIT
 */
public class Ejercicio1bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n1 = 100;
       int n2 = 500;
       int n3 = 250;
       
    if (n1 > n2) {
        if (n1>n3){
            System.out.println("N1 es el mayor");
        }
        else {
            System.out.println("N3 es el mayor");
        }} 
        else if (n2 > n3){
                System.out.println("N2 es el mayor");
                }    
        else {
                System.out.println("N3 es elv mayor");
                }
      
    }
    
}
