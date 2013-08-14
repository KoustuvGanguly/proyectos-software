package com.vst.ChatWebsocket.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vst.ChatWebsocket.bean.Usuario;
import com.vst.ChatWebsocket.service.ChatService;

@Service("ChatService")
public class ChatServiceImpl implements ChatService {
	public static List<Usuario> listaUsuarios=new ArrayList<Usuario>();
	
//
//	public static List<Chat> listaChats=new ArrayList<Chat>();
//	public static List<Conexion> listaConexiones = new ArrayList<Conexion>();

//	
	static{
		Usuario	usuario = null;
		usuario=new Usuario(1, "chat01", "chat01", "chat01", "chat01");
		listaUsuarios.add(usuario);
		usuario=new Usuario(2, "chat02", "chat02", "chat02", "chat02");
		listaUsuarios.add(usuario);
		usuario=new Usuario(3, "chat03", "chat03", "chat03", "chat03");
		listaUsuarios.add(usuario);
		usuario=new Usuario(4, "chat04", "chat04", "chat04", "chat04");
		listaUsuarios.add(usuario);
		usuario = null;		
	}
//
//	@Override
//	public List<Usuario> listaUsuariosConectados() {
//		List<Usuario> l = new ArrayList<Usuario>();
//		for (Conexion conexion : listaConexiones) {
//			l.add(conexion.getUsuario());
//		}		
//		return l;
//	}
//
//	@Override
//	public Conexion addUsuarioConectado(String connectionId, String origin, Usuario usuario) {
//		for (Conexion conexion : listaConexiones) {
//			if(conexion.getConnectionId().equals(connectionId)){
//				return null;
//			}			
//		}
//		Conexion c = new Conexion(connectionId, origin , usuario);
//		listaConexiones.add(c);	
//		return c;		
//	}
//
//	@Override
//	public void removeUsuarioConectado(Usuario usuario) {
//		Conexion conexion = null;
//		for (int i = 0; i < listaConexiones.size(); i++) {
//			conexion = listaConexiones.get(i);
//			if(conexion.getUsuario().getId() == usuario.getId()){
//				listaConexiones.remove(i);
//				return;
//			}		
//		}			
//	}
//
//	@Override
//	public List<Usuario> listaConectados(Usuario usuario) {
//		if(estaUsuarioConectado(usuario.getUserName())){			
//			List<Usuario> l = new ArrayList<Usuario>();
//			for ( Conexion c : listaConexiones) {
//				if(!(c.getUsuario().getUserName().equals(usuario.getUserName()))){
//					l.add(c.getUsuario());
//				}
//			}
//			return l;
//			}
//		return null;		
//	}
//
	@Override
	public List<Usuario> listaUsuarios() {
		return listaUsuarios;
	}
//
	@Override
	public void guardar(Usuario usuario) {
		for (Usuario u : listaUsuarios) {
			if(u.getUserName().equals(usuario.getUserName())){
				return;
			}
		}			
		listaUsuarios.add(usuario);			
	}
//
//	@Override
//	public int getLastID() {
//		return listaUsuarios.size()+1;
//	}
//
//	@Override
//	public boolean addMensaje(Conexion conexion, Usuario usuariofrom, Usuario to,
//			String mensaje) {
//		if(existeConexion(conexion.getConnectionId())){
//			if(estaUsuarioConectado(usuariofrom.getUserName()) && estaUsuarioConectado(to.getUserName()) ){
//				Chat chat = new Chat(getLastID2(), conexion, usuariofrom, to, mensaje);
//				listaChats.add(chat);
//				return true;
//			}					
//		}
//		return false;				
//	}
//	
//	@Override
//	public int getLastID2() {
//		return listaChats.size()+1;
//	}
//
	@Override
	public boolean existeUsuario(String usuario) {
		for (Usuario u : listaUsuarios) {
			if(u.getUserName().equals(usuario)){
				return true;
			}
		}	
		return false;
	}
//
	@Override
	public Usuario getUsuario(String usuario) {
		for (Usuario u : listaUsuarios) {
			if(u.getUserName().equals(usuario)){
				return u;
			}
		}	
		return null;
	}
//
//	
//	
//	@Override
//	public boolean estaUsuarioConectado(String usuario) {
//		for (Conexion conexion : listaConexiones) {
//			if(conexion.getUsuario().getUserName().equals(usuario) ){
//				return true;
//			}
//		}			
//		return false;
//	}
//	
//
//	@Override
//	public boolean existeConexion(String connectionId) {
//		for (Conexion conexion : listaConexiones) {
//			if(conexion.getConnectionId().equals(connectionId) ){
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public static void main(String[] args) {
//		ChatServiceImpl chatServiceImpl = new ChatServiceImpl();
//		System.out.println(chatServiceImpl.listaUsuarios().size());
//		Usuario u1 = new Usuario(chatServiceImpl.getLastID(), "chat"+chatServiceImpl.getLastID(), "chat", "chat", "chat");
//		chatServiceImpl.guardar(u1);
//		Usuario u2 = new Usuario(chatServiceImpl.getLastID(), "chat"+chatServiceImpl.getLastID(), "chat", "chat", "chat");
//		chatServiceImpl.guardar(u2);
//		Usuario u3 = new Usuario(chatServiceImpl.getLastID(), "chat"+chatServiceImpl.getLastID(), "chat", "chat", "chat");
//		chatServiceImpl.guardar(u3);
//		Usuario u4 = new Usuario(chatServiceImpl.getLastID(), "chat"+chatServiceImpl.getLastID(), "chat", "chat", "chat");
//		chatServiceImpl.guardar(u4);
//		Usuario u5 = new Usuario(chatServiceImpl.getLastID(), "chat"+chatServiceImpl.getLastID(), "chat", "chat", "chat");
//		chatServiceImpl.guardar(u5);
//		Usuario u6 = chatServiceImpl.getUsuario("chat01");
//		System.out.println("existe chat01:"+chatServiceImpl.existeUsuario("chat01"));
//		System.out.println("existe chat012:"+chatServiceImpl.existeUsuario("chat012"));
//		System.out.println(chatServiceImpl.listaUsuarios().size());
//		Conexion conexion01 = chatServiceImpl.addUsuarioConectado("asdas", "asdsadfsdf", u1);
//		System.out.println(conexion01);
//		Conexion conexion02 = chatServiceImpl.addUsuarioConectado("asda1s", "asdsadfsd31f", u2);
//		System.out.println(conexion02);
//		Conexion conexion03 = chatServiceImpl.addUsuarioConectado("asdas23", "asdsadfsdf432", u3);
//		System.out.println(conexion03);
//		Conexion conexion04 = chatServiceImpl.addUsuarioConectado("asdas24", "asdsadfsdf43442", u4);
//		System.out.println(conexion04);
//		Conexion conexion05 = chatServiceImpl.addUsuarioConectado("asdas5564", "asdsadfsdf6666", u5);
//		System.out.println(conexion05);		
//		Conexion conexion06 = chatServiceImpl.addUsuarioConectado("asdas66664", "asdsadfsdf6666", u6);
//		System.out.println(conexion06);	
//		System.out.println(chatServiceImpl.listaConectados(u1).size());
//		System.out.println(chatServiceImpl.listaConectados(u2).size());
//		System.out.println(chatServiceImpl.listaConectados(u3).size());
//		System.out.println("esta conectado :"+chatServiceImpl.estaUsuarioConectado(u3.getUserName()));
//		chatServiceImpl.removeUsuarioConectado(u3);
//		System.out.println(chatServiceImpl.listaConectados(u2).size());
//		System.out.println(chatServiceImpl.listaConectados(u3));		
//		System.out.println("mensaje eviado "+chatServiceImpl.addMensaje(conexion01, u2, u1, "hola!!"));		
//	}


}
