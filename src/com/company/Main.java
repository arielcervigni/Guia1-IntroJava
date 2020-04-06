package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        ejercicio18();
    }

    public static int leerEntero() {
        int unNumero = 0;
        Scanner bf = new Scanner(System.in);
        System.out.print("Ingrese un numero entero:");
        unNumero = bf.nextInt();
        return unNumero;
    }

    public static void ejercicio7() {
        int A = 0;
        int rta = 0;
        A = leerEntero();
        rta = parImpar(A);
        if (rta == 0) {
            System.out.println("El numero ingresado es PAR");
        } else {
            System.out.println("El numero ingresado es IMPAR");
        }

        rta = negativoPositivo(A);
        if (rta == 1) {
            System.out.println("El numero ingresado es POSITIVO");
        } else if (A == 0) {
            System.out.println("El numero ingresado es 0");
        } else {
            System.out.println("El numero ingresado es NEGATIVO");
        }

        rta = multiplo5(A);
        if (rta == 1) {
            System.out.println("El numero ingresado es multiplo de 5");
        } else {
            System.out.println("El numero ingresado NO es multiplo de 5");
        }

        rta = multiplo10(A);
        if (rta == 1) {
            System.out.println("El numero ingresado es multiplo de 10");
        } else {
            System.out.println("El numero ingresado NO es multiplo de 10");
        }

        rta = mayorMenor100(A);
        if (rta == 1) {
            System.out.println("El numero ingresado es MAYOR a 100");
        } else {
            System.out.println("El numero ingresado es MENOR de 100");
        }

    }

    public static int parImpar(int numero) {
        int rta = 0;
        if (numero % 2 == 0) {
            rta = 0;
        } else {
            rta = 1;
        }

        return rta;
    }

    public static int negativoPositivo(int numero) {
        int rta = 0;
        if (numero > 0) {
            rta = 1;
        } else if (numero == 0) {
            rta = 0;
        } else {
            rta = 2;
        }

        return rta;
    }

    public static int multiplo5(int numero) {
        int rta = 0;
        if (numero % 5 == 0) {
            rta = 1;
        } else {
            rta = 0;
        }

        return rta;
    }

    public static int multiplo10(int numero) {
        int rta = 0;
        if (numero % 10 == 0) {
            rta = 1;
        } else {
            rta = 0;
        }

        return rta;
    }

    public static int mayorMenor100(int numero) {
        int rta = 0;
        if (numero < 100) {
            rta = 0;
        } else {
            rta = 1;
        }

        return rta;
    }

    public static void ejercicio8() {
        System.out.print("Ingrese su nombre:");
        Scanner bf = new Scanner(System.in);
        String nombre = bf.nextLine();
        System.out.println("HOLA" + nombre);
    }

    public static void ejercicio16() {
        int cantidad = 3;
        int numero[] = new int [cantidad];
        int i = 0;

        for(i = 0; i < cantidad; ++i) {
            numero[i] = leerEntero();
        }

        for(i = 0; i < cantidad; ++i) {
            System.out.print(numero[i]);
        }

    }

    public static void ejercicio17()
    {
        int cantidad = 5;
        int numero [] = new int [cantidad];
        int i = 0;

        for (i = 0; i<cantidad; i++)
        {
            numero[i] = leerEntero();
        }
        for (i=0; i<cantidad; i++)
        {
            if (i==0 || i % 2 == 0)
            {
                System.out.print(numero[i]);
            }

        }
    }
    public static void ejercicio18()
    {
        //18.Programa que lea tres números enteros H, M, S que contienen hora, minutos y  segundos respectivamente,
        // y comprueba si la hora que indican es una hora válida

        int i = 0;
        int HMS[] = new int [3];

        for (i=0; i<3;i++)
        {
            HMS[i] = leerEntero();
        }
        i=0;

        while (i<3)
        {
            if (HMS [0] < 24)
            {
                i++;
                if (HMS[1] < 60)
                {
                    i++;
                    if (HMS[2]<60)
                    {
                        System.out.print("La hora ingresada es: " + HMS[0] + ":");
                        System.out.print(HMS[1] + ":");
                        System.out.print(HMS[2]);
                        i++;
                    }
                    else
                    {
                        System.out.print("Los segundos ingresados no son válidos");
                        i = 4;
                    }
                }

                else
                {
                    System.out.print("Los minutos ingresados no son válidos");
                    i = 4;
                }

            }
            else {
                System.out.print("La hora ingresada no es válida");
                i = 4;
            }

        }





    }
}
