/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_git;

import java.util.Scanner;

/**
 *
 * @author df335
 */
public class Proyecto_Git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
       String[] vector = new String[12];
       vector[0] = "Enero";
       vector[1] = "Febrero";
       vector[2] = "Marzo";
       vector[3] = "Abril";
       vector[4] = "Mayo";
       vector[5] = "Junio";
       vector[6] = "Julio";
       vector[7] = "Agosto";
       vector[8] = "Septiembre";
       vector[9] = "Octubre";
       vector[10] = "Noviembre";
       vector[11] = "Diciembre";
    
        System.out.println("Escribe la posicion que quieras mostrar:");
        String posicion = "";
        posicion = teclado.nextLine();
        int respuesta = Integer.parseInt(posicion);
        System.out.println(vector[respuesta]);
    }
    
}
