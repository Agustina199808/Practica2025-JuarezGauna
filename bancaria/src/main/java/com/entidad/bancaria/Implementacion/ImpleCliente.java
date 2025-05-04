package com.entidad.bancaria.Implementacion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;

import com.entidad.bancaria.Entity.Cliente;
import com.entidad.bancaria.service.InterfaceCliente;

public class ImpleCliente implements InterfaceCliente{
	List<Cliente> listaC = new ArrayList<>();

	@Override
	public void altaCliente (Model model) {
    Cliente cliente= new Cliente();
    model.addAttribute("cliente", cliente);
		
	}

	@Override
	public void guardar(Cliente cliente) {
		listaC.add(cliente);
    }

	@Override
	public void borrar(Cliente cliente) {
		listaC.remove(cliente);
		
	}

	@Override
	public Cliente buscar(String dni) {
		for(Cliente lista: listaC) {
			if(dni.equalsIgnoreCase(lista.getDni())) {
				return lista;
			}
		}
		return null;
	}

	@Override
	public List<Cliente> listaCli() {
		return listaC;
	}

}
