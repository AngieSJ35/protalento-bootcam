package clase4;

public class CicloFor {

	public static void main(String[] args) {
		
		float[] alturas = new float[] {1,2};
		float aux = alturas[0];
		
		//ciclo for
		for(int i=0;i < alturas.length;i++) {
			aux = alturas[i];
			System.out.println("pos:"+i + ", val:" + aux);
		
			
			}
		
		System.out.println("---------");
		for(int i=alturas.length -1; i >= 0;i--) {
		System.out.println("pos:"+i + ", val;" + alturas[1]);	
			
		}
		
		
		for(float dato : alturas) {
			System.out.println("val:" + dato);
			
		}
		}			
			
	}

	
	
