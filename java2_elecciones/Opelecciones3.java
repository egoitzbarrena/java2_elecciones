import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.zubiri.elecciones.*;

import java.util.*;
import java.io.*;

/*
CLASSPATH=:/home/zubiri/Elecciones; export CLASSPATH
 *Programa para visualizar en pantalla el area y la circunferencia de un circulo 
 */
public class Opelecciones3 {

	public static void main (String args[]) {
				
		char palabra='T';
		String palabra2="ant";
		
		while (!palabra2.equalsIgnoreCase("T")){
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa la palabra depende de lo que quieras hacer: Ayuntamiento(A),EspacioPublico(E),Inmueble(I),Habitante(H),Partido(P) ?: ");
		palabra2 = sc.nextLine();
		palabra=palabra2.charAt(0);
		//palabra2 = sc.next().charAt(0);
		if ((palabra=='A') || (palabra=='E') || (palabra=='I') || (palabra=='H') || (palabra=='P')){		
		if (palabra=='A') {

			
		System.out.print("\nHAS ELEGIDO Ayuntamiento ");
System.out.print("\n-----------------------------------------------------------------------------------------");
		String calle,ciudad;
		Integer telefono;
		Ayuntamiento ayuntamiento = new Ayuntamiento();

	System.out.print("\ningresa la calle del ayuntamiento: ");
		calle = sc.next();
		ayuntamiento.setCalle(calle);
		System.out.print("\ningresa el telefono del ayuntamiento: ");
		telefono = sc.nextInt();
		ayuntamiento.setTelefono(telefono);
		System.out.print("\ningresa la ciudad del ayuntamiento: ");
		ciudad = sc.next();
		ayuntamiento.setCiudad(ciudad);
		
		System.out.println("\nDatos del AYUNTAMIENTO de " + ayuntamiento.getCiudad());
		System.out.println("\nCiudad: " + ayuntamiento.getCiudad());
		System.out.println("\nCalle: " + ayuntamiento.getCalle());
		System.out.println("\nTelefono: " + ayuntamiento.getTelefono());


	}
		
	else if (palabra=='E'){

	System.out.print("\nHAS ELEGIDO EspacioPublico ");
System.out.print("\n***********************************************************************************");
		String calle,ciudad,nombre;
		Integer telefono;

		EspacioPublico espacio = new EspacioPublico();

		System.out.print("\ningresa el nombre del Espacio Publico: ");
		nombre = sc.next();
		espacio.setNombre(nombre);
		
		System.out.print("\ningresa la ciudad del Espacio Publico: ");
		ciudad = sc.next();
		espacio.setCiudad(ciudad);

		System.out.print("\ningresa la calle del Espacio Publico: ");
		calle = sc.next();
		espacio.setCalle(calle);

		System.out.print("\ningresa el telefono del Espacio Publico: ");
		telefono = sc.nextInt();
		espacio.setTelefono(telefono);
		
				
		System.out.println("\nDatos del ESPACIO PUBLICO " );
		System.out.println("\nNombre: " + espacio.getNombre());
		System.out.println("\nCiudad: " + espacio.getCiudad());
		System.out.println("\nCalle: " + espacio.getCalle());
		System.out.println("\nTelefono: " + espacio.getTelefono());

	

	}
	else if (palabra=='I'){

	System.out.print("\nHAS ELEGIDO Inmueble ");
System.out.print("\n***********************************************************************************");
		String calle,ciudad;

		Inmueble inmueble = new Inmueble();
		
		System.out.print("\ningresa la ciudad del Espacio Publico: ");
		ciudad = sc.next();
		inmueble.setCiudad(ciudad);

		System.out.print("\ningresa la calle del Espacio Publico: ");
		calle = sc.next();
		inmueble.setCalle(calle);

				
		System.out.println("\nDatos del INMUEBLE " );
		System.out.println("\nCiudad: " + inmueble.getCiudad());
		System.out.println("\nCalle: " + inmueble.getCalle());

	

	}
	else if (palabra=='H'){

	System.out.print("\nHAS ELEGIDO Habitante ");
System.out.print("\n***********************************************************************************");

String nombrefichero = "censo.txt";
String ruta ="/home/zubiri/elecciones";
ArrayList<Habitante> habitantes = new ArrayList<Habitante>();

//Instanciamos el fichero donde estan los datos
File archivo = new File(ruta, nombrefichero);
Scanner s = null;
try {
	// Leemos el contenido del fichero
	System.out.println("... Leemos el contenido del fichero ...");
	s = new Scanner(archivo);
	// Obtengo los datos de los partidos de fútbol del fichero
	while (s.hasNextLine()){
		String linea = s.nextLine();	// Obtengo una linea del fichero (un partido de fútbol)
		String [] cortarString = linea.split(" , ");		// Obtengo los datos del partido de futbol
		Habitante habitantese = new Habitante();	// Creo un objeto de la clase "PartidoFutbol"

		// Pongo los atributos al objeto "partido"

		habitantese.setDni(cortarString[0]);
		habitantese.setNombre(cortarString[1]);
		habitantese.setApellido(cortarString[2]);
		habitantese.setEdad(Integer.parseInt(cortarString[3]));

		// Añadimos el objeto "partido" al ArrayList
		
		if (habitantese.getEdad()>=18){
		habitantes.add(habitantese);
		
		System.out.println("DNI:" + habitantese.getDni());
		System.out.println("Nombre:" + habitantese.getNombre());
		System.out.println("Apellido:" + habitantese.getApellido());
		System.out.println("Edad:" + habitantese.getEdad());
habitantes.clear();
		}

	}
	


	} 
catch (Exception e) {
		e.printStackTrace();
	} finally{
		try {
			if (s != null)
				s.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	}
	
	else if (palabra=='P'){

	System.out.print("\nHAS ELEGIDO Partido ");
System.out.print("\n***********************************************************************************");
System.out.print("\ningresa QUE QUIERES HACER: ESCRIBIR (E) O LEER (L) O VER DATOS(D) ");
		String p = sc.nextLine();
		char p2=p.charAt(0);
			if (p2=='E') {

			
		System.out.print("\nHAS ELEGIDO ESCRIBIR ");
System.out.print("\n---------------------------------------------------------");
	
	 PrintWriter salida = null;
        try {
            salida = new PrintWriter("/home/zubiri/elecciones/listapartidos2.txt");
            String cadena;
            System.out.println("Escribe los nombres de los 5 partidos politicos. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine();
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);
                cadena = sc.nextLine();
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {         
            salida.close();
        }

}
		
	else if (p2=='L'){

	System.out.print("\nHAS ELEGIDO LEER ");
System.out.print("\n***************************************************");

String nombrefichero = "listapartidos.txt";
String ruta ="/home/zubiri/elecciones";
ArrayList<Partido> partidos = new ArrayList<Partido>();

//Instanciamos el fichero donde estan los datos
File archivo = new File(ruta, nombrefichero);
Scanner s = null;
try {
	// Leemos el contenido del fichero
	System.out.println("... Leemos el contenido del fichero ...");
	s = new Scanner(archivo);
	// Obtengo los datos de los partidos de fútbol del fichero
	while (s.hasNextLine()){
		String linea = s.nextLine();	// Obtengo una linea del fichero (un partido de fútbol)
		String [] cortarString = linea.split(" , ");		// Obtengo los datos del partido de futbol
		Partido partidose = new Partido();	// Creo un objeto de la clase "PartidoFutbol"

		// Pongo los atributos al objeto "partido"
		partidose.setNombre(cortarString[0]);
		partidose.setDirecciones(cortarString[1]);
		partidose.setCiudad(cortarString[2]);
		partidose.setEmail(cortarString[3]);
		partidose.setTelefono(Integer.parseInt(cortarString[4]));

		// Añadimos el objeto "partido" al ArrayList
		partidos.add(partidose);
		
		System.out.println("Nombre:" + partidose.getNombre());
		System.out.println("Direccion:" + partidose.getDirecciones());
		System.out.println("Ciudad:" + partidose.getCiudad());
		System.out.println("Correo o email:" + partidose.getEmail());
		System.out.println("Telefono:" + partidose.getTelefono());

partidos.clear();
	}
	

	} 
catch (Exception e) {
		e.printStackTrace();
	} finally{
		try {
			if (s != null)
				s.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	}
			

	else if (p2=='D') {

		System.out.print("\nHAS ELEGIDO mirar los datos del PARTIDO ");
System.out.print("\n***********************************************************************************");

		
	}
	

	}
	}
	
	else 
	{
	System.out.print("\nHAS ELEGIDO EL terminar ");
	break;
	}
	}
	}
	
}
