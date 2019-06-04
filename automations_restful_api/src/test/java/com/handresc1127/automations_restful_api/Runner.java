package com.handresc1127.automations_restful_api;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = { "com.handresc1127.automations_restful_api" }, features = {
		
		//"src/test/resources/features/HU001-ExampleTestRestService.feature" ,
        "src/test/resources/features/HU000-ObtenerToken.feature",
        "src/test/resources/features/HU000-ObtenerTokenPasarela.feature",
		"src/test/resources/features/HU002-SusbcriberAccountTipoDePlan.feature",
		"src/test/resources/features/HU003-ObtenerDeudaVigenteMóvil.feature"} ,

	

		tags = { "" }, monochrome = true, plugin = { "pretty", "html:target/reports/html/",
				"junit:target/reports/junit.xml", "json:target/reports/cukes.json" })

public class Runner {

}
