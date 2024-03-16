package com.ejemplo.Crud.Example.Modelo;

public class PeopleModel {
	
	private int IdPeople;
	private String Nombre;
	private String Apellido;
	private String Dui;
	private String Genero;
	
	public PeopleModel( String nombre, String apellido, String dui, String genero) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Dui = dui;
		Genero = genero;
	}
	
	public PeopleModel() {
		super();
	}
	public int getIdPeople() {
		return IdPeople;
	}
	public void setIdPeople(int idPeople) {
		IdPeople = idPeople;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDui() {
		return Dui;
	}
	public void setDui(String dui) {
		Dui = dui;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	
	@Override
	public String toString() {
		return "PeopleModel [IdPeople=" + IdPeople + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Dui=" + Dui
				+ ", Genero=" + Genero + "]";
	}
}
