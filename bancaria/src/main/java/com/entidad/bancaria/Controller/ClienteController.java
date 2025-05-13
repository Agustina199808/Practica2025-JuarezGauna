package com.entidad.bancaria.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.entidad.bancaria.Entity.Cliente;
import com.entidad.bancaria.service.InterfaceCliente;

@Controller
public class ClienteController {
@Autowired
private InterfaceCliente Cli;


@GetMapping("/menuClientes")
public String menu () {
return "clientes/menuClientes";
}

@GetMapping("/altaCliente")
public String altaCliente (Model model) {
Cli.altaCliente(model);
return "clientes/altaCliente";
}

@PostMapping("/guardar")
public String guardar(Cliente cliente) {
	Cli.guardar(cliente);
return "redirect:/listaClientes";
}

@PostMapping("/eliminarCliente")
public String eliminarC (int id) {
Cli.borrar(id);
return "redirect:/listaClientes";
}

@GetMapping("/listaClientes")
public String lista (Model model) {
model.addAttribute("cliente", Cli.listaCli());
return "clientes/listaClientes";
}
@PostMapping("/actualizar")
public String actualizarCliente(Cliente cliente) {
	Cli.actualizar(cliente);
	return "redirect:/listaClientes";
}
@GetMapping("buscar/{dn}")
public String buscarCli (@PathVariable("dni") String dniCli, Model model) {
	System.out.println("PathVariable:"+ dniCli);
	Cliente encontrado= Cli.buscar(dniCli);
	model.addAttribute("cliente", encontrado);
	return "MostrarCliente";
	
}
	
}
