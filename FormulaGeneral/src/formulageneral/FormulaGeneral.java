/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulageneral;

import java.util.Scanner;

/**
 *
 * @author moviles
 */
public class FormulaGeneral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a,b,c;
        double x1,x2,raiz,qr;
        
        System.out.println("Inserte el valor de A");
        a = input.nextInt();
        System.out.println("Inserte el valor de B");
        b = input.nextInt();
        System.out.println("Inserte el valor de C");
        c = input.nextInt();
        
        raiz = (Math.pow(b, 2))-4*(a*c);
        
        if(raiz>=0){
            qr = (Math.sqrt(raiz));
            x1 = (-b + qr)/(2*a); 
            x2 = (-b - qr)/(2*a); 
            System.out.println("Su valor en X1 es: " + x1);
            System.out.println("Su valor en X2 es: " + x2);
        }
        else
            System.out.println("Raiz imaginaria");
        
    }
    
}
