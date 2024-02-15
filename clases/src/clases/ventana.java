/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


public class ventana {
    String ancho;
    String alto;
    String forma;
    String tela_cortina;
    String dureza_cristal;
 
    public ventana() { //constructor
        ancho = "1.5 m";
        alto = "1.5 m";
        forma = "cuadrado";
        tela_cortina = "algodón";
        dureza_cristal = "duro";

    }

    public ventana(String ancho, String alto, String forma, String tela_cortina, String dureza_cristal) {
        this.ancho = ancho;
        this.alto = alto;
        this.forma = forma;
        this.tela_cortina = tela_cortina;
        this.dureza_cristal = dureza_cristal;
    }
    
    
    
    
    public void abrirVentana(){
        System.out.println("Se abrió la ventana");
    }
    public void cerrarVentana(){
        System.out.println("Se ha cerrado la ventana");
    }
    public void abrirCortina(){
        System.out.println("Se abrió la cortina");
    }
    public void cerrarCortina(){
        System.out.println("Se cerró la cortina");
    }

}
