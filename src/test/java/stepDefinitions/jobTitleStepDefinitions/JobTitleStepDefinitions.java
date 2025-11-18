package stepDefinitions.jobTitleStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import step.jobTitleStep.JobTitleStep;

public class JobTitleStepDefinitions {
    private JobTitleStep jobTitleStep = new JobTitleStep();

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
    @And("ingresa una {string} en el input de Note")
    public void ingresaNote(String note){
        jobTitleStep.ingresaNote(note);
    }
    @And("clickea el boton Save")
    public void seleccionaButtonSave(){
        jobTitleStep.seleccionaButtonSave();
    }
    @Then("el usuario habra creado exitosamente su Job Title")
    public void titleExitoso(){
        jobTitleStep.titleExitoso();
    }
    // -----------------------------------------------------------------------------------------------------------
    @And("selecciona el boton eliminar del titulo de trabajo {string}")
    public void buttonDelete(String title){
        jobTitleStep.buttonDelete(title);
    }
    @And("clickea el boton Yes, Delete")
    public void buttonYesDelete(){
        jobTitleStep.buttonYesDelete();
    }
    @And("el usuario habra eliminado exitosamente su Job Title")
    public void titleDelete(){
        jobTitleStep.titleDelete();
    }


}
