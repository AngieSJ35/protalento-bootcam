package clase6.oop;

public class BuscadorMain {

	public static void main(String[] args) {
		// www.mercadolibre.com.co
		Buscador buscador = new Buscador();
		
		String claveDeBusqueda = "Iron Man";
		buscador.definirCalveBusqueda(claveDeBusqueda);
		
		buscador.buscar();
		
		buscador.mostrarResultados();
		
				
	}

}
