package stepDefinitions.moduloPimStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import step.moduloPimStep.ModuloPimStep;

public class ModuloPimStepDefinitions {

    private ModuloPimStep moduloPimStep = new ModuloPimStep();

    @When("el usuario da click al modulo de PIM")
    public void moduloPIM(){
        moduloPimStep.moduloPIM();
    }
    @And("clickea el boton +Add para empleado")
    public void buttonAdd(){
        moduloPimStep.buttonAdd();
    }
    @And("ingresa un {string} en el input de First Name")
    public void ingresaFirstName(String firstName){
        moduloPimStep.ingresaFirstName(firstName);
    }
    @And("ingresa un {string} en el input de Middle Name")
    public void ingresaMiddleName(String middleName){
        moduloPimStep.ingresaMiddleName(middleName);
    }
    @And("ingresa un {string} en el input de Last Name")
    public void ingresaLastName(String lastName){
        moduloPimStep.ingresaLastName(lastName);
    }
    @And("ingresa un {string} en el input de Employee Id")
    public void ingresaID(String ID){
        moduloPimStep.ingresaID(ID);
    }
    @And("clikea el boton Create Login Details")
    public void buttonCreateLoginDetails(){
        moduloPimStep.buttonCreateLoginDetails();
    }
    @And("ingresa un {string} en el input de Username")
    public void ingresaUsername(String username){
        moduloPimStep.ingresaUsername(username);
    }
    @And("ingresa un {string} en el input de Password")
    public void ingresaPassword(String password){
        moduloPimStep.ingresaPassword(password);
    }
    @And("confirma nuevamente su {string} en el input de Confirm Password")
    public void ingresaConfirmPassword(String password){
        moduloPimStep.ingresaConfirmPassword(password);
    }
    @And("coloca su {string} de perfil de empleado")
    public void ingresaFotoPerfil(String rutaFoto){
        moduloPimStep.ingresaFotoPerfil(rutaFoto);
    }
    @And("clickea el boton Save para empleado")
    public void botonSave(){
        moduloPimStep.botonSave();
    }
    @Then("el usuario habra creado exitosamente un nuevo Employee")
    public void employeeExitoso(){
        moduloPimStep.employeeExitoso();
    }

}
