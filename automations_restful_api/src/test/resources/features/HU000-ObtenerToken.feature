#Author: Melissa Pineda 
#Keywords Summary :
#Sample Feature Definition Template
@Ejemplo
Feature: HU002 Active Subscriptions v2 (sync) TigoWebShop
  Como automatizador
  Quiero realizar pruebas en api
  Para probar que funcionen correctamente

  Scenario: Listado de estudiantes - responde 200
  Given Consulto el servicio POST "https://test.api.tigo.com/v2/oauth/token" 
