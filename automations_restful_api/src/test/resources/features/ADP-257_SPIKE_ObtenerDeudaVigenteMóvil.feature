#Author: Melissa Pineda 
#Keywords Summary :
#Sample Feature Definition Template
@MonitoreoPasarela
Feature: HU002 SusbcriberAccountTipoDePlan
  Como automatizador
  Quiero realizar pruebas en api
  Para probar que funcionen correctamente

  Scenario: Consultar el servicio GET
    Given Consulto el servicio GET "https://prod.api.tigo.com/REST/GetAccountDebtVL1/CO/clients/3014439648"
    Then El codigo de estado de la respuesta es 200 
 		And La variable "TigoApiResponse.status" contiene el valor "OK" 
