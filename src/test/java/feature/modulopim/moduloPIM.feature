@CreateEmployee
Feature: Create a new employee
  Background:
    Given el usuario inicia sesion con usuario "Admin" y password "admin123"

  Scenario Outline:
    When el usuario da click al modulo de PIM
    And clickea el boton +Add para empleado
    And ingresa un "<First Name>" en el input de First Name
    And ingresa un "<Middle Name>" en el input de Middle Name
    And ingresa un "<Last Name>" en el input de Last Name
    And ingresa un "<Employee ID>" en el input de Employee Id
    And clikea el boton Create Login Details
    And ingresa un "<Username>" en el input de Username
    And ingresa un "<Password>" en el input de Password
    And confirma nuevamente su "<Password>" en el input de Confirm Password
    And coloca su "<Foto>" de perfil de empleado
    And clickea el boton Save para empleado
    Then el usuario habra creado exitosamente un nuevo Employee
    Examples:
      |First Name|Middle Name|Last Name|Employee ID|Username|Password|Foto|
      |Ruben     |Camilo     |ApellidoTest|1234TEST|Persefore|sexlore_156|C:\Proyectos\SeleniumProject\src\main\resources\kokushibo.jpg|