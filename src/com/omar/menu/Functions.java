package com.omar.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {
	
	public static int[][] leerMatriz(int filas, int columnas){
		
		Scanner sc = new Scanner(System.in);
		
		int [][] m = new int [filas][columnas];
		
		try {
			
			for(int i = 0; i<filas; i++) {
				for(int j = 0; j<columnas; j++) {
					m[i][j]=sc.nextInt();
				}
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Por favor, introduzca números enteros");
		}
		
		sc.close();
		
		return m;
	}
	
	public static int [][] sumarMatrices(int [][] m1, int [][] m2){
		
		if(m1.length==m2.length && m1[0].length==m2[0].length) {
			
			int[][] mFinal = null;
			
			for(int i=0; i<m1.length; i++) {
				for(int j=0; j<m1[i].length; j++) {
					mFinal[i][j]=m1[i][j]+m2[i][j];
				}
			}
			
			return mFinal;
			
		}
		return null;
		
	}

}
