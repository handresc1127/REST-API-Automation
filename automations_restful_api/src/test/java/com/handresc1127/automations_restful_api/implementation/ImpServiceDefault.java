package com.handresc1127.automations_restful_api.implementation;

import io.restassured.RestAssured;
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

}
