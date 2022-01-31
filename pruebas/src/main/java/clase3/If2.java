package clase3;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// If 
		
		String usuario;
		String contrasenia;
		
		usuario = "jose";
		contrasenia = "12345";
		
		if(usuario == "admin" && contrasenia == "1234") {
			System.out.println("ok");
		}else {
			System.out.println("fail");
		}
		
		if(usuario == "admin") {
			if(contrasenia == "1234") {
	}else {
		System.out.println("fail");
	}
	}else
		System.out.println("fail");
		
}
}
