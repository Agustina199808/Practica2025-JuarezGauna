package com.entidad.bancaria.service;

import java.util.List;

import org.springframework.ui.Model;

import com.entidad.bancaria.Entity.Cliente;

public interface InterfaceCliente {
	
	public void altaCliente (Model model);
	public void guardar(Cliente cliente);
	public void borrar(int id);
	public Cliente buscar(String dni);
	public List<Cliente>listaCli();
	public void actualizar(Cliente clienetAct);

}
