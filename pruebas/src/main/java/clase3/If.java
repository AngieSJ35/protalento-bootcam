package clase3;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// If 
		
		Scanner teclado = new Scanner (System.in);
		
		//ingrese un dato y si es > de 18 imprimir mayor de edad
		
		System.out.println("ingrese edad");
		
		int edad = teclado.nextInt();
		
		
		if (edad >= 18) {
		
			System.out.println("mayor de edad");
		}else {
			System.out.println("menor de edad");
		}
			teclado.close();
			
		
	}

}
