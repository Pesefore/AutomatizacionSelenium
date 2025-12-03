@CreateNewCandidate
  Feature: Crate a new candidate
    Background:
      Given el usuario inicia sesion con usuario "Admin" y password "admin123"

      Scenario Outline:
        When el usuario da click al modulo de Recruitment
        And clickea el boton +Add para crear un nuevo candidato
        And ingresa un "<FirstName>" en el input de First Name para el modulo de Recruitment
        And ingresa un "<MiddleName>" en el input de Middle Name para el modulo de Recruitment
        And ingresa un "<LastName>" en el input de Last Name para el modulo de Recruitment
        And ingresa la vacante disponible en el dropdown de Vacancy
        And ingresa un "<email>" en el input de Email
        And ingresa un "<numeroTelefono>" en el input de Contact Number
        And ingresa un "<resumen>" de su experiencia en el input de Resumen
        And ingresa "<palabrasClaves>" en el input de Keywords
        And ingresa la fecha a la que ha postulado en el datepicket de Date of Application
        And ingresa una "<nota>" opcional en el input de Notes
        And clickea el boton Consent to keep data
        And clickea el boton Save para crear un nuevo candidato
        Then el usuario habra creado exitosamente en nuevo Candidate

        Examples:
        |FirstName|MiddleName|LastName|email|numeroTelefono|resumen|palabrasClaves|nota|
        |Edgardo  |Joaquín   |Altamirano Perez|prueba@gmail.com|987654111|C:\Proyectos\SeleniumProject\src\main\resources\e1.pdf|Feliz Navidad|Prueba de Automatización|

