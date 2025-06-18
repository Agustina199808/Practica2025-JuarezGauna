package com.entidad.bancaria.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.entidad.bancaria.service.InterfaceMovimiento;

@Controller
public class MovimientoController {
	@Autowired
	private InterfaceMovimiento mov;

}
