package clase4;
import java.util.Arrays;

public class Vectores2 {


	public static void main(String[] args) {
	
	
		String[] nombres = new String [] {"luz", "jose", "edwin", "carlos", "herana", "samir", "elsa"};
	
			// creamos la cantidad de nombres que inician con e
			// creamos el vector con dicho tamaño
		int cantidad = 0;
		for(String nombre : nombres) {
			if(nombre.startsWith("e")) {
				cantidad ++;
			}
		}
		String[] nombresConE = new String[cantidad];
		
		int nuevotamanio = 0;
		
		for(String nombre : nombres) {
			if(nombre.startsWith("e")) {
				nombresConE[nuevotamanio++] = nombre;
			}
		}
		
		System.out.println(Arrays.toString(nombresConE));
		
	 
	}
}
