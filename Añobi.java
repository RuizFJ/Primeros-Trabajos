package Año;

import java.util.Scanner;

public class Añobi {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int año;
		
		do {
			System.out.println("Ingrese el año");
			año=teclado.nextInt();
			
		} while (año<0);
			
			
			if (año%4==0) {
				System.out.println("El año ingresado es bisiesto");
			} else {
				System.out.println("El año ingresado no es bisiesto");
			}

	}

}
