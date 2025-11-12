@LoginExitoso
Feature: Login en OrangeHMR

    Scenario Outline:
      Given el usuario se encuentra en la página de OrangeHMR
      When ingresa el username "<user>"
      And ingresa el password "<pass>"
      And clickea el boton login
      Then usuario ingresa exitosamente
      Examples:
      |user|pass|
      |Admin|admin123|
