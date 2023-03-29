package Practicas26_03;

import java.util.Scanner;

public class Convertidor {

	public static void main(String[] args) {
	
		Scanner tc = new Scanner(System.in);
		
		
		float km,mill,mts,suma=0;
		int opc = 0;
		
		try {
		System.out.println("Qué desea convertir = \n 1-Kilometos a metros \n 2-Kilometros a millas \n 3-Millas a kilometros \n 4-Millas a metros \n 5-Metros a kilometros a metros \n 6-Metros a millas");
		opc=tc.nextInt();
		switch(opc) {
		
		case 1:
			do {
			System.out.println("Ingrese los kilometros");
			km=tc.nextFloat();
			
			} while (km<=0)	;
				suma= km*1000;
				
				System.out.println("El resultado es = "+suma+" Metros");
			
		
			break;
		case 2:
			
			do {
			System.out.println("Ingrese los kilometros");
			km=tc.nextFloat();

			} while (km<=0)	;
				suma= (float) (km/1.609);
				
				System.out.println("El resultado es = "+suma+" Millas");
			
			break;
		case 3:
			do {
			System.out.println("Ingrese las millas");
			mill=tc.nextFloat();
			 
			}while	(mill<=0);
				suma= (float) (mill*1.609);
				
				System.out.println("El resultado es = "+suma+" Kilometros");
			
			break;
		case 4:
			do {
			System.out.println("Ingrese las millas");
			mill=tc.nextFloat();
			} while(mill<=0);
			
				
				suma= (float) (mill*1609.34);
				
				System.out.println("El resultado es = "+suma+" Metros");
		
			break;
		case 5:
			do {
			System.out.println("Ingrese los kilometros");
			mts=tc.nextFloat();
			}while(mts<=0);
			
				
				suma= mts/1000;
				
				System.out.println("El resultado es = "+suma+" Kilometros");
			
			break;
		case 6: 
			do {
			System.out.println("Ingrese los metros");
			mts=tc.nextFloat();
			} while(mts<=0);
		
				
				suma= (float) (mts/1609.34);
				
				System.out.println("El resultado es = "+suma+" Millas");
		
			break;
			
		default :
			System.out.println("Valor invalido");
		}
		}
		 catch (java.util.InputMismatchException m) {
			System.out.println("Error, la opción tiene que ser numérica");
		}
		
		
		}	
		
		}
	


