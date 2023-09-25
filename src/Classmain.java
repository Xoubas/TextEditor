
/*Haz un programa que recoja el nombre de un fichero y muestre su contenido si
existe o cree un nuevo en el que puedas escribir si no existe. Ejemplo: java Editor
proba.txt*/

import java.io.IOException;

public class Classmain {
	public static void main(String[] args) {
		Document soc = new Document("/home/stx/Desktop/cosa.txt");
		if(soc.exists()==false)
			System.exit(1);
		
	}
}
