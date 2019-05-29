package com.handresc1127.automations_restful_api.implementation;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
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
	
public static void accederServicioPost(String serviceUrl) {
	RestAssured.baseURI =serviceUrl;
	 RequestSpecification request = RestAssured.given();
	 request.header("Authorization","Basic  V1FnS3YydjBQMEJzSUQ3TVJjb0dtZ1E4QXQ4S0czUTc6MzdNekJERzFjVVFOMXhTNQ==" );
	 
	 JsonObject loginCredentials = new JsonObject();
     loginCredentials.addProperty("grant_type", "client_credentials");
     loginCredentials.addProperty("scope", "upselling");
	 request.body(loginCredentials.toString());
	
	 Response response = request.post("/v2/oauth/token");
	 int statusCode = response.getStatusCode();
	 System.out.println("The status code recieved: " + statusCode);
	 
}
//	public static void token(String service) {
//		Response response =  
//		        RestAssured.given().
//		            header("Content-Type", "application/json").
//		            body(loginPayload).
//		        when().
//		            post("/login").
//		        then().
//		            log().ifError().
//		            statusCode(200).
//		            contentType("application/vnd.api+json").
//		            body("$", hasKey("access_token")).                                   //authorization_token is present in the response
//		        extract().response();
//	}
//	String auth_token = response.path("access_token").toString();
//
}
