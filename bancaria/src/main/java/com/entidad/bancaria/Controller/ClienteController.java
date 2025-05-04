package com.entidad.bancaria.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entidad.bancaria.Entity.Cliente;
import com.entidad.bancaria.Implementacion.ImpleCliente;

@Controller
public class ClienteController {

ImpleCliente Cli = new ImpleCliente();

@GetMapping("/menu")
public String menu () {
return "cliente/menuClientes";
}

@GetMapping("/altaCliente")
public String altaCliente (Model model) {
Cli.altaCliente(model);
return "cliente/altaCliente";
}

@PostMapping("/guardar")
public String guardar(Cliente cliente) {
	Cli.guardar(cliente);
return "cliente/listaCliente";
}

@PostMapping("/eliminarCliente")
public String eliminarC (Cliente cliente) {
Cli.borrar(cliente);
return "cliente/listaCliente";
}

@GetMapping("/listaClientes")
public String lista (Model model) {
	List<Cliente> listaC =Cli.listaCli();
	model.addAttribute("listaC", listaC);
return "cliente/listaCliente";
}
	
}
