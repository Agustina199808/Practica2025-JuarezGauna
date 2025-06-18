package com.entidad.bancaria.Implementacion;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.entidad.bancaria.Entity.Cliente;
import com.entidad.bancaria.model.repository.ClienteRepository;
import com.entidad.bancaria.service.InterfaceCliente;
@Service

public class ImpleCliente implements InterfaceCliente{
	@Autowired
	ClienteRepository cli;

	@Override
	public void altaCliente (Model model) {
    Cliente cliente= new Cliente();
    model.addAttribute("cliente", cliente);
	}

	@Override
	public void guardar(Cliente cliente) {
	    cli.save(cliente);
	}

	@Override
	public void borrar(int id) {
		if(cli.existsById(id)) {
			cli.deleteById(id);
		}
		
	}

	@Override
	public Cliente buscar(String dni) {
		return cli.findByDni(dni);
	}

	@Override
	public List<Cliente> listaCli() {
		return cli.findAll();
	}

	@Override
	public void actualizar(Cliente clienteAct) {
	   cli.save(clienteAct);
	}

}
