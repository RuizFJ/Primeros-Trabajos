package clase2903.src.clase2903;

import java.util.Scanner;

public class practica {

	public static void main(String[] args) {
		
		
		Scanner tc =new Scanner(System.in);
		
		int n,voltaje,max=0,min=0;
		float prom=0,prom2=0;
		
		try {
			do {
		System.out.println("¿Cuantos voltajes dese ingresar?");
		n=tc.nextInt();
			} while(n<=0);
			
		for (int i=1;i<=n;i++) {
			
			System.out.println("Ingrese el voltaje "+"["+i+"]");
			voltaje=tc.nextInt();
			
			prom= (voltaje + prom);
			prom2= prom/n;
			
			if (i==1) {
				
				min=voltaje;
					
			} else if (voltaje<min) {
				
				min = voltaje;
				
			} 
			max=voltaje;
			
			if (voltaje>max) {
				max = voltaje;
			}
			
		}System.out.print("El promedio de los voltajes es = "+prom2+"\nEl numero menor es = "+min+"\nEl numero mayor es = "+max);
		
		} catch (java.util.InputMismatchException m) {
			
			System.out.println("ERROR, el valor tiene que ser numerico");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
