package com.entidad.bancaria.Controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.entidad.bancaria.Entity.Cuenta;
import com.entidad.bancaria.service.InterfaceCuentas;

@Controller
public class CuentaController {
	@Autowired
	private InterfaceCuentas Cu;
	
	 @GetMapping("/altaCuenta/{dni}")
	 public String altaCuenta(@PathVariable String dni, Cuenta cuenta) {
		Cu.altaCuenta(cuenta, dni);
		return "redirect:/listaCuentas";
	 }
	 
	 @GetMapping("/listaCuentas")
	 public String lista(Model model) {
		 model.addAttribute("cuenta", Cu.listaCuentas());
		return "cuentas/listaCuentas";	 
	 }
	 
	 @GetMapping("/modificarCuenta/{id}")
	 public String mostrarFormularioEdicion(@PathVariable int id, Model model) {
	     Optional<Cuenta> cuenta = Cu.buscarCuenta(id);
	     model.addAttribute("cuenta", cuenta);
	     return "cuentas/modificacionCuenta";
	 }

	 @PostMapping("/actualizarCuenta/{id}")
	 public String actualizarCliente(@PathVariable int id, Cuenta cuenta) {
	    Cu.actualizar(cuenta);
	    return "redirect:/listaCuentas";
	 }
	 
	 @GetMapping("/formularioBuscarCuenta")
	 public String mostrarForm() {
	     return "cuentas/buscarCuenta";
	 }
	 
	 @GetMapping("/eliminarCuenta/{id}")
	 public String cambiarEst(@PathVariable int id, Cuenta cuenta, boolean estado) {
	    Cu.eliminarCuenta(cuenta, estado, id);
	    return "redirect:/listaCuentas";
	 }
	
}
