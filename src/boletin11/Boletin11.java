/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import java.util.Scanner;

/**
 *
 * @author otorradomiguez
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc1=new Scanner(System.in);
        System.out.println("ESCRIBE A SEGUINTE FRASE");
        System.out.println("A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática");
        long tiempoInicio=System.currentTimeMillis();
        System.out.println("PREME ENTER PARA REMATAR");
        String frase=sc1.next();
        long tiempoFin=System.currentTimeMillis();
        System.out.println("TARDACHES "+(tiempoFin-tiempoInicio)/1000+"segundos");
        
        
        
    }
    
}
