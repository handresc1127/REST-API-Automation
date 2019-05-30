#Author: Melissa Pineda 
#Keywords Summary :
#Sample Feature Definition Template
@Ejemplo1
Feature: HU002 Active Subscriptions v2 (sync) TigoWebShop
  Como automatizador
  Quiero realizar pruebas en api
  Para probar que funcionen correctamente

  Scenario: Obtener Token
  Given Consulto el servicio POST "https://test.api.tigo.com/v2/oauth/token" 
  Then El codigo de estado de la respuesta es 200
  And Obtengo el dato "access_token"
