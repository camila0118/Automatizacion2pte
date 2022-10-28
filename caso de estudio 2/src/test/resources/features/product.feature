Feature: login
  como usuario de servicios, necesito automatizar el inicio de sesión para acceder a los servicios

  Scenario: login successful
    Given  el usuario esta en la pagina
    When  el suario ingresa credenciales
      | username   | password       |
      | 1061694589 | camidorado0118 |
    Then el usuario aparece logueado
