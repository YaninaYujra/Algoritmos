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
public class HolaM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("A");
        String palabra1 = "Hola";
        String palabra2 = "Mundo";
        String frase;
        System.out.println(palabra1);
        System.out.println(palabra2);
        
        System.out.println("B");
        frase = palabra1 + palabra2;
        System.out.println(frase);
        
        System.out.println("C");
        frase = palabra1 + "\t" + palabra2;
        System.out.println(frase);
        
        System.out.println("D");
        frase = palabra1 + "\n" + palabra2;
        System.out.println(frase);
        
        System.out.println("E");
        frase = "\"" + palabra1 + "\"\n\t\"" + palabra2 + "\"";
        System.out.println(frase);
        
        // TODO code application logic here
    }
    
}
