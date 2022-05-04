/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author admin
 */
public class Zapato {
    
    public String talla;
    public String modelo;
    public String color;
    public int precio ;
  
    
     public static void main(String[] args) {
     
         Zapato zapatoDeportivo= new Zapato();
         zapatoDeportivo.modelo="escalada";
         zapatoDeportivo.color="negro";
           
         Zapato zapatoCasual= new Zapato(); 
         zapatoCasual.modelo="tacones";
         zapatoCasual.color="rojo";
         
         
         System.out.println("El color del zapato es: " + zapatoDeportivo.color);
    }
    
}
