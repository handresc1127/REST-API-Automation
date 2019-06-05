#Author: Melissa Pineda
#Keywords Summary :
#Sample Feature Definition Template
@MonitoreoMiCuenta @Monitoreo
Feature: SPIKE Monitoreo Servicios Mi Cuenta Home
  Como automatizador
  Quiero realizar pruebas en api
  Para probar que funcionen correctamente

  Scenario: Consultar el servicio GET de getCurrentPlanInfoV1
    Given Consulto el servicio GET "https://prod.api.tigo.com/v1/tigo/mobile/co/plans/subscribers/3008913170/current"
    And Ingreso token
    Then El codigo de estado de la respuesta es 200
    And La variable del cuerpo "planName" contiene el valor "Pospago 5.1"

  Scenario: Consultar el servicio GET de getCurrentPlanInfoV1
    Given Consulto el servicio GET "https://prod.api.tigo.com/v1/tigo/mobile/co/upselling/subscribers/573007072375/account"
    And Ingreso token
    Then El codigo de estado de la respuesta es 200
    And La variable del cuerpo "account.status" contiene el valor "ACTIVE"

  Scenario: Consultar el servicio GET de GetPQRCRMPortalMsisdn
    Given Consulto el servicio GET "http://prod.api.tigo.com/v1/tigo/co/customer-support/subscribers/3006100623/claims"
    And Ingreso token
    Then El codigo de estado de la respuesta es 200
    And La variable del cuerpo "response.state" contiene el valor "CERRADO"

  Scenario: Consultar el servicio GET de getLastOTA
    Given Consulto el servicio GET "https://prod.api.tigo.com/v1/tigo/mobile/co/device_registration/IMEIService/getLastOTA/3017693027"
    And Ingreso token
    Then El codigo de estado de la respuesta es 200
    And La variable del cuerpo "IMEIDetail.brand" contiene el valor "LG"

  Scenario: Consultar el servicio GET de GetClientAccountGeneralInfoV1
    Given Consulto el servicio GET "https://prod.api.tigo.com/v1/tigo/mobile/co/upselling/subscribers/573007072375/account"
    And Ingreso token
    Then El codigo de estado de la respuesta es 200
    And La variable del cuerpo "account.status" contiene el valor "ACTIVE"

  Scenario: Consultar el servicio GET de getupgraderequest
    Given Consulto el servicio GET "https://prod.api.tigo.com/v1/tigo/mobile/co/upselling/subscribers/573007072375/account"
    And Ingreso token
    Then El codigo de estado de la respuesta es 200
    And La variable del cuerpo "account.status" contiene el valor "ACTIVE"
