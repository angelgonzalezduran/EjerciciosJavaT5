package javaT5;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//Crea un programa que realice un descuento en un precio introducido por el usuario.
		
			Scanner teclado = new Scanner(System.in) ;
			
			int precio , descuento ,tfinal ;
			
			System.out.print("Bienvenidos a Mercadower indique el precio total :");
			
			precio = teclado.nextInt() ;
			
			descuento = precio * 20 / 100 ;
			
			tfinal = precio - descuento ;
			
			System.out.println("El precio final es : " + tfinal + " Se te ha descontado: " + descuento + "€");
			
			teclado.close();
		}
	}