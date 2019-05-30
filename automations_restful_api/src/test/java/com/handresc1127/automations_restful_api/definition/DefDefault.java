package com.handresc1127.automations_restful_api.definition;

import com.handresc1127.automations_restful_api.implementation.ImpServiceDefault;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DefDefault {


	@Given("^Consulto el servicio GET \"([^\"]*)\"$")
	public void consulto_el_servicio_GET(String service) {
	    ImpServiceDefault.init(service);
	}


	@Then("^El codigo de estado de la respuesta es (\\d+)$")
	public void el_codigo_de_estado_de_la_respuesta_es(int statusCode) {
		ImpServiceDefault.statusCode(statusCode);
	}

	@Given("^Consulto el servicio POST \"([^\"]*)\"$")
	public void consulto_el_servicio_POST(String serviceUrl) {
		ImpServiceDefault.token(serviceUrl);
	}
	
	@Given("^Obtengo el dato \"([^\"]*)\"$")
	public void obtengo_el_dato(String dato) {
	//	ImpServiceDefault.obtenerDato(dato);
	}

	
}