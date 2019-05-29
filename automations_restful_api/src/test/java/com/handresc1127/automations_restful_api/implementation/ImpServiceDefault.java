package com.handresc1127.automations_restful_api.implementation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
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

	public static void token(String service) {
		Response response =  
		        RestAssured.given().
		            header("Content-Type", "application/json").
		            body(loginPayload).
		        when().
		            post("/login").
		        then().
		            log().ifError().
		            statusCode(200).
		            contentType("application/vnd.api+json").
		            body("$", hasKey("access_token")).                                   //authorization_token is present in the response
		        extract().response();
	}
	String auth_token = response.path("access_token").toString();

}
