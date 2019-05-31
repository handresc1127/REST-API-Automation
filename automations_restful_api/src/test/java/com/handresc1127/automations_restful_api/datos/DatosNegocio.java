package com.handresc1127.automations_restful_api.datos;

import java.util.HashMap;

import com.handresc1127.automations_restful_api.implementation.ImpServiceDefault;


public class DatosNegocio {
private static final HashMap<String, String> datosDelNegocio = new HashMap<>();
	
	static {

		dataPut("token", "https://test.api.tigo.com/v2/oauth/token");


	}
	public static void dataPut(String key, String value){
		datosDelNegocio.put(ImpServiceDefault.textoMinusculasSinEspacios(key),value);
	}

}
