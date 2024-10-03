/*
 * El programa crea un HashMap donde se guarda el país y su capital, el usuario escribe en consola el nombre del país del cual quiere saber su capital,
 * si este se encuentra dentro del HashMap devuelve la capital, si no lo contiene le pide al usuario que escriba en la consola el nombre de la capital
 * de ese país, el programa seguira pidiendo al usuario el nombre de otro país del cual quiera saber su capital hasta que el usuario escriba "salir". 
 */

import java.util.HashMap;
import java.util.Scanner;

//Por buenas prácticas cambiamos el nombre de la clase
public class Codigo7 {
	// Se creó el método main
	public static void main(String[] args) {
		// Se importó la clase de Scanner y se agregó un parametro a la creación del objeto
		Scanner s = new Scanner(System.in);
		// Se cambió el nombre de la variable y los tipos de datos del HashMap, y se importó la clase de HashMap 
	    HashMap<String, String> capitales = new HashMap<>();
	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    // Se agregó la cápital de El Salvador 
	    capitales.put("El Salvador", "San Salvador");
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	    // Se corrigió el error de sintaxis de String
	    String c = "";
	    do {
	    	// Se corrigió el error de sintaxis en el sysout
	    	System.out.print("Escribe el nombre de un país y te diré su capital: ");
	    	// Se cambió el tipo de dato que se esperaba en el scanner
	    	c = s.nextLine();
	    	// Se corrigió la sintaxis en el uso del equals
	    	if (!c.equals("salir")) {
	    		// Se cambia el nombre de la variable para que coincida con el HashMap y se cambia donde debe de buscar la coincidencia
	    		if (capitales.containsKey(c)) {
	    			// Se corrigió el error de sintaxis en el sysout
	    			System.out.print("La capital de " + c);
	    			// Se cambia el nombre de la variable para que coincida con el HashMap y se cambio el método que se esta utilizando por un get
	    			System.out.println(" es " + capitales.get(c));
	    		} else {
	    			System.out.print("No conozco la respuesta ");
	    			System.out.print("¿cuál es la capital de " + c + "?: ");
	    			String ca = s.nextLine();
	    			// Se cambia el nombre de la variable para que coincida con el HashMap
	    			capitales.put(c, ca);
	    			System.out.println("Gracias por enseñarme nuevas capitales");
	    		}
	    	}
    	// Se corrigió el error de sintaxis del while y se cerró correctamente la condición
	    }while (!c.equals("salir"));
	  }

}
