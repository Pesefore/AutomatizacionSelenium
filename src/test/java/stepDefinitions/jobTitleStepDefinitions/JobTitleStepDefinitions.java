package stepDefinitions.jobTitleStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import step.jobTitleStep.JobTitleStep;

public class JobTitleStepDefinitions {
    private JobTitleStep jobTitleStep = new JobTitleStep();

    @Given("el usuario inicia sesión en OrangeHMR")
    public void realizarLogin(){
        jobTitleStep.realizarLogin("Admin","admin123");
    }
    @When("el usuario da click al modulo de Admin")
    public void seleccionaAdmin(){
        jobTitleStep.seleccionaAdmin();
    }
    @And("clickea el boton Job")
    public void seleccionaButtonJob(){
        jobTitleStep.seleccionaButtonJob();
    }
    @And("selecciona la opcion de Job Titles")
    public void seleccionaJobTitles(){
        jobTitleStep.seleccionaJobTitles();
    }
    @And("clickea el boton +Add")
    public void seleccionaButtonAdd(){
        jobTitleStep.seleccionaButtonAdd();
    }
    @And("ingresa un {string} en el input de Job Title")
    public void ingresaJobTitle(String title){
        jobTitleStep.ingresaJobTitle(title);
    }
    @And("ingresa una {string} en el input de Job Description")
    public void ingresaDescription(String description){
        jobTitleStep.ingresaDescription(description);
    }
    @And("clickea el boton Save")
    public void seleccionaButtonSave(){
        jobTitleStep.seleccionaButtonSave();
    }
    @Then("el usuario habra creado exitosamente su Job Title")
    public void titleExitoso(){
        jobTitleStep.titleExitoso();
    }

}
