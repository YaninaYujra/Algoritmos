/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase1;

/**
 *
 * @author EducaciónIT
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println("A:");
        System.out.println(x);
        System.out.println(y);
        
        System.out.println("B");
        x += y; //x = x+y
        y += x;
        System.out.println(x);
        System.out.println(y);
        
        System.out.println("C");
        x -= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);
        
        System.out.println("D");
        x *= y;
        y *= x;
        System.out.println(x);
        System.out.println(y);
        // TODO code application logic here
    }
    
}
