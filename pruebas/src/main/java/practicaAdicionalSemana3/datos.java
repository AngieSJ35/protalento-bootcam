package practicaAdicionalSemana3;

import java.util.Scanner;

public class datos {

	public static void main(String[] args) {
		//Crear un .java donde se solicite ingresar los datos de los ni�os y se muestre min, max, promoci�n y recursar.

		int ninios;
		Object colegio[];
		
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Ingrese cantidad de ni�os matriculados");
		
		ninios = datos.nextInt();
	
			
		}
		if(ninios > 0) {
			System.out.println("Perfecto, ingrese primer registro en el siguiente orden: (Nombre, Apellido, N�mero del examen, Nota del examen)");
			
		}else {
			System.out.println("La cantidad de ni�os a registrar debe ser al menos 1"
					+ "Ingrese cantidad de ni�os matriculados");
		}
		
		
		System.out.println("listo");
		
	}

}
