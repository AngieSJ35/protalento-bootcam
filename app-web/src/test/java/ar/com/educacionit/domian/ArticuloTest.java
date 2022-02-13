package ar.com.educacionit.domian;

import java.util.Date;

import ar.com.educationit.domain.Articulos;

public class ArticuloTest {

	public static void main(String[] args){
		
		Articulos miArticulo = new Articulos("titulo1", new Date(), "0001", 2500d,5,1l,1l);
		
		String titulo = miArticulo.getTitulo(true);
		
		boolean iguales = titulo.equals("TITULO1");
		if(iguales) {
			System.out.println("ok");
		}else {
			System.out.println("fail");
		}
	}
}
