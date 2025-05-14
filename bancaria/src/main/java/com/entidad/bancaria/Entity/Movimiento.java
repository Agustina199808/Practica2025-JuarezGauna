package com.entidad.bancaria.Entity;

import java.util.Date;

public class Movimiento {
	
	private int id;
	private Date fecha;
	private double importe;
	private String tipoOp;
	private Cuenta cuenta;
	
	
	public Movimiento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movimiento(int id, Date fecha, double importe, String tipoOp, Cuenta cuenta) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.importe = importe;
		this.tipoOp = tipoOp;
		this.cuenta = cuenta;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getTipoOp() {
		return tipoOp;
	}
	public void setTipoOp(String tipoOp) {
		this.tipoOp = tipoOp;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}	
	

}
