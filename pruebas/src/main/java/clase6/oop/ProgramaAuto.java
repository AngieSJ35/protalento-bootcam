package clase6.oop;

public class ProgramaAuto {

	public static void main(String[] args) {
		
		//instanciar un objeto de la clase auto
		
		Auto miClio = new Auto("renault", "clio mio", 178); //constructor
		miClio.detalleAuto();
		
		/*Auto miTesla = new Auto("tesla", "modelo1", 200);
		Auto miClio2 = new Auto("tesla", "modelo1", 200);
		Auto miClio3 = miClio;*/
		//ctrl+shif+i para re instanciar
		miClio.encender();
		miClio.detalleAuto();
		
		miClio.acelerar();
		miClio.detalleAuto();
		
		miClio.apagar();
		miClio.detalleAuto();
		
		miClio = null;
				
	}


}
