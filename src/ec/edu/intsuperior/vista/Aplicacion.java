/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author wladi
 */
public class Aplicacion {
    
  static Scanner leer= new Scanner(System.in);
  
    public static void main(String[] args) {
               Aplicacion.metodoDos();
    }
    
    public static void metodo(){
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
    }
    
    public static void metodoDos(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    }
    
    

