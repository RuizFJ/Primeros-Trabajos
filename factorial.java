package pracitica;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		Scanner tc=new Scanner(System.in);
		
		double facto,factoa=1,factoc = 0;
		try {
		do {
		System.out.println("Ingrese el valor que desea sacar factorial");
		facto=tc.nextInt();
		}while (facto<0);
		
		for(int i=1;i<=facto;i++) {
			
			factoa=factoa*i;
			System.out.println("!"+facto);
		}System.out.println(facto+"!= "+factoa);
		
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("No puede ser una letra");
		} factorial.main(null);
		
		
		
		

	}

}
