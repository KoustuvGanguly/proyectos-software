package com.vst.hsd.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vst.dao.UsuarioDAO;
import com.vst.dominio.Usuario;
import com.vst.service.ChatService;
import com.vst.util.Constantes;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
//	@Autowired
//	ChatConexionSevice chatConexionSevice;
	@Autowired
	private ChatService chatService;
	@Autowired
	private UsuarioDAO usuarioDAO;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
//		chatConexionSevice.guardar(new Usuario());
		
		return "home";
	}
	
	@RequestMapping(value = "{otroLugar}", method = RequestMethod.GET)
	public String otroLugar(@PathVariable String otroLugar) {
		return otroLugar;
	}
	
	@RequestMapping(value = "/iniciarSession", method = RequestMethod.POST)
	public String iniciarSession(Locale locale, Model model,HttpSession session,String usuario,String calve) {	
		System.out.println("--------------------------");
		System.out.println(usuarioDAO.getTodos().size());
		usuarioDAO.guardar(new Usuario( usuario, usuario, usuario, usuario));
		System.out.println(usuarioDAO.getTodos().size());
		System.out.println("--------------------------");
		
		if(chatService.existeUsuario(usuario)){			
			Usuario u = chatService.getUsuario(usuario);
			session.setAttribute(Constantes.SESION_USUARIO, u);
			model.addAttribute(Constantes.SESION_USUARIO, u);
			return "index";
		}else{
			chatService.guardarUsuario(new Usuario( usuario, usuario, usuario, usuario));
			return "redirect:/";
		}
	}
	
	
}
