package com.vst.android.util;

import java.util.Random;

import android.annotation.SuppressLint;
import android.os.StrictMode;

@SuppressLint("NewApi")
public class Constantes {

	public static final class PorDefecto {
		public static final String VACIO = "";
		public static final int MENOS_UNO = -1;
		public static final boolean FALSO = false;
	}

	public static final class TIPO_VARIABLE {
		public static final int TIPO_STRING = 1;
		public static final int TIPO_INT = 2;
		public static final int TIPO_BOOLEAN = 3;
		public static final int TIPO_FLOAT = 4;
	}

	public static final class KEYS {
		public static final String KEY_REGISTRADO_EN_SERVIDOR = "REGISTRADO_SERVIDOR";
		public static final String KEY_USUARIO_REGISTRADO = "USUARIO_REGISTRADO";
		public static final String KEY_REG_ID_DEVICE = "regId";
		public static final String KEY_ESTE_NUMERO_TELEFONO = "ESTE_NUMERO_TELEFONO";
	}

	public static final class REGISTROS {
		public static final int REGISTRO_EXITOSO_USUARIO = 1;
		public static final int REGISTRO_EXITOSO = 1;
		public static final int REGISTRO_ID_MOBILE_EXISTE = 1;
		public static final int REGISTRO_ID_MOBILE_NO_EXISTE = -1;
	}

	public static final class INTENT {
		public static final int INTENT_REGISTAR_USUARIO = 1;
		public static final String DISPLAY_MESSAGE_ACTION = "com.vst.demochat.DISPLAY_MESSAGE";

	}

	public static final class MENSAJES {
		public static final CharSequence MSJ_USUARIO_REGISTRO__EXITOSO = "Usuario registrado exitosamente.";
	}

	public static final class URL_SERVER {
		public static final String URL_SERVER = "http://192.168.1.153:8082/gcm-demo-server-spring";
		public static final String URL_EXISTE_NUMERO = URL_SERVER + "/existeNumero";
		public static final String URL_REGISTRAR_DISPOSITIVO_USUARIO =  URL_SERVER + "/registrarDispositivoUsuario";
		
	}

	public static final class GCM_ID {
		public static final String SENDER_ID = "485888261287";
	}

	public static final class RANGOS {
		public static final int BACKOFF_MILLI_SECONDS = 2000;
		public static final Random RANDOM = new Random();
		public static final int MAX_ATTEMPTS = 5;
	}

	public static final class TAG {
		public static final String TAG = "GCMDemo";
		public static final String PAQUETE_ROOT = "com.vst.android";
	}

	static {
		// con este metodo static soluciona el problema de la conexion a
		// internet method post
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy);
	}

	private Constantes() {
		throw new UnsupportedOperationException();
	}

}
