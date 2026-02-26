
package com.mycompany.array;

import java.util.Scanner;

/**
 *
 * @author LopezRDEL
 */
public class Array {

    public static void main(String[] args) {
        int Lon=3;
        
        Scanner lector = new Scanner (System.in);
        
        String nombre [] = new String [Lon];
        
        float  n1[] = new float [Lon];
        
        float  n2[] = new float [Lon];
        
        float  n3[] = new float [Lon];
        
        float  definitiva[] = new float [Lon];
        
        for (int i = 0; i < Lon; i++) {
            
            System.out.println("Ingrese el nombre del estudiante ");
            nombre[i] = lector.nextLine();
            
            System.out.println("Ingrese la nota 1 ");
            n1 [i] = lector.nextFloat();
            
            System.out.println("Ingrese la nota 2 ");
            n2 [i] = lector.nextFloat();
            
            System.out.println("Ingrese la nota 3 ");
            n3 [i] = lector.nextFloat();
            
            definitiva [i] = (n1[i]+n2[i]+n3[i])/Lon;
            System.out.println("La definitiva es " + definitiva[i]);
        }
       
    }
}
