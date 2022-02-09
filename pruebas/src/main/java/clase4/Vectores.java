package clase4;
import java.util.Arrays;

public class Vectores {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Crear vectores
		// tipoDatos []  nombre = new tipoDeDatos [] {valor1, valor2, valor3}
		// tipoDato [] nombre = new tipoDeDatos [tamaño]
		
		String[] nombres = new String [] {"luz", "jose", "edwin", "carlos", "herana", "samir", "elsa"};
		String[] nombresConE = new String[nombres.length];
		int j = 0;
		
		int size = nombres.length; //sabemos el tamaño del vector
		
		// buscar ñps nombre que inicien con e
		
		for(int i=0; i < size ; i++) {
			String nombre = nombres[i];
			/*if(dato.substring(0,1)  == "e"); {
				
			}
			if(dato.charAt(0) == "e") {
				
			}
			if(dato.indexOf("e") ==  0) {
				
			}*/
			if(nombre.startsWith("e")) {
				nombresConE[j] = nombre;
				j++;
				
			}
		}
		System.out.println(Arrays.toString(nombresConE));
		for(String nombre : nombresConE) {
			if( nombre != null) {
				System.out.println(nombre);
			}
		}
		
	}

}
