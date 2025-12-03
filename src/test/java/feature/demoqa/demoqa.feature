@RegistroExitosoEstudiante
  Feature: Create a new student register

    Background:
      Given el usuario se encuentra en la pagina de inicio de DemoQA
      When clickea al modulo de Forms
      And clickea el submodulo de Practice Form
      Then usuario ingresa exitosamente al modulo

    Scenario Outline:
      When el usuario ingresa su "<primerNombre>" en el campo de FirstName
      And ingresa su "<segundoNombre>" en el campo de LastName
      And ingresa su "<correoElectronico>" en el campo de Email
      And clikea su genero en el campo de Gender
      And ingresa su "<numeroTelefono>" en el campo de Mobile
      And clickea en el campo de Date of Birth y digita su año de nacimiento
      And ingresa su "<profesion>" en el campo de Subjects
      And clickea su pasatiempo en el campo de Hobbies
      And ingresa una "<foto>" en el campo de Picture
      And ingresa su "<direccion>" en el campo de Current Address
      And clikea su estado de nacimiento en el campo de State and City
      And clikea su ciudad de nacimiento en el campo de State and City
      And clickea el boton de submit de demoQA
      Then habra salido un mensaje de agradecimiento por enviar el formulario
      Examples:
      |primerNombre|segundoNombre|correoElectronico|numeroTelefono|profesion|foto|direccion|
      |Isaias      |Ruben        |isaiasRuben@correo.com|9666666669|Computer Science|C:\Proyectos\SeleniumProject\src\main\resources\kokushibo.jpg|Avenida Aviación con Mayolo, el pájaro loco|








