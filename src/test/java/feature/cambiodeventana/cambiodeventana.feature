@CambiodeTabExitoso
Feature: Cambio de pestaña Exitoso

  Background:
    Given el usuario se encuentra en la pagina de inicio de DemoQA
    When clickea al modulo de Alerts, Frame & Windows
    And clickea el submodulo de Browser Windows
    Then usuario ingresa exitosamente al modulo

  Scenario:
    When el usuario da click a New Tab
    Then habra cambiado exitosamente a otra pestaña

@CambiodeVentanaExitoso
  Scenario:
  When el usuario da click a New Window
  Then habra cambiado exitosamente a otra ventana


@NewWindowMessageExitoso
  Scenario:
  When el usuario da click a New Window Message
  Then habra cambiado exitosamente a otra ventana con mensaje incluido