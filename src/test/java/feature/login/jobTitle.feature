@JobTitle
Feature: Create new Job Title
  Background:
    Given el usuario inicia sesión en OrangeHMR

  Scenario Outline:
    When el usuario da click al modulo de Admin
    And clickea el boton Job
    And selecciona la opcion de Job Titles
    And clickea el boton +Add
    And ingresa un "<Job Title>" en el input de Job Title
    And ingresa una "<Description>" en el input de Job Description
    And clickea el boton Save
    Then el usuario habra creado exitosamente su Job Title
    Examples:
    |Job Title|Description|
    |Quality Enginner|Test Case|




