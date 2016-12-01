/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import java.time.Duration;
import java.time.Instant;
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
        Scanner sc1 = new Scanner(System.in);
        String frase = "A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática";
        System.out.println("ESCRIBE A SEGUINTE FRASE");
        System.out.println(frase);
        System.out.println("PREME ENTER PARA REMATAR");
        //En esta version hacemos los calculos de tiempo con instant.now() en lugar de System.currentTimeMillis()
        Instant tiempoInicio = Instant.now();
        //Usamos el nextline() para que copie la frase entera. con next() solo pillaria la siguiente palabra
        String fraseEscrita = sc1.nextLine();
        Instant tiempoFin = Instant.now();
        Duration duracion = Duration.between(tiempoInicio, tiempoFin);
        //comprueba que ambas frases sean identicas
        if (frase.equals(fraseEscrita)) {
            System.out.println("BIEN HECHO");
            System.out.println("TARDACHES " + duracion.getSeconds() + " segundos");
        } else {
            System.out.println("No has copiado la frase corretamente, vuelve a intentarlo");
            System.out.println("TARDACHES " + duracion.getSeconds() + " segundos");
        }

    }

}
