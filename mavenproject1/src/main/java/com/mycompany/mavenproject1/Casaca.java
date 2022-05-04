/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author admin
 */
public class Casaca {
    
    public String color;
    public String tela;
    public int talla;
    public String marca;
    
    
      public static void main(String[] args) {
      
           Casaca chaqueta1= new Casaca();
           chaqueta1.color="verde";
           chaqueta1.talla=38;
           
           Casaca chaqueta2= new Casaca();
           chaqueta2.tela="algodon";
           chaqueta2.marca= "GAP";
           
           System.out.println("El color de la casaca es: " + chaqueta1.color);
           
    }
    
}
