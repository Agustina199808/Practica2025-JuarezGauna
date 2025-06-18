package com.entidad.bancaria.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entidad.bancaria.Entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
Cliente findByDni(String dni);
}
