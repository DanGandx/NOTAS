/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiones;

import java.util.Scanner;

/**
 *
 * @author moviles
 */
public class CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       int peso,op, pes;
       double libras, dol, m, cm;
        System.out.println("Ingresa la operaciòn que quieres realizar");
        op =input.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Introduce tu peso");
                peso = input.nextInt();
                libras = (peso/0.45);
                System.out.println("Su peso en libtras es: " + libras + "Lb");
                break;
            case 2:
                System.out.println("Introduce un número de pesos para convertirlo en dólares");
                pes = input.nextInt();
                dol =(pes/17.14);
                System.out.println("Su dinero a dòlares es :" + dol +" USD");
                break;
            case 3:
                System.out.println("Introduce tu estatura (m)":);
                
                
        }
    }
    
}
