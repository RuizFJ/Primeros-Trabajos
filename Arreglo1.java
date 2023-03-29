package tareas;

import java.util.Scanner;

public class Arreglo1 {

	public static void main(String[] args) {
		
		Scanner tecla= new Scanner(System.in);
		
		float [] notas = new float[3];
		float [] notas2 = new float[3];
		float suma=0,suma2=0;
		String nombre1,nombre2;
		
		System.out.println("Hola bienvenido ingrese su nombre");
		nombre1=tecla.nextLine();
		
		for(int i=0; i<3; i++) {
			System.out.println("Ingrese la nota = " +" [" +i +"]");
		notas[i]= tecla.nextFloat();
		
		
			
		} 
		for(int i=0;i<3;i++) {
			
			suma+= notas[i];
			
			
			
		}
		
		System.out.println(" ");
		System.out.println("Hola bienvenido ingrese su nombre");
		nombre2=tecla.next();
		
		for(int j=0; j<3; j++) {
			System.out.println("Ingrese la nota = " +" [" +j +"]");
		notas2[j]= tecla.nextFloat();
		
		
		  
		} System.out.println(nombre1+" " +"su promedio es"); 
		System.out.println(suma/3);
		System.out.println(nombre2+" " +"su promedio es");
		for(int j=0;j<3;j++) {
			
			suma2+= notas2[j];
			
			
			
		} System.out.println(suma2/3);
			
		
		
		

	}

}
