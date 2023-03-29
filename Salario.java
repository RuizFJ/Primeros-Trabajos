package Practica280323;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner tc=new Scanner(System.in);
		
		int salario=1000,carros=150,carros1;
	    float	comision,comision1=0,comision2=0,resultado=0;
		String nombre;
		try {
		System.out.println("Hola bienvenido por favor ingrese su nombre");
		nombre=tc.nextLine();
		do {
		System.out.println(nombre + " Ingrese cuántos carros usted vendió en el mes");
		carros1=tc.nextInt();
		} while (carros1<0);
		
		for (int i=1;i<=carros1;i++) {
			
			System.out.println("Ingrese el valor del carro "+i);
			comision=tc.nextFloat();
			
			comision1= (float) (comision*0.05);
			comision2=comision1 + comision2;
			
			System.out.println(comision2);
			
		} 
		
		resultado= salario+comision2+(carros*carros1);
		
		System.out.println(nombre+" Su salario del mes es la cantidad de = "+resultado);
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("El valor tiene que ser numerico");
		}
		
		Salario.main(null);
	}

	
	}


