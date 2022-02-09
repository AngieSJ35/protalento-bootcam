package clase4;

public class VectorObject {

	public static void main(String[] args) {
		
		Object edad = 10;
		Object nombres = "carlos";
		Object flag = true;
		Object letra = "a";
		
		Object[] datos = new Object[] {edad,nombres,flag,letra};
		
		//variable que son boolean
		
		for(Object dato : datos ) {
			if( dato instanceof Boolean) {
				boolean aux = (Boolean)dato;
				System.out.println("Encontre !!!");
			}
		}
	
	}

}
