package com.vst.deocecu;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vst.deocecu.util.Util;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	static String htmlEditor = "";

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

//	@RequestMapping(value = "/{otropagina}", method = RequestMethod.GET)
//	public String otropagina(@PathVariable String otropagina, Locale locale, Model model) {
//		logger.info("otropagina:" + otropagina);
//		return otropagina;
//	}

	@RequestMapping(value = "/guardarContenido", method = RequestMethod.POST)
	public String guardarContenido(String editor, Model model) {
		htmlEditor = editor;
		logger.info("guardarContenido: " + editor);
		model.addAttribute("editor", editor);
		return "verContenido";
	}

	@RequestMapping(value = "/export")
	public void export(HttpServletRequest request, HttpServletResponse response)  {
	
			
		
		long c = Calendar.getInstance().getTime().getTime();
		System.out.println("export");
		System.out.println(htmlEditor);
//		byte[] bytes = htmlEditor.getBytes();		
//		response.setContentType("application/octet-stream");
//		response.setHeader("Content-Disposition", "attachment;filename=newFile"+c+".rtf");
//		response.getOutputStream().write(bytes);
//		response.getOutputStream().flush();
//		response.getOutputStream().close();
		
		

//		byte[] b = Util.getpdftohtmlbytes(htmlEditor);
		byte[] b = Util.getpdftohtmlbytes2(htmlEditor);
		if(b!=null){
			response.setContentType("application/pdf");
			response.setHeader("Content-Disposition", "attachment;filename=newFile"+c+".pdf");
			try {
				response.getOutputStream().write(b);
				response.getOutputStream().flush();
				response.getOutputStream().close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	

	}

}
