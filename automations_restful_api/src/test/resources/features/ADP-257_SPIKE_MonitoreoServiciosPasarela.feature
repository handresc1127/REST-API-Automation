#Author: Melissa Pineda 
#Keywords Summary :
#Sample Feature Definition Template
@MonitoreoPasarela @Monitoreo
Feature: HU002 SusbcriberAccountTipoDePlan
  Como automatizador
  Quiero realizar pruebas en api
  Para probar que funcionen correctamente

  Scenario: Consultar el servicio GET de pasarela
    Given Consulto el servicio GET "/REST/GetAccountDebtVL1/CO/clients/3014439648" 
    And Ingreso token
    Then El codigo de estado de la respuesta es 200 
 		And La variable del cuerpo "TigoApiResponse.status" contiene el valor "OK" 
