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
public class TipoBool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean n1 = true;
        boolean n2 = false; 
        boolean n3 = !n1;
        boolean n4 = !n2;
        System.out.println("A");
        System.out.println(n3 + "\t" + n4);
        
        System.out.println("B");
        n3 = n1 && n2;
        n4 = n1 || n2;
        System.out.println(n3 + "\t" + n4);
        
        System.out.println("C");
        n3 = !(n1 && n2);
        n4 = !(n1 || n2);
        System.out.println(n3 + "\t" + n4);
        
        System.out.println("D");
        n3 = !n1 && n2;
        n4 = !n1 || n2;
        System.out.println(n3 + "\t" + n4);
        
        System.out.println("E");
        n3 = n1 ^ n2;
        n4 = n1 ^ !n2;
        System.out.println(n3+ "\t" + n4);
        
        
        
        // TODO code application logic here
    }
    
}
