#Author: Melissa Pineda 
#Keywords Summary :
#Sample Feature Definition Template
@Ejemplo
Feature: HU002 SusbcriberAccountTipoDePlan
  Como automatizador
  Quiero realizar pruebas en api
  Para probar que funcionen correctamente

  Scenario: Consultar un servicio GET
    Given Consulto el servicio GET "https://test.api.tigo.com/v1/tigo/mobile/co/upselling/subscribers/573045797770/account"
 		And La variable "account.status" contiene el valor "ACTIVE" 
