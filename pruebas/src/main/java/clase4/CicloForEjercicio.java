package clase4;

import java.util.Arrays;
import java.util.Scanner;

public class CicloForEjercicio {

	public static void main(String[] args) {
		
		// solicitar la usuario la cantidad de registros
		// cargar en un vector de enteros los datos ingresados por el usuario
		// contar la cantidad de números pares
		// contar la cantidad de números impares
		// sumar los números pares
		// sumar los números impares
		// promedio de los valores ingresados
		
		int cantidadRegistros;
		int[] vector;
		int cantPares = 0;
		int cantImpares = 0;
		int sumaPares = 0;
		int sumaImpares = 0;
		double promedio;
		
		// 0 definir el tamaño del vector
		//1 carga de datos
		//2 procesamiento
		
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Ingrese la cantidad de registros a procesar");
			cantidadRegistros = teclado.nextInt();
		}while(cantidadRegistros <= 0);
		
		vector = new int[cantidadRegistros];
		
		for(int i=0; i< cantidadRegistros ; i++) {
			System.out.println("Ingrese un dato");
			int datoleido = teclado.nextInt();
			vector[i] = datoleido;
			
		
		}
		
		//procesamiento
		
		for(int datoleido : vector) {
			
			if(datoleido % 2 == 0) {
				cantPares++;
				sumaPares+= datoleido;
				
			}else { 
				cantImpares++;
				sumaImpares+= datoleido;
				
			}
		}
		
		
		promedio = ((double)(sumaPares + sumaImpares) / vector.length);
		
		//mostrar datos
		System.out.println(Arrays.toString(vector));
		
		System.out.println("Cantidad de registros: " + cantidadRegistros);
		System.out.println("Cantidad de pares: " + cantPares);
		System.out.println("Cantidad de impares: " + cantImpares);
		System.out.println("Suma de pares: " + sumaPares);		
		System.out.println("Suma de impares:" + sumaImpares);
		System.out.println("Promedio: " + promedio);
		
		teclado.close();
	}

}
