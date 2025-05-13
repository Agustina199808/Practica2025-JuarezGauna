package com.entidad.bancaria.Implementacion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.entidad.bancaria.Entity.Cliente;
import com.entidad.bancaria.service.InterfaceCliente;
@Service
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
	public void borrar(int id) {
		for(int i=0; i<listaC.size(); i++) {
		   if(listaC.get(i).getId()==id){
			listaC.remove(i);
			break;
		}
		}
		
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

	@Override
	public void actualizar(Cliente clienteAct) {
		for(int i=0; i<listaC.size(); i++) {
			   if(listaC.get(i).getDni().equalsIgnoreCase(clienteAct.getDni())){
				   listaC.set(i, clienteAct);
				break;
		       }
		}
	}

}
