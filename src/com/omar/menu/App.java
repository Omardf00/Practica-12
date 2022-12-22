package com.omar.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int option = 0;

		int filas = 0;
		int columnas = 0;
		int filas1 = 0;
		int columnas1 = 0;

		int[][] m1 = null;
		int[][] m2 = null;
		int[][] mFinal = null;

		System.out.println("Bienvenido a la calculadora de Matrices. Aquí le presentaremos un menú que");
		System.out.println("le dará una serie de opciones:");

		System.out.println(
				"NOTA: Las matrices se deben introducir por filas de manera que si tenemos una matriz 2x2 tal que");
		System.out.println("A  B");
		System.out.println("C  D");
		System.out.println("Introduciremos los valores en el orden A,B,C y D.");

		System.out.println("");

		do {
			System.out.println("----------MENÚ----------");
			System.out.println("(1)Introducir Matriz 1");
			System.out.println("(2)Introducir Matriz 2");
			System.out.println("(3)Sumar Matrices");
			System.out.println("(4)Restar Matrices");
			System.out.println("(5)Multiplicar Matrices");
			System.out.println("(6)Salir");
			System.out.println("------------------------");

			try {
				System.out.println("Introduzca una opción");
				option = sc.nextInt();

				switch (option) {
				case 1:

					System.out.println("Por favor, introduzca la cantidad de filas de la matriz");
					filas = sc.nextInt();

					System.out.println("Por favor, introduzca la cantidad de columnas de la matriz");
					columnas = sc.nextInt();

					System.out.println("Introduzca los valores en orden");

					m1 = Functions.leerMatriz(filas, columnas);

					break;

				case 2:

					System.out.println("Por favor, introduzca la cantidad de filas de la matriz");
					filas1 = sc.nextInt();

					System.out.println("Por favor, introduzca la cantidad de columnas de la matriz");
					columnas1 = sc.nextInt();

					System.out.println("Introduzca los valores en orden");

					m2 = Functions.leerMatriz(filas1, columnas1);

					break;

				case 3:

					mFinal = Functions.sumarMatrices(m1, m2);

					if (mFinal != null) {

						System.out.println("El resultado de la suma es el siguinete:");

						for (int i = 0; i < mFinal.length; i++) {
							for (int j = 0; j < mFinal[i].length; j++) {
								System.out.print(mFinal[i][j] + " ");
							}
							System.out.println("");
						}

					} else {
						System.out.println("No se ha podido realizar la suma, compruebe que las filas y columnas de ambas matrices coincidan");
					}

					break;

				case 4:

					break;

				case 5:

					break;

				case 6:

					break;

				default:
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("Por favor, introduzca números enteros");
			}

		} while (option != 6);
		
		sc.close();
	}

}
