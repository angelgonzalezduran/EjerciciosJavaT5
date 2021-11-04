package javaT5;

import java.util.Scanner;

public class Ejercicio1 {

		public static void main(String[] args) {

			//Hacer un programa que diga cuántas cifras posee el número introducido
			
			Scanner teclado = new Scanner(System.in) ;
			
			int numero ;
			
			do {
			
				System.out.print("Introduzca un número positivo -> ");
				
				numero = teclado.nextInt() ;
			
			}while(numero < 1) ;
			
			if(numero < 10) {
				
				System.out.println("Tiene una sola cifra");
			}
			else if(numero >= 10 && numero < 100) {
				
				System.out.println("Tiene dos cifras");
				
			}
			else if(numero >= 100 && numero < 1000 ) {
				
				System.out.println("Tiene tres cifras");
				
			}
			else {
				
				System.out.println("Tiene cuatro cifras");
				
			}
			
			teclado.close();
			
		}

	}