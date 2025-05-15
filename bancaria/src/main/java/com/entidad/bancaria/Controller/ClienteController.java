package com.entidad.bancaria.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

@GetMapping("/modificar/{dni}")
public String mostrarFormularioEdicion(@PathVariable String dni, Model model) {
    Cliente cliente = Cli.buscar(dni);
    model.addAttribute("cliente", cliente);
    return "clientes/modificacionCliente";
}

@PostMapping("/actualizar/{dni}")
public String actualizarCliente(@PathVariable String dni, Cliente cliente) {
    Cli.actualizar(cliente);
    return "redirect:/listaClientes";
}

@GetMapping("/formularioBuscar")
public String mostrarForm() {
    return "clientes/buscar";
}

@GetMapping("/buscar")
public String buscarCli(@RequestParam("dni") String dniCli, Model model) {
	System.out.println("RequestParam DNI:"+ dniCli);
	Cliente encontrado= Cli.buscar(dniCli);
	model.addAttribute("cliente", encontrado);
	return "clientes/resultCliente";	
}
	
}
