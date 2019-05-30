package com.handresc1127.automations_restful_api.implementation;


import io.restassured.RestAssured;
import io.restassured.response.*;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;

public class ImpServiceDefault {
	
	public static void init(String serviceUrl){
		RestAssured.baseURI=serviceUrl;
		
	}
	
	public static void statusCode(int statusCode){
		SerenityRest.given()
		.when()
		.get()
		.then()
		.statusCode(statusCode);
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
	
//public static void accederServicioPost(String serviceUrl) {
//	RestAssured.baseURI = serviceUrl;
//	 RequestSpecification request = RestAssured.given();
//	
//	 request.header("Authorization","Basic V1FnS3YydjBQMEJzSUQ3TVJjb0dtZ1E4QXQ4S0czUTc6MzdNekJERzFjVVFOMXhTNQ==" );
//	 
//	 JsonObject loginCredentials = new JsonObject();
//     loginCredentials.addProperty("grant_type", "client_credentials");
//     loginCredentials.addProperty("scope", "upselling");
//	 request.body(loginCredentials. toString ( ) );
//	 System.out.println(loginCredentials);
//	 System.out.println(request.toString());
//	 System.out.println(request.get());
//	 Response response=request.get();
//	 response.getBody();
//	 System.out.println(request.response());
//	 System.out.println(response.getBody());
//	 System.out.println(response);
//	 
//
//}
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
		 System.out.println("Response body: " + body);
		
	}
	

}
