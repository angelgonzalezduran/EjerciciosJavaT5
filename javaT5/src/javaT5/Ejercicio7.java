package javaT5;

import java.util.Scanner;

public class Ejercicio7 {
		 
		static boolean bisiesto(int year) {
				
				if(year % 4 == 0 && year % 100 != 0 ) {
					
					return true ;
				}
				else {
				
					return false ;
				}
			}

			public static void main(String[] args) {
				
				
				//Crea un programa que pida un año por pantalla y muestre si puede o no
				//celebrar su cumpleaños bisiesto en ese año
				
				Scanner teclado = new Scanner(System.in) ;
				
				int year ;
				
				System.out.print("Introduzca un año -> ");
				
				year = teclado.nextInt() ;
				
				if(bisiesto(year) == true) {
					
					System.out.println("Podra celebrar su cumple en el año " + year);
				}
				else if(bisiesto(year) == false) {
					
					System.out.println("No podra celebrar su cumple en el año " + year);
					
				}
	}

}
