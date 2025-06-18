package com.entidad.bancaria.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entidad.bancaria.Entity.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Integer>{
	Cuenta findBynumeroCuenta(int numCuenta);
}
