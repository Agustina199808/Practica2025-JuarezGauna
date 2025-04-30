package com.entidad.bancaria.Entity;

public class Cliente {
	int id;
	String dni;
	String user;
	String clave;
	String nombre;
	String domicilio;
	String correoElec;
	Boolean estado;
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(int id, String dni, String user, String clave, String nombre, String domicilio, String correoElec,
			Boolean estado) {
		super();
		this.id = id;
		this.dni = dni;
		this.user = user;
		this.clave = clave;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.correoElec = correoElec;
		this.estado = estado;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getCorreoElec() {
		return correoElec;
	}
	public void setCorreoElec(String correoElec) {
		this.correoElec = correoElec;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	

}
