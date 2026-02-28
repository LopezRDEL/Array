

package com.mycompany.arrayMatriz;

import java.util.Scanner;

/**
 *
 * @author LopezRDEL
 */
public class arrayMatriz {

    public static void main(String[] args) {
        int i, Lon=1;
        
        Scanner lector = new Scanner (System.in);
        
        String datos [][] = new String [Lon][3];
        int edad [][] = new int [Lon][];

        
        
        for (i = 0; i < Lon; i++) {
         
            System.out.println("Ingrese el nombre de la persona ");
            datos[Lon][i] = lector.next();
            
            System.out.println("Ingrese el sexo de la persona F = Femenino M = Masculino ");
            sexo [i] = lector.next();
            
            
            System.out.println("Ingrese la edad de la persona ");
            edad [i] = lector.nextInt();
            
            if (edad [i] < 12) {
                estado [i] = "La persona es un infante";
            } 
            else {
                if (edad [i] < 18) {
                    estado [i] = "La persona es adolecente ";
                } else {
                    if (edad [i] <62 ) {
                        estado [i] = "La persona es adulta ";
                    } else {
                        estado [i] = "La persona tiene una longevidad elevada";
                    }
                    System.out.println("El estado de la persona es " );
                    
                }
            }
            
            
        }
            for ( i = 0; i < 10; i++) {
               
                System.out.print(nombre[i] + "  " + sexo[i]+ "  " + edad[i]+ " " +  estado[i]);
                
            
        }
    }
}