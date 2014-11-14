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
public class Opelecciones {

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

		String dni,ciudad,nombre,apellido;
		Integer telefono,edad;

		Habitante habitante = new Habitante();

		System.out.print("\ningresa el dni del Habitante: ");
		dni = sc.next();
		habitante.setDni(dni);

		System.out.print("\ningresa el apellido del Habitante: ");
		apellido = sc.next();
		habitante.setApellido(apellido);

		System.out.print("\ningresa el nombre del Habitante: ");
		nombre = sc.next();
		habitante.setNombre(nombre);

		System.out.print("\ningresa la edad del Habitante: ");
		edad = sc.nextInt();
		habitante.setEdad(edad);

		System.out.print("\ningresa la ciudad del Habitante: ");
		ciudad = sc.next();
		habitante.setCiudad(ciudad);

		System.out.print("\ningresa el telefono del Habitante: ");
		telefono = sc.nextInt();
		habitante.setTelefono(telefono);
		

		
		System.out.println("\nDatos del HABITANTE " );
		System.out.println("\nDNI: " + habitante.getDni());
		System.out.println("\nNombre: " + habitante.getNombre());
		System.out.println("\nApellido: " + habitante.getApellido());
		System.out.println("\nEdad: " + habitante.getEdad());
		System.out.println("\nCiudad: " + habitante.getCiudad());
		System.out.println("\nTelefono: " + habitante.getTelefono());

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
            salida = new PrintWriter("/home/zubiri/elecciones/listapartidos.txt");
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

BufferedReader in = null;
ArrayList <String> myList = new ArrayList <String>();
try {   
    in = new BufferedReader(new FileReader("/home/zubiri/elecciones/listapartidos.txt"));
    String str;
    while ((str = in.readLine()) != null) {
        myList.add(str);
				for(int r=0;r<myList.size();r++)
				{
   					 System.out.println(" -->"+myList.get(r));
				}
    }
} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
} finally {
	try {
		 if (in != null) {
        in.close();
    } 
} catch (IOException e) {
                System.out.println(e.getMessage());
            }
	}
   

}
	else if (p2=='D') {

		System.out.print("\nHAS ELEGIDO mirar los datos del PARTIDO ");
System.out.print("\n***********************************************************************************");

		String direccionsede,nombre,ciudad,email;
		Integer telefono;

		Partido partidos = new Partido();

		System.out.print("\ningresa la direccion de la sede: ");
		direccionsede = sc.next();
		partidos.setDirecciones(direccionsede);

		System.out.print("\ningresa el nombre del partido: ");
		nombre = sc.next();
		partidos.setNombre(nombre);

		System.out.print("\ningresa la ciudad del partidos: ");
		ciudad = sc.next();
		partidos.setCiudad(ciudad);

		System.out.print("\ningresa el email del partido: ");
		email = sc.next();
		partidos.setEmail(email);

		System.out.print("\ningresa el telefono del partido: ");
		telefono = sc.nextInt();
		partidos.setTelefono(telefono);
		

		
		System.out.println("\nDatos del PARTIDO " );
		System.out.println("\nDireccion Sede: " + partidos.getDirecciones());
		System.out.println("\nNombre: " + partidos.getNombre());
		System.out.println("\nCiudad: " + partidos.getCiudad());
		System.out.println("\nEmail: " + partidos.getEmail());
		System.out.println("\nTelefono: " + partidos.getTelefono());


		
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
