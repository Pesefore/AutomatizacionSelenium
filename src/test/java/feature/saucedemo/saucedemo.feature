#Hay que tener presente que esto no es BDD
#Recordar que existen dos formas de escribir los casos de pruebas en Gherkin (declarativo y exhortativo, o imperativo)
#El declarativo describe qué debe ocurrir, sin entrar en detalles técnicos o pasos exactos.
#El exhortativo describe cómo debe ocurrir, con mucho detalle. Cabe resaltar que esta forma de escribir el caso de prueba
#no es práctica de BDD, ya que no describe interraciones de negocio.

@SauceDemoEndTwoEnd
Feature: Flujo end two end de compra
  Background:
    Given el usuario se encuentra en la pagina de loguin
    And  escribe su "performance_glitch_user" en el campo de Username
    And escribe su "secret_sauce" en el campo de Password
    And da click al boton de login
    Then el usuario habra entrado exitosamente al modulo de compras

  Scenario Outline:
    When el usuario añade al carrito haciendo click en el articulo de Backpack
    And añade a la cesta de compras haciendo click en el articulo Bike Light
    And añade a la cesta de compras haciendo click en el articulo Bolt T-Shirt
    And añade a la cesta de compras haciendo click en el articulo Fleece Jacket
    And añade a la cesta de compras haciendo click en el articulo Sauce Labs Onesie
    And añade a la cesta de compras haciendo click en el articulo Red T-Shirt
    And el usuario clickea el carrito de compras para realizar la compra
    Then habra sido redireccionado exitosamente a que verifique sus articulos seleccionados
    And da click en el boton Checkout
    Then habra sido redireccionado exitosamente a que rellene sus datos personales
    And el usuario escribe su "<primerNombre>" en el campo de First Name
    And escribe su "<segundoNombre>" en el campo de Last Name
    And escribe su "<codigoPostal>" en el campo de Postal Code
    And da click en el boton Continue
    Then habra sido redireccionado exitosamente los detalles de su pedido y el precio total a pagar
    And da click en el boton Finish
    Then el usuario habra comprado exitosamente los articulos
    Examples:
    |primerNombre|segundoNombre|codigoPostal|
    |Eduardo     |Flamenco     |15118       |
