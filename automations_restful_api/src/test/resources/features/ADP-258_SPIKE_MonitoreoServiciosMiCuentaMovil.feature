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

  Scenario: Consultar el servicio GET de getImeisByDocument
    Given Consulto el servicio GET "http://prod.api.tigo.com/v1/tigo/mobile/co/device_registration/IMEIService/getImeisByDocument/1053778038?type=CC"
    And Ingreso token
    And Envio el parametro "type" con valor "CC"
    Then El codigo de estado de la respuesta es 200

  Scenario: Consultar el servicio GET de checkImeiInWhiteList
    Given Consulto el servicio GET "http://prod.api.tigo.com/v1/tigo/mobile/co/device_registration/IMEIService/checkImeiInWhiteList/861875046827112"
    And Ingreso token
    Then El codigo de estado de la respuesta es 200
    And La variable del cuerpo "description" contiene el valor "El imei 861875046827112 se encuentra reportado en listas blancas"

  Scenario: Consultar el servicio GET de checkImeiInBlackList
    Given Consulto el servicio GET "http://prod.api.tigo.com/v1/tigo/mobile/co/device_registration/IMEIService/checkImeiInBlackList/357583050112303"
    And Ingreso token
    Then El codigo de estado de la respuesta es 200
    And La variable del cuerpo "description" contiene el valor "El imei 357583050112303 se encuentra reportado en listas negras de equipos desde 2019-May-13 y el operador bloqueante es Tigo"

  Scenario: Consultar el servicio GET de validateImeiAlgorithm
    Given Consulto el servicio GET "http://prod.api.tigo.com/v1/tigo/mobile/co/device_registration/IMEIService/validateAlgorithm/004402341662538"
    And Ingreso token
    Then El codigo de estado de la respuesta es 200
    And La variable del cuerpo "IMEIDetail.model" contiene el valor "Test IMEI"

  Scenario: Consultar el servicio GET de EnableDisableAvailableServices
    Given Consulto el servicio GET "https://prod.api.tigo.com/REST/EnableDisableAvailableServicesVL1/CO/clients/3012189672?operation=DISABLE&serviceId=02"
    And Ingreso token
    And Envio el parametro "operation" con valor "DISABLE"
    And Envio el parametro "serviceId" con valor "02"
    Then El codigo de estado de la respuesta es 200
    And La variable del cuerpo "TigoApiResponse.response" contiene el valor "Tu solicitud esta siendo procesada, en instantes recibiras un mensaje de notificacion con el resultado de la misma"

  Scenario: Consultar el servicio GET de GetAvailableServices
    Given Consulto el servicio GET "https://prod.api.tigo.com/REST/GetAvailableServiceVL1/CO/clients/3012189672"
    And Ingreso token
    And Envio el header "Content-Type" con valor "application/x-www-form-urlencoded"
    Then El codigo de estado de la respuesta es 200
    And La variable del cuerpo "TigoApiResponse.status" contiene el valor "OK"
