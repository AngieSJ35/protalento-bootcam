package clase6.oop;

public class DB {
	
	//no tiene atributos
	//no tiene constructor
	
	Articulo[] consultar(String claveConsultada) {
		//simular datos
		
		Articulo res1 = new Articulo("Figura De Marvel 1", 35940, "http://imagen.jpg",true, 0, true);
		Articulo res2 = new Articulo("Figura de Marvel 2", 34930, "http://otraimagen.jpg",false, 2, false);
		
				
		Articulo[] resultados = new Articulo[] {res1, res2};
		return resultados;
		

		}
}
