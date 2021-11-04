package javaT5;

import java.util.Scanner;

public class Ejercicio8 {

public static void main(String[] args) {
	
	//Crear un programa que calcule el area del círculo o de un triángulo.
		
		Scanner teclado = new Scanner(System.in) ;
		
		String menu ;
		
		int radio , altura, base ;
		
		do {
			System.out.println("Bienvenido a este programa. Indique qué desea calcular el area de un CÍRCULO o de un TRIÁNGULO");
		
			menu = teclado.nextLine() ;
		
		}while(!menu.equalsIgnoreCase("circulo") && !menu.equalsIgnoreCase("triangulo")) ;
		
		menu = menu.toUpperCase() ;
		
		switch (menu) {
		
			case "CIRCULO":
				
				System.out.print("introduzcame el radio del circunferencia ->");
				
				radio = teclado.nextInt() ;
				
				System.out.println("El area es: " + (Math.pow(2, radio) * 3.141516));
				break;
			
			case "TRIANGULO":
				
				System.out.print("introduzca la altura del triángulo:");
				
				altura = teclado.nextInt() ;
				
				System.out.print("introduzca la base del triángulo: ");
				
				base = teclado.nextInt() ;
				
				System.out.println("El area del triángulo es : " + (base * altura)/2) ;
				
				break ;
		}
		
		teclado.close();
	}

}
