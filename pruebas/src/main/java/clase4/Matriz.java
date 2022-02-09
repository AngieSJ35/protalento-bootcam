package clase4;

public class Matriz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int cantFilas = 2;
		int cantCols = 2;
		Integer[][] matriz = new Integer[cantFilas][cantCols];
		

		//tamaños de la matriz
		System.out.println(matriz.length);
		System.out.println(matriz[0].length);
		
		//cargamos
		for(int fila=0; fila< cantFilas; fila++){
			for(int columna=0;columna<cantCols;columna++){
				matriz[fila][columna] = (fila+columna);
				
			}
				
			}
		for(int fila=0; fila< cantFilas; fila++){
			for(int columna=0;columna<cantCols;columna++){
		System.out.println(fila+"-"+ columna+"="+matriz[fila][columna]);
			}
			}
		}
		
	}
