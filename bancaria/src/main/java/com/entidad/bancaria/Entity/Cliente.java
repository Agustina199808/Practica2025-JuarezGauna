package com.entidad.bancaria.Entity;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dni;
	private String user;
	private String clave;
	private String nombre;
	private String apellido;
	private String domicilio;
	private String correoElec;
	private Boolean estado;
	
	@OneToMany(mappedBy = "cliente")
	private Set<Cuenta>cuentas;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(int id, String dni, String user, String clave, String nombre, String apellido, String domicilio,
			String correoElec, Boolean estado, Set<Cuenta> cuentas) {
		super();
		this.id = id;
		this.dni = dni;
		this.user = user;
		this.clave = clave;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.correoElec = correoElec;
		this.estado = estado;
		this.cuentas = cuentas;
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	public Set<Cuenta> getCuentas() {
		return cuentas;
	}
	public void setCuentas(Set<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	
}