/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author invitado
 */
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ventana  Ventana= new ventana();
        System.out.println(Ventana.alto);
        ventana Ventana1 = new ventana("1.5 m", "1.5 m", "cuadrado", "algodón", "duro");
        System.out.println(Ventana1.ancho);
        Ventana.abrirVentana();
        Ventana.cerrarCortina();
    }
    
}
