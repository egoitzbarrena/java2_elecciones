package com.zubiri.elecciones;


public class Partido {

private String direccionsede;
private String nombre;
private String ciudad;
private String email;
private Integer telefono;

public Integer getTelefono(){
	
	return telefono;
}

public void setTelefono(Integer  telf){

	telefono=telf;

}
public String  getDirecciones(){
	
	return direccionsede;
}

public void setDirecciones(String direc){

	direccionsede=direc;

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

public String  getEmail(){
	
	return email;
}

public void setEmail(String  ema){

	email=ema;

}

}
