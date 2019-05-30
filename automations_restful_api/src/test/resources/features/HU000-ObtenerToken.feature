#Author: Melissa Pineda 
#Keywords Summary :
#Sample Feature Definition Template
@Ejemplo1
Feature: HU002 Active Subscriptions v2 (sync) TigoWebShop
  Como automatizador
  Quiero realizar pruebas en api
  Para probar que funcionen correctamente

  Scenario: Obtener Token
  #Given Consulto el servicio POST "https://test.api.tigo.com/v2/oauth/token" 
  Given Obtengo el token "https://test.api.tigo.com/v2/oauth/token" 

