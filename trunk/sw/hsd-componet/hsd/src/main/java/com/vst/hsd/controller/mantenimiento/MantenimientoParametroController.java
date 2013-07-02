package com.vst.hsd.controller.mantenimiento;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vst.hsd.dominio.Boton;
import com.vst.hsd.service.mantenimiento.MantenimientoParametroService;


@Controller
public class MantenimientoParametroController {

	private static final Logger log = LoggerFactory.getLogger(MantenimientoParametroController.class);

	@Autowired
	private MantenimientoParametroService mantenimientoParametroService;
	
	@RequestMapping(value = "mantenimiento/registrarParametro/{codigoFormulario}", method = RequestMethod.GET)
	public String get(@PathVariable String codigoFormulario, Model model) {
		List<Boton> lstBotones = mantenimientoParametroService.obtenerBotonesPorFormulario(codigoFormulario);
		model.addAttribute("lstBotones", lstBotones);
		log.info(" oteniedno botones : " + lstBotones.size() ) ;
		return "mantenimiento/parametros/parametro";
	}

}
