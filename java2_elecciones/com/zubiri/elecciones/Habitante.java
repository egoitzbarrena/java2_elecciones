package com.zubiri.elecciones;

public class Habitante {

public String dni;
public String nombre;
public String apellido;
public Integer edad;
public Integer telefono;
public String ciudad;


public Integer getTelefono(){
	
	return telefono;
}

public void setTelefono(Integer  telf){

	telefono=telf;

}

public String  getCiudad(){
	
	return ciudad;
}

public void setCiudad(String  ciu){

	ciudad=ciu;

}

 
public Integer getEdad(){
	
	return edad;
}

public void setEdad(Integer ed){

	edad=ed;

}



public String  getDni(){
	
	return dni;
}

public void setDni(String dn){

	dni=dn;

}

public String  getNombre(){
	
	return nombre;
}

public void setNombre(String  nom){

	nombre=nom;

}

public String  getApellido(){
	
	return apellido;
}

public void setApellido(String  ape){
 
	apellido=ape;

}

}
