package com.entidad.bancaria.Implementacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entidad.bancaria.Entity.Cliente;
import com.entidad.bancaria.Entity.Cuenta;
import com.entidad.bancaria.model.repository.ClienteRepository;
import com.entidad.bancaria.model.repository.CuentaRepository;
import com.entidad.bancaria.service.InterfaceCuentas;

@Service
public class ImpleCuentas implements InterfaceCuentas {
	@Autowired
	CuentaRepository cu;
	@Autowired
	ClienteRepository cli;
	

	@Override
	public void altaCuenta(Cuenta cuenta, String dni) {
		Cliente cliente= new Cliente();
		cliente= cli.findByDni(dni);
		if(cliente!=null) {
			cuenta.setCliente(cliente);
			cuenta.setSaldoActual(0.0);
			cuenta.setEstado(true);
			cu.save(cuenta);
		}	
	
	}

	@Override
	public List<Cuenta> listaCuentas() {
		return cu.findAll();
	}
	@Override
	public void actualizar(Cuenta cuenta) {
			cu.save(cuenta);
	}

	@Override
	public Optional<Cuenta>buscarCuenta(int id) {
	  Optional<Cuenta>cuentaEncontrada=cu.findById(id);
	  if(cuentaEncontrada !=null) {
		  return cu.findById(id);
		  
	  }else {
		  return null;
	  }
		
	}

	@Override
	public Cuenta buscar(int numeroCuenta) {
		return cu.findBynumeroCuenta(numeroCuenta);
	}
	
	@Override 
	public void eliminarCuenta(Cuenta cuenta, boolean estado, int id) {
		Optional<Cuenta> cuen=cu.findById(id);
		if(cuenta.getEstado().equals(true)) {
		cuenta.setEstado(false);
		}
		else {
		cuenta.setEstado(true);
		}
		cu.save(cuenta);
	}


	
}
