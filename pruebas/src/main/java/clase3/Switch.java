package clase3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// si es 1 = alta
		// si es 2 = baja
		// si es 3 = modi
		
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingrese opción"
			+ "1 - alta"
			+ "2 - baja"
			+ "3 - modi");
	int opcion = teclado.nextInt();
	
	switch (opcion) {
	case 1:
		System.out.println("Alta");
		System.out.println("Ingrese nombre");
		String nombre = teclado.next();
		System.out.println("Ha ingresado " + nombre);
				
		break;
	case 2:
		System.out.println("Baja");
		break;
	case 3:
		System.out.println("Modi");
		break;
	default:
		System.out.println("Ninguna");
		break;
	}
	teclado.close();
	
	
	
		
		
	}
}