package stepDefinitions.recruitmentStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import step.recruitmentStep.RecruitmentStep;

public class RecruitmentStepDefinitions {

    private RecruitmentStep recruitmentStep = new RecruitmentStep();

    @When("el usuario da click al modulo de Recruitment")
    public void moduloRecruitment(){
        recruitmentStep.moduloRecruitment();
    }
    @And("clickea el boton +Add para crear un nuevo candidato")
    public void buttonAddRecruitment(){
        recruitmentStep.buttonAddRecruitment();
    }
    @And("ingresa un {string} en el input de First Name para el modulo de Recruitment")
    public void ingresaFistNameRecruitment(String firstName){
        recruitmentStep.ingresaFistNameRecruitment(firstName);
    }
    @And("ingresa un {string} en el input de Middle Name para el modulo de Recruitment")
    public void ingresaMiddleNameRecruitment(String middleName){
        recruitmentStep.ingresaMiddleNameRecruitment(middleName);
    }
    @And("ingresa un {string} en el input de Last Name para el modulo de Recruitment")
    public void ingresaLastNameRecruitment(String lastName){
        recruitmentStep.ingresaLastNameRecruitment(lastName);
    }
    @And("ingresa la vacante disponible en el dropdown de Vacancy")
    public void dropdownVacancy(){
        recruitmentStep.dropdownVacancy();
    }
    @And("ingresa un {string} en el input de Email")
    public void ingresaEmailRecruitment(String email){
        recruitmentStep.ingresaEmailRecruitment(email);
    }
    @And("ingresa un {string} en el input de Contact Number")
    public void ingresaContactNumber(String phoneNumber){
        recruitmentStep.ingresaContactNumber(phoneNumber);
    }
    @And("ingresa un {string} de su experiencia en el input de Resumen")
    public void ingresaResumenRecruitment(String resumenRecruitment){
        recruitmentStep.ingresaResumenRecruitment(resumenRecruitment);
    }
    @And("ingresa {string} en el input de Keywords")
    public void ingresaKeywords(String keywords){
        recruitmentStep.ingresaKeywords(keywords);
    }
    @And("ingresa la fecha a la que ha postulado en el datepicket de Date of Application")
    public void ingresaDateofAplication(){
        recruitmentStep.ingresaDateofAplication();
    }
    @And("ingresa una {string} opcional en el input de Notes")
    public void ingresaNoteRecruitment(String noteRecruitment){
        recruitmentStep.ingresaNoteRecruitment(noteRecruitment);
    }
    @And("clickea el boton Consent to keep data")
    public void bottonConsentKeepData(){
        recruitmentStep.bottonConsentKeepData();
    }
    @And("clickea el boton Save para crear un nuevo candidato")
    public void bottonSaveNewCandidate(){
        recruitmentStep.bottonSaveNewCandidate();
    }
    @Then("el usuario habra creado exitosamente en nuevo Candidate")
    public void candidateExitoso(){
        recruitmentStep.candidateExitoso();
    }


}
