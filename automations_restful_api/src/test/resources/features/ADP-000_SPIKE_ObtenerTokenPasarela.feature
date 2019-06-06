#Author: Melissa Pineda 
#Keywords Summary :
#Sample Feature Definition Template
@MonitoreoPasarela @MonitoreoMiCuenta @Monitoreo @Token
Feature: HU000 Obtener Token
  Como automatizador
  Quiero obtener el token
  Para acceder a las apis

  Scenario: Obtener Token
  Given Obtengo el token "http://prod.api.tigo.com/oauth/client_credential/accesstoken?grant_type=client_credentials"  
  

