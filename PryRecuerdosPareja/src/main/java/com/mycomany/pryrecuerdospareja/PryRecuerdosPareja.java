package com.mycomany.pryrecuerdospareja;

import java.util.Scanner;

public class PryRecuerdosPareja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String participante1 = scanner.nextLine();

        System.out.print("Ingrese el nombre de su pareja ");
        String participante2 = scanner.nextLine();

        System.out.print("Cuantos recuerdos quiere ingresar para "+participante1+"? ");
        int cantidadRecuerdos1 = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Cuantos recuerdos quiere ingresar para "+participante2+"? ");
        int cantidadRecuerdos2 = scanner.nextInt();
        scanner.nextLine(); 

        String[] recuerdos1 = new String[cantidadRecuerdos1];
        String[] recuerdos2 = new String[cantidadRecuerdos2];

        System.out.println("\nIngrese los recuerdos de "+participante1+":");
        for (int i = 0; i < cantidadRecuerdos1; i++) {
            System.out.print("Recuerdo "+(i+1)+": ");
            recuerdos1[i] = scanner.nextLine();
        }

        System.out.println("\nIngrese los recuerdos de " + participante2 + ":");
        for (int i = 0; i < cantidadRecuerdos2; i++) {
            System.out.print("Recuerdo "+(i+1)+": ");
            recuerdos2[i] = scanner.nextLine();
        }

        System.out.print("\nCuantos recuerdos desea combinar de "+participante1+"? ");
        int combinarRecuerdos1 = scanner.nextInt();
        scanner.nextLine(); 

        if (combinarRecuerdos1 > cantidadRecuerdos1) {
            System.out.println("No puede seleccionar mas recuerdos");
            return;
        }

        System.out.print("Cuantos recuerdos desea combinar de "+participante2+"? ");
        int combinarRecuerdos2 = scanner.nextInt();
        scanner.nextLine(); 

        if (combinarRecuerdos2 > cantidadRecuerdos2) {
            System.out.println("No puede seleccionar más recuerdos");
            return;
        }

        StringBuilder recuerdosCombinados = new StringBuilder();

        for (int i = 0; i < combinarRecuerdos1; i++) {
            recuerdosCombinados.append(recuerdos1[i]);
            if (i < combinarRecuerdos1 - 1 || combinarRecuerdos2 > 0) {
                recuerdosCombinados.append(", ");
            }
        }

        for (int i = 0; i < combinarRecuerdos2; i++) {
            recuerdosCombinados.append(recuerdos2[i]);
            if (i < combinarRecuerdos2 - 1) {
                recuerdosCombinados.append(", ");
            }
        }

        System.out.println("\nRecuerdos Combinados");
        System.out.println(recuerdosCombinados.toString());


        scanner.close();
    }
}
