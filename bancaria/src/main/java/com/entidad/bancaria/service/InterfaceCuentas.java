package com.entidad.bancaria.service;

import java.util.List;

import com.entidad.bancaria.Entity.Cuenta;
import com.entidad.bancaria.Entity.Movimiento;

public interface InterfaceCuentas {
	public void altaCuenta();
	public void guardar(Cuenta cuenta);
	public List<Movimiento>listaCuentas();
}
