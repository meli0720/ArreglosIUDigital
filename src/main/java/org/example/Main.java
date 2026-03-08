package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static double sumTotal;
    public static void main(String[] args) {

        int[] vector1 = new int[7];
        int[] vector2 = new int[7];

        Scanner scan = new Scanner(System.in);
        vector1 = ingresarDatos(scan, vector1);
        vector2 = ingresarDatos(scan, vector2);



        int[] vector3 = new int[7];

        //2. Llenar arreglo 3 con la diferencia de lso valores de los otros 2 vectores
        for (int i = 0; i < vector3.length ; i++) {
            vector3[i] = vector1[i]-vector2[i];
            sumTotal += vector3[i];
            System.out.println("Vector1["+i+"]"+"="+vector1[i]+" - Vector2["+i+"]"+"="+vector2[i]+"     |      Resultado ["+vector3[i]+"]");
        }

        //3. promedio de todos los datos
        System.out.println("\nPromedio ("+sumTotal+"/21) = "+sumTotal/21+"\n");

        //4. mostrar datos del tercer arreglo
        for (int i = 0; i < vector3.length ; i++) {
            System.out.println("vector3["+i+"] = "+vector3[i]);
        }



    }

    public static int[] ingresarDatos(Scanner scan, int[] vector){
        System.out.println("__________________________________"+"\nIngresa los datos del arreglo:\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor para la posición: ["+i+"]");
            vector[i] = scan.nextInt();
            sumTotal += vector[i];
        }
        return vector;
    }
}