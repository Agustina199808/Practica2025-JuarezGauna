package com.entidad.bancaria.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.entidad.bancaria.service.InterfaceCuentas;

@Controller
public class CuentaController {
	@Autowired
	private InterfaceCuentas cuenta;
	
}
