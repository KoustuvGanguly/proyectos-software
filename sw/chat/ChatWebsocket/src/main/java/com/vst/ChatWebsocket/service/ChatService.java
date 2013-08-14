package com.vst.ChatWebsocket.service;

import java.util.List;

import com.vst.ChatWebsocket.bean.Usuario;
import com.vst.ChatWebsocket.messages.ConnectionInfo;
import com.vst.ChatWebsocket.messages.MessageInfo;
import com.vst.ChatWebsocket.messages.StatusInfo;

public interface ChatService {

	public boolean existeUsuario(String usuario);
	public Usuario getUsuario(String usuario);
//	public List<Usuario> listaUsuariosConectados();//todos conectados al chat
//	public Conexion addUsuarioConectado(String connectionId, String origin, Usuario usuario);
//	public boolean existeConexion(String connectionId);
//	public void removeUsuarioConectado(Usuario usuario);
//	public List<Usuario> listaConectados(Usuario usuario);//todos conectados al chat menos yo
	public List<Usuario> listaUsuarios(); ////todos los registrados
	public void guardarUsuario(Usuario usuario);
//	public int getLastID();
//	public int getLastID2();
//	public boolean addMensaje( Conexion conexion, Usuario usuariofrom, Usuario to, String mensaje);

	public void guardarMessageInfo(MessageInfo messageInfo);
	public void guardarStatusInfo(StatusInfo statusInfo);
	public void guardarConnectionInfo(ConnectionInfo connectionInfo);
	public List<Usuario> listaUsuariosConectados();
	
	
	
}
