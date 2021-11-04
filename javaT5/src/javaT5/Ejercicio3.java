package javaT5;

import java.util.Scanner;

public class Ejercicio3 {


	public static void main(String[] args) {
		
		//Crea un programa que ordene de mayor a menor los números
		//introducidos
		
		Scanner teclado = new Scanner(System.in) ;
		
		int n1 , n2 , n3  ;
		
		System.out.print("Introduzca un numero -> ");
		
		n1 = teclado.nextInt() ;
		
		System.out.print("Introduzca un numero -> ");
		
		n2 = teclado.nextInt() ;
		
		System.out.print("Introduzca un numero -> ");
		
		n3 = teclado.nextInt() ;
		
		if(n1 > n2 && n1 > n3 && n2 > n3) {
		
			if(n2>n3){
				
				System.out.println(n1 + " > " + n2 + " > " +  n3 );
				
			}
			else {
				
				System.out.println(n1 + " > " + n3 + " > " +  n2 );
			}
			
		}
		else if(n2 > n1 && n2 > n3) {
			
			if(n1>n3){
				
				System.out.println(n2 + " > " + n1 + " > " +  n3 );
				
			}
			else {
				
				System.out.println(n2 + " > " + n3 + " > " +  n1 );
			}
			
		}
		else {
			
			
			if(n2>n1){
				
				System.out.println(n3 + " > " + n2 + " > " +  n1 );
				
			}
			else {
				
				System.out.println(n3 + " > " + n1 + " > " +  n2 );
			}
			
			
			
		}

		teclado.close();

	}

}