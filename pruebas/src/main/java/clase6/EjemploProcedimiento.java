package clase6;

public class EjemploProcedimiento {

	public static void main(String[] args) {
		
	//invocar el procedimiento
		saludar("¿como estas?");
		
		responder("bien, gracias!");
		
		//calcular la suma de dos variables
		int a = 10;
		int b = 20;
		//asignar el valor de retorno de la funcion a una varible tipo int
		int c = sumar(a,b);
		
	}
	
	static int sumar(int a,int b) {
		/*int res = a + b;
		return res;
		*/
		return a+b;
		
	}
	
	private static void responder(String saludo) {
		System.out.println(saludo);
		
	}


	//un procedimiento
	
	static void saludar(String saludo) {
		System.out.println("Hola" + saludo);
		
		
		
	}

	

}
