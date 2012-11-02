package com.vst.util;

public class Constantes {

	public static String LOGIN_SUPER_USUARIO_ADMINISTRADOR=Config.getPropiedad("LOGIN_SUPER_USUARIO_ADMINISTRADOR");
	public static String PASS_SUPER_USUARIO_ADMINISTRADOR=Config.getPropiedad("PASS_SUPER_USUARIO_ADMINISTRADOR");
	
	public static final String SESION_TITULO = "titulo";
	public static final String PERFIL_ADMIN_CODIGO = null;
	public static final String ROOT_SLASH = null;
	public static final int ROOT_ROSOURCES = 0;
	public static final int ROOT_TEMP = 0;
	public static final String JPEG = "jpeg";
	public static final String JPG =  "jpg";
	public static final String PNG =  "png";
	public static final String GIF =  "gif";
	public static final String TXT =  "txt";
	public static final String PDF =  "pdf";
	public static final String EXT_PROHI_EXE =  "exe";
	public static final String EXT_PROHI_BAT =  "bat";
	public static final String EXT_PROHI_SH =  "sh";
	public static String SESION_USUARIO="usuario_en_session";
	
	
	public static final Character ACTIVO = 'A';
	public static final Character INACTIVO = 'I';
	public static final String SESION_MENU = "menu_sesion";
	public static final String MENU_PADRE = "MENU_PADRE";
	public static final String MENU_HIJO = "MENU_HIJO";
	public static final int USUARIO_LOGEADO = 1;
	public static final int ERROR_AL_LOGUEARSE = -1;
	public static final Object CAMPO_LOGIN_USUARIO = "LOGIN";
	public static final Object CAMPO_CLAVE ="CLAVE";
	public static final Object CAMPO_SELECTOR = "SELECTOR";
	
	public static final int VALIDACION_CORRECTA = 1;
	public static final int VALIDACION_INCORRECTA = 2;
	
	public static final String CANTIDAD_DECIMALES = "CantidadDecimales";
	public static final String RANGO_ENTERO_MININO = "RangoEnteroMin";
	public static final String RANGO_ENTERO_MAXIMO = "RangoEnteroMax";
	public static final String VALOR_ENTERO_MAXIMO = "ValorEnteroMax";
	public static final String VALOR_ENTERO_MINIMO = "ValorEnteroMin";
	public static final String RANGO_DECIMAL_MINIMO = "RangoDecimalMin";
	public static final String RANGO_DECIMAL_MAXIMO = "RangoDecimalMax";
	public static final String VALOR_DECIMAL_MINIMO = "ValorDecimalMin";
	public static final String VALOR_DECIMAL_MAXIMO = "ValorDecimalMax";
	public static final String RANGO_CADENA_MINIMO = "RangoCadenaMin";
	public static final String RANGO_CADENA_MAXIMO = "RangoCadenaMax";
	public static final String VALOR_SELECT_MINIMO = "ValorSelectorMin";
	public static final String CADENAS_RESTRINGIDAS = "CadenasRestringidas";
	public static final String CADENAS_RESTRINGIDAS_SELECTOR = "CadenasRestringidasSelector";
	
	
	
	public static final Integer CAMPO_LOGIN_USUARIO_ERROR = 1110000001;
	public static final Integer CAMPO_LOGIN_USUARIO_CLAVE = 1110000002;
	public static final Integer CAMPO_LOGIN_USUARIO_SELECTOR = 1110000003;
	
	
	
}