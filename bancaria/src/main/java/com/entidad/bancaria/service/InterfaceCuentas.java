package com.entidad.bancaria.service;

import java.util.List;
import java.util.Optional;

import com.entidad.bancaria.Entity.Cuenta;
import com.entidad.bancaria.Entity.Movimiento;

public interface InterfaceCuentas {
	public void altaCuenta(Cuenta cuenta, String dni);
	public List<Cuenta>listaCuentas();
	public void actualizar(Cuenta cuenta);
	public Cuenta buscar(int numeroCuenta);
	Optional<Cuenta> buscarCuenta(int id);
	public void eliminarCuenta(Cuenta cuenta, boolean estado, int id);
}
