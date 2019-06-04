package com.handresc1127.automations_restful_api.implementation;





import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;

public class ImpServiceDefault {
	static String access_token;
	public static void init(String serviceUrl)
	{

		RestAssured.baseURI=serviceUrl;
	}
	
	public static void statusCode(int statusCode){
		
		String token= "Bearer "+ access_token;
			SerenityRest
			.given()
			.header("Authorization", token)
			.header("Content-Type", "application/x-www-form-urlencoded")
			.when()
			.get()
			.then()
			.statusCode(200);
			
		
	}
	
	public static String textoMinusculasSinEspacios(String texto) {
		String original = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
		String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
		for (int i = 0; i < original.length(); i++) {
			texto = texto.replace(original.charAt(i), ascii.charAt(i));
		}
		texto = texto.replaceAll("\t|\n| ", "");
		texto = texto.toLowerCase();
		return texto;
	}

	public static void token(String service) {
		RestAssured.baseURI=service;
		
		SerenityRest
		.given()
		.header("Authorization", "Basic V1FnS3YydjBQMEJzSUQ3TVJjb0dtZ1E4QXQ4S0czUTc6MzdNekJERzFjVVFOMXhTNQ==")
		.formParams("grant_type", "client_credentials")
		.when()
		.post()
		.then()
		.statusCode(200);
		
	}
	public static void obtenerToken(String service) {
		RestAssured.baseURI=service;
		
		RequestSpecification request= SerenityRest.given();
		request.given();
		request.header("Authorization", "Basic V1FnS3YydjBQMEJzSUQ3TVJjb0dtZ1E4QXQ4S0czUTc6MzdNekJERzFjVVFOMXhTNQ==");
		request.formParams("grant_type", "client_credentials");
		request.when();
		request.post();
		Response response = request.post();
		String body = response.getBody().asString();
		String [] partes = body.split(",");
		
		
		for (int i = 0; i < partes.length; i++) {
			if (partes[i].contains("access_token")) {
				String [] parteFin = partes[i].split(":");
				access_token = parteFin[1].replaceAll("\"", "");
				access_token = access_token.replaceAll(" ", "");
			}
		}

	}
	public static void contieneValor(String argumento, String valor) {
		RestAssured.baseURI="https://test.api.tigo.com/v1/tigo/mobile/co/upselling/subscribers/573045797770/account";
		
//		RequestSpecification request= RestAssured.given();
//		request.given();
//		request.header("Authorization","Bearer "+ access_token);
//		request.header("Content-Type", "application/x-www-form-urlencoded");
//		request.when();
//	
//		Response response = request.get().assertThat();
//		
//		ResponseBody body = response.getBody();
//		    
//		    
//		String bodyStringValue = body.asString();
//		   
//		Assert.assertTrue(bodyStringValue.contains("account.status"));
//		JsonPath jsonPathEvaluator = response.jsonPath();
//		String status = jsonPathEvaluator.get("account.status");
//		Assert.assertTrue(status.equalsIgnoreCase("ACTIVE"));

		System.out.println(argumento);
		System.out.println(valor);
		SerenityRest
		.given()
		.header("Authorization","Bearer "+ access_token)
		.header("Content-Type", "application/x-www-form-urlencoded")
		.when()
		.get()
		.then().log().all()
		.assertThat()
		.body("account.status", equalTo("ACTIVE"));

	
		
	}
}
