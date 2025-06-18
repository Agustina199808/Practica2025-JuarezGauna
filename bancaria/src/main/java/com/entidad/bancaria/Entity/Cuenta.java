package com.entidad.bancaria.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class Cuenta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numeroCuenta;
	private Date fechaIngreso;
	private double saldoActual;
	private Boolean estado;
	private double limiteExtraccion;
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "cuenta")
	private Set<Movimiento> listaMov;
	
	

	public Cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuenta(int id, int numeroCuenta, Cliente cliente, Date fechaIngreso, double saldoActual, Boolean estado,
			double limiteExtraccion, Set<Movimiento> listaMov) {
		super();
		this.id = id;
		this.numeroCuenta = numeroCuenta;
		this.cliente = cliente;
		this.fechaIngreso = fechaIngreso;
		this.saldoActual = saldoActual;
		this.estado = estado;
		this.limiteExtraccion = limiteExtraccion;
		this.listaMov = listaMov;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public double getLimiteExtraccion() {
		return limiteExtraccion;
	}

	public void setLimiteExtraccion(double limiteExtraccion) {
		this.limiteExtraccion = limiteExtraccion;
	}

	public Set<Movimiento> getListaMov() {
		return listaMov;
	}

	public void setListaMov(Set<Movimiento> listaMov) {
		this.listaMov = listaMov;
	}
	
}