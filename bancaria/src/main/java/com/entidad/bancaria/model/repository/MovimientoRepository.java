package com.entidad.bancaria.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entidad.bancaria.Entity.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Integer>{

}
