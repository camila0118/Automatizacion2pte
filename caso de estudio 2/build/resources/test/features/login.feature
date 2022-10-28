Feature: login


  Scenario: login successful
    Given  el usuario esta en la pagina
    When  el suario ingresa credenciales
    Then el usuario aparece logueado