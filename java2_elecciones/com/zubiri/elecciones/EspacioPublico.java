package com.zubiri.elecciones;


public class EspacioPublico {

private String calle;
private String nombre;
private String ciudad;
private Integer telefono;


public String  getCalle(){

	return calle;

}

	
public void setCalle(String ca){

	calle=ca;

}

public Integer getTelefono(){
	
	return telefono;
}

public void setTelefono(Integer  telf){

	telefono=telf;

}

public String  getNombre(){
	
	return nombre;
}

public void setNombre(String  nom){

	nombre=nom;

}

public String  getCiudad(){
	
	return ciudad;
}

public void setCiudad(String  ciu){

	ciudad=ciu;

}

}
