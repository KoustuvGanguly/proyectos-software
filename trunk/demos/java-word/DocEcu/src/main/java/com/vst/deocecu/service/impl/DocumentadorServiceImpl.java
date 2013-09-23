package com.vst.deocecu.service.impl;

import java.util.List;

import org.alfresco.webservice.types.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import alfresco.com.vst.service.component.AlfrescoServiceConexion;

import com.vst.deocecu.dao.DocumentoDAO;
import com.vst.deocecu.dao.ProyectoDAO;
import com.vst.deocecu.dominio.Proyecto;
import com.vst.deocecu.service.DocumentadorService;

@Service
public class DocumentadorServiceImpl implements DocumentadorService {
	
	@Autowired 
	private AlfrescoServiceConexion alfrescoServiceConexion;
	
	@Autowired
	private ProyectoDAO proyectoDAO;
	
	@Autowired
	private DocumentoDAO documentoDAO;
	
	public int guardarContenidoHTMLALFRESCO(String html) {		
//		System.out.println("alfrescoServiceConexion");
//		System.out.println("iniciarConexion:"+alfrescoServiceConexion.iniciarConexion());
//		Reference carpetaProyecto = alfrescoServiceConexion.obtenerCarpetaProyectos();
//		System.out.println("hsd:"+alfrescoServiceConexion.obtenerSubCarpetaProyecto("hsd"));
//		System.out.println("hsd:"+alfrescoServiceConexion.crearSubCarpetaProyecto("hsd"));
//		System.out.println("docecu:"+alfrescoServiceConexion.obtenerSubCarpetaProyecto("docecu"));
//		System.out.println("docecu:"+alfrescoServiceConexion.crearSubCarpetaProyecto("docecu"));
//		System.out.println("chatwebsocket:"+alfrescoServiceConexion.obtenerSubCarpetaProyecto("chatwebsocket"));
//		System.out.println("chatwebsocket:"+alfrescoServiceConexion.crearSubCarpetaProyecto("chatwebsocket"));
//		System.out.println("terminarConexion:"+alfrescoServiceConexion.terminarConexion());	
		return 0;
	}

	public List<Proyecto> obtenerListaProyectos() {		
		return proyectoDAO.getTodos();
	}
	
	@Transactional
	public int guardarNuevoProyecto(Proyecto proyecto) {
//		Reference carpetaProyecto = alfrescoServiceConexion.obtenerCarpetaProyectos();	
		Proyecto exiproyecto = proyectoDAO.existeProyectoPorFolder(proyecto.getFolder(),proyecto.getTitulo());
		try {		
			if(exiproyecto==null){
//				alfrescoServiceConexion.iniciarConexion()
				Proyecto nuevo = null;
				if(alfrescoServiceConexion.iniciarConexion() == AlfrescoServiceConexion.AlfresoConstantes.USUARIO_AUNTENTICADO){
					nuevo =  alfrescoServiceConexion.crearSubCarpetaProyecto(proyecto);	
					alfrescoServiceConexion.terminarConexion();
				}				
				proyectoDAO.guardar(nuevo);	
				return 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public Proyecto obtenerProyectoPorID(Integer id) {
		return proyectoDAO.get(id);
	}
	
	
	
}
