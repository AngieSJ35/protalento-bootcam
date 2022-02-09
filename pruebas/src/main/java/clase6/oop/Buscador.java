package clase6.oop;

public class Buscador {

	private String claveBusqueda;
	private Articulo[] resultados;
	
	Buscador() {
		
		
	}
	
	void buscar() {
		System.out.println("Buscando..." + this.claveBusqueda);
		
		//como mi buscador necesita usar un objeto de la clade DB
		// debe instanciar un objero de dicha clase
		
	DB db = new DB();
	
	this.resultados =  db.consultar(claveBusqueda);
		
	}
	
	void definirCalveBusqueda(String clave) {
		claveBusqueda = clave;
		
	}
	
	void mostrarResultados() {
		if(this.resultados.length > 0 ) {
			for(Articulo aux: this.resultados) {
				aux.detalleArticulo();
			}
		}else {
			System.out.println("No hay resultados para la clave de busqueda");
		}
	}
	
}
