package practicaAdicionalSemana3;

import java.util.Scanner;

public class datos {

	public static void main(String[] args) {
		//Crear un .java donde se solicite ingresar los datos de los niños y se muestre min, max, promoción y recursar.

		int ninios;
		Object colegio[];
		
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Ingrese cantidad de niños matriculados");
		
		ninios = datos.nextInt();
	
			
		}
		if(ninios > 0) {
			System.out.println("Perfecto, ingrese primer registro en el siguiente orden: (Nombre, Apellido, Número del examen, Nota del examen)");
			
		}else {
			System.out.println("La cantidad de niños a registrar debe ser al menos 1"
					+ "Ingrese cantidad de niños matriculados");
		}
		
		
		System.out.println("listo");
		
	}

}
