#Author: Henry Andres Correa Correa
#Keywords Summary :
#Sample Feature Definition Template
@Ejemplo
Feature: Caracteristica ejemplo de pruebas restful
  Como automatizador
  Quiero aprender el framework de cucumber
  Para probar automatizamente servicios REST

  Scenario: Listado de estudiantes - responde 200
    Given Consulto el servicio GET "http://localhost:8282/student/list"
    Then El codigo de estado de la respuesta es 200
     Then El codigo de estado de la respuesta es 200
      Then El codigo de estado de la respuesta es 200
