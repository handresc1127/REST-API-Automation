package com.handresc1127.automations_restful_api.implementation;

import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;

public class ImpServiceDefault {
	static String access_token;
	static RequestSpecification request;

	public static void init(String serviceUrl)
	{
		
		RestAssured.baseURI= serviceUrl;
		

	}
	public static void token()
	{
		String token= "Bearer "+ access_token;
	
		request= SerenityRest.given().header("Authorization", token);

	}
    public static void enviarParams(String argumento, String valor){
		

     request= request.given().queryParams(argumento, valor);
		
	}
    public static void enviarHeader(String argumento, String valor){
		

        request= request.given().header(argumento, valor);
   		
   	}

	public static void statusCode(int statusCode) {
		request.get().then().assertThat().statusCode(200);
	}	

	public static void obtenerToken(String serviceUrl) {
		RestAssured.baseURI= serviceUrl;
		//RestAssured.basePath= serviceUrl;
		RequestSpecification request= SerenityRest.given();
		request.given();
		//para recargas :request.header("Authorization", "Basic V1FnS3YydjBQMEJzSUQ3TVJjb0dtZ1E4QXQ4S0czUTc6MzdNekJERszFjVVFOMXhTNQ==");
		request.header("Content-Type", "application/x-www-form-urlencoded");
		request.queryParams("grant_type", "client_credentials");
		request.formParams("client_id", "POGap0DUqp389f1r1YyBTCPRwBrx6GDY");
		request.formParams("client_secret", "7gBoEQTmpclu8sEM");
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
		
		System.out.println(argumento);
		System.out.println(valor);
		request.get().then().log().all().assertThat().body(argumento, equalTo(valor));
	
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

}
