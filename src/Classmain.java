
/*Haz un programa que recoja el nombre de un fichero y muestre su contenido si
existe o cree un nuevo en el que puedas escribir si no existe. Ejemplo: java Editor
proba.txt*/

import java.io.IOException;

public class Classmain {
	public static void main(String[] args) {
		Document soc = new Document("/home/sanclemente.local/a21javierbq/Escritorio/cosa.txt");
		System.out.println(soc.toString());
		System.out.println(soc.getFile());
	}
}
