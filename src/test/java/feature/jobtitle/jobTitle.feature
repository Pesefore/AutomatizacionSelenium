@CreateNewJobTitle
Feature: Create new Job Title
  Background:
    Given el usuario se encuentra en la página de OrangeHMR
    When ingresa el username "Admin"
    And ingresa el password "admin123"
    And clickea el boton login
    Then usuario ingresa exitosamente

  Scenario Outline:
    When el usuario da click al modulo de Admin
    And clickea el boton Job
    And selecciona la opcion de Job Titles
    And clickea el boton +Add
    And ingresa un "<Job Title>" en el input de Job Title
    And ingresa una "<Description>" en el input de Job Description
    And ingresa una "<Note>" en el input de Note
    And clickea el boton Save
    Then el usuario habra creado exitosamente su Job Title
    Examples:
    |Job Title|Description|Note|
    |Quality Enginner|Test Case|Lo que no me mata, me hace más fuerte|


@CreateAndDeleteJobTitle

  Scenario Outline: Create And Delete Job Title
    When el usuario da click al modulo de Admin
    And clickea el boton Job
    And selecciona la opcion de Job Titles
    And clickea el boton +Add
    And ingresa un "<Job Title>" en el input de Job Title
    And ingresa una "<Description>" en el input de Job Description
    And ingresa una "<Note>" en el input de Note
    And clickea el boton Save
    Then el usuario habra creado exitosamente su Job Title
    And selecciona el boton eliminar del titulo de trabajo "<Job Title>"
    And clickea el boton Yes, Delete
    Then el usuario habra eliminado exitosamente su Job Title
    Examples:
      |Job Title|Description|Note|
      |Quality Enginner|Test Case|Lo que no me mata, me hace más fuerte|






