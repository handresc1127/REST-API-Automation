package com.handresc1127.automations_restful_api;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = { "com.handresc1127.automations_restful_api" }, features = {
		
        "src/test/resources/features/ADP-000_SPIKE_ObtenerTokenPasarela.feature",
		 "src/test/resources/features/ADP-257_SPIKE_MonitoreoServiciosPasarela.feature",
        "src/test/resources/features/ADP-258_SPIKE_MonitoreoServiciosMiCuentaMovil.feature"},
		//"src/test/resources/features/ADP-258_SPIKE_MonitoreoServiciosMiCuentaHogar.feature"} ,

	
		tags = { "" }, monochrome = true, plugin = { "pretty", "html:target/reports/html/",
				"junit:target/reports/junit.xml", "json:target/reports/cukes.json" })

public class Runner {

}
