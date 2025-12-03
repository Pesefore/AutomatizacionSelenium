package stepDefinitions.demoqaStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import step.demoqaStep.DemoqaStep;

public class DemoqaStepDefinitions {

    private DemoqaStep demoqaStep = new DemoqaStep();

    @Given("el usuario se encuentra en la pagina de inicio de DemoQA")
    public void abrirPaginaDemoQA(){
        demoqaStep.abrirPaginaDemoQA();
    }
    @When("clickea al modulo de Forms")
    public void clickForms(){
        demoqaStep.clickForms();
    }
    @And("clickea el submodulo de Practice Form")
    public void clickPracticeForms(){
        demoqaStep.clickPracticeForms();
    }
    @Then("usuario ingresa exitosamente al modulo")
    public void ingresoExitoso(){
        demoqaStep.ingresoExitoso();
    }

    //--------------------------------------------------------------------------------------------------------

    @When("el usuario ingresa su {string} en el campo de FirstName")
    public void ingresaPrimerNombre(String primerNombre){
        demoqaStep.ingresaPrimerNombre(primerNombre);
    }
    @And("ingresa su {string} en el campo de LastName")
    public void ingresaSegundoNombre(String segundoNombre){
        demoqaStep.ingresaSegundoNombre(segundoNombre);
    }
    @And("ingresa su {string} en el campo de Email")
    public void ingresaCorreoElectronico(String correoElectronico){
        demoqaStep.ingresaCorreoElectronico(correoElectronico);
    }
    @And("clikea su genero en el campo de Gender")
    public void clickGenero(){
        demoqaStep.clickGenero();
    }
    @And("ingresa su {string} en el campo de Mobile")
    public void ingresaNumeroTelefono(String numeroTelefono){
        demoqaStep.ingresaNumeroTelefono(numeroTelefono);
    }
    @And("clickea en el campo de Date of Birth y digita su año de nacimiento")
    public void ingresaFechaCumpleaños(){
        demoqaStep.ingresaFechaCumpleaños();
    }
    @And("ingresa su {string} en el campo de Subjects")
    public void ingresaProfesion(String profesion){
        demoqaStep.ingresaProfesion(profesion);
    }
    @And("clickea su pasatiempo en el campo de Hobbies")
    public void clickPasatiempo(){
        demoqaStep.clickPasatiempo();
    }
    @And("ingresa una {string} en el campo de Picture")
    public void ingresaFotoPersonalUsuario(String foto){
        demoqaStep.ingresaFotoPersonalUsuario(foto);
    }
    @And("ingresa su {string} en el campo de Current Address")
    public void ingresaDireccionCasa(String direccion){
        demoqaStep.ingresaDireccionCasa(direccion);
    }
    @And("clikea su estado de nacimiento en el campo de State and City")
    public void clickEstado(){
        demoqaStep.clickEstado();
    }
    @And("clikea su ciudad de nacimiento en el campo de State and City")
    public void clickCiudad(){
        demoqaStep.clickCiudad();
    }
    @And("clickea el boton de submit de demoQA")
    public void clickSubmitDemoQA(){
        demoqaStep.clickSubmitDemoQA();
    }
    @Then("habra salido un mensaje de agradecimiento por enviar el formulario")
    public void formularioExitoso(){
        demoqaStep.formularioExitoso();
    }

}

