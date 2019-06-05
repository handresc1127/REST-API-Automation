#Author: Melissa Pineda
#Keywords Summary :
#Sample Feature Definition Template
@MonitoreoMiCuenta @Monitoreo
Feature: SPIKE Monitoreo Servicios Mi Cuenta Home
  Como automatizador
  Quiero realizar pruebas en api
  Para probar que funcionen correctamente

  Scenario: Consultar el servicio GET de Get PQR Siebel
    Given Consulto el servicio GET "http://prod.api.tigo.com/v1/tigo/co/customer-support/pqrs?docId=1053778038&docType=CC"
    And Ingreso token
    And Envio el parametro "docId" con valor "1053778038"
    And Envio el parametro "docType" con valor "CC"
    Then El codigo de estado de la respuesta es 200

  Scenario: Consultar el servicio GET de Home Billing
    Given Consulto el servicio GET "https://prod.api.tigo.com/v1/tigo/home/co/billing/contracts/11231944/invoices?limit=4s"
    And Ingreso token
    And Envio el parametro "limit" con valor "4"
    Then El codigo de estado de la respuesta es 200
    And La variable del cuerpo "[0]['contractId']" contiene el valor "11231944"

  Scenario: Consultar el servicio GET de Home Customers Info
    Given Consulto el servicio GET "https://prod.api.tigo.com/v1/tigo/home/co/billing/contracts/15857158/customers"
    And Ingreso token
    Then El codigo de estado de la respuesta es 200
    And La variable del cuerpo "customerInfo.documentType" contiene el valor "CC"

  Scenario: Consultar el servicio GET de Home Prodcuts
    Given Consulto el servicio GET "https://prod.api.tigo.com/v1/tigo/home/co/portfolio/contracts/11381628/products"
    And Ingreso token
    Then El codigo de estado de la respuesta es 200
    And La variable del cuerpo "[0]['productId']" contiene el valor "13"
    And La variable del cuerpo "[1]['productId']" contiene el valor "14"
    And La variable del cuerpo "[2]['productId']" contiene el valor "7"
