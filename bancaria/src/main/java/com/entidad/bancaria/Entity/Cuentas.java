package com.entidad.bancaria.Entity;

import java.sql.Date;

public class Cuentas {
	String id;
	int numeroCuenta;
	String cliente;
	Date fechaIngreso;
	double saldoActual;
	Boolean estado;
	double limiteExtraccion;
	
	
	public Cuentas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuentas(String id, int numeroCuenta, String cliente, Date fechaIngreso, double saldoActual, Boolean estado,
			double limiteExtraccion) {
		super();
		this.id = id;
		this.numeroCuenta = numeroCuenta;
		this.cliente = cliente;
		this.fechaIngreso = fechaIngreso;
		this.saldoActual = saldoActual;
		this.estado = estado;
		this.limiteExtraccion = limiteExtraccion;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
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
	

}
