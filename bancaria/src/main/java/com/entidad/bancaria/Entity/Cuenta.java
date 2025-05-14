package com.entidad.bancaria.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cuenta {
	private int id;
	private int numeroCuenta;
	private String cliente;
	private Date fechaIngreso;
	private double saldoActual;
	private Boolean estado;
	private double limiteExtraccion;
	
	List<Movimiento> listaMov= new ArrayList<>();

	public Cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuenta(int id, int numeroCuenta, String cliente, Date fechaIngreso, double saldoActual, Boolean estado,
			double limiteExtraccion, List<Movimiento> listaMov) {
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

	public List<Movimiento> getListaMov() {
		return listaMov;
	}

	public void setListaMov(List<Movimiento> listaMov) {
		this.listaMov = listaMov;
	}
	
}