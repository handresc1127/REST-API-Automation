package com.handresc1127.automations_restful_api.definition;

import com.handresc1127.automations_restful_api.implementation.ImpServiceDefault;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DefDefault {


	@Given("^Consulto el servicio GET \"([^\"]*)\"$")
	public void consulto_el_servicio_GET(String serviceUrl) {
	    ImpServiceDefault.init(serviceUrl);
	}


	@Then("^El codigo de estado de la respuesta es (\\d+)$")
	public void el_codigo_de_estado_de_la_respuesta_es(int statusCode) {
		ImpServiceDefault.statusCode(statusCode);
	}

	@Given("^Consulto el servicio POST \"([^\"]*)\"$")
	public void consulto_el_servicio_POST(String serviceUrl) {
		ImpServiceDefault.token(serviceUrl);
	}
	
	@Given("^Obtengo el token \"([^\"]*)\"$")
	public void obtengo_el_token(String serviceUrl) {
		ImpServiceDefault.obtenerToken(serviceUrl);
	}

	@Then("^La variable \"([^\"]*)\" contiene el valor \"([^\"]*)\"$")
	public void la_variable_contiene_el_valor(String argumento, String valor) {
		ImpServiceDefault.contieneValor(argumento,valor);
	}
	@Given("^Envio el header \"([^\"]*)\" con valor \"([^\"]*)\"$")
	public void envio_el_header_con_valor(String argumento, String valor) {
		ImpServiceDefault.enviarHeader(argumento,valor);
	}

}