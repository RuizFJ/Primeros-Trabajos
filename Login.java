package Prueba;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner tc = new Scanner(System.in);
		
		String Contraseña= "hola", usuario1= "fran",usuario3=null ; // El primero es la contraseña y el segundo es el nombre de usuario
		String pass, usuario2,pass2=null ;
		int intentos=0;
		
		
		System.out.println("Ingrese el nombre de usuario");
		usuario2=tc.nextLine();
		
		usuario3= usuario2.toLowerCase();
		if (usuario1.equals(usuario3))  {
			
			System.out.println("Bienvenido");
			
			System.out.println("Ingrese su clave");
			pass=tc.nextLine();
			pass2=pass.toLowerCase();
			if (Contraseña.equals(pass2)) {
				System.out.println("Bienvenido de nuevo");
			} else {
				while (!Contraseña.equals(pass2) && intentos<3) {
					System.out.println("Contraseña incorrecta vuelva a escribirla");
					pass=tc.nextLine();
					intentos++;
					if (Contraseña.equals(pass2)) {
						System.out.println("Bienvenido de nuevo");
					} 	
					
				}
			}	
				
		} else {
			
			while (!usuario1.equals(usuario3) && intentos<=2) {
			System.out.println("Usuario incorrecto ingrese de nuevo");
			intentos++;
			usuario2=tc.nextLine();
			usuario3= usuario2.toLowerCase();
			}
			if (usuario1.equals(usuario3)){
			System.out.println("Bienvenido, Ingrese su clave");
			pass=tc.nextLine();
			pass2=pass.toLowerCase();
			if (Contraseña.equals(pass2)) {
				System.out.println("Bienvenido de nuevo");
			} else {
				while (!Contraseña.equals(pass2) && intentos<3) {
					System.out.println("Contraseña incorrecta vuelva a escribirla");
					pass=tc.nextLine();
					pass2=pass.toLowerCase();
					intentos++;
					if (Contraseña.equals(pass2)) {
						System.out.println("Bienvenido de nuevo");
			
					}
				}
			}
			}
		}
		 if (intentos==3) {
			System.out.println("Intentos agotados");
		}	
	}

}
