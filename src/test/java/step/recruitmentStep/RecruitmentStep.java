package step.recruitmentStep;

import hooks.Hooks;
import org.openqa.selenium.WebDriver;
import pages.moduloPIM.ModuloPimPage;
import pages.recruitment.RecruitmentPage;
import webdrivermanager.WebDriverManager;

public class RecruitmentStep {

    private WebDriver driver;
    private RecruitmentPage recruitmentPage;

    public RecruitmentStep(){
        this.driver = WebDriverManager.getDriver();
        this.recruitmentPage = new RecruitmentPage(driver);
    }

    public void moduloRecruitment(){
        recruitmentPage.moduloRecruitment();
    }
    public void buttonAddRecruitment(){
        recruitmentPage.buttonAddRecruitment();
    }
    public void ingresaFistNameRecruitment(String firstName){
        recruitmentPage.ingresaFistNameRecruitment(firstName);
    }
    public void ingresaMiddleNameRecruitment(String middleName){
        recruitmentPage.ingresaMiddleNameRecruitment(middleName);
    }
    public void ingresaLastNameRecruitment(String lastName){
        recruitmentPage.ingresaLastNameRecruitment(lastName);
    }
    public void dropdownVacancy(){
        recruitmentPage.dropdownVacancy();
    }
    public void ingresaEmailRecruitment(String email){
        recruitmentPage.ingresaEmailRecruitment(email);
    }
    public void ingresaContactNumber(String phoneNumber){
        recruitmentPage.ingresaContactNumber(phoneNumber);
    }
    public void ingresaResumenRecruitment(String resumenRecruitment){
        recruitmentPage.ingresaResumenRecruitment(resumenRecruitment);
    }
    public void ingresaKeywords(String keywords){
        recruitmentPage.ingresaKeywords(keywords);
    }
    public void ingresaDateofAplication(){
        recruitmentPage.ingresaDateofAplication();
    }
    public void ingresaNoteRecruitment(String noteRecruitment){
        recruitmentPage.ingresaNoteRecruitment(noteRecruitment);
    }
    public void bottonConsentKeepData(){
        recruitmentPage.bottonConsentKeepData();
    }
    public void bottonSaveNewCandidate(){
        recruitmentPage.bottonSaveNewCandidate();
    }
    public void candidateExitoso(){
        recruitmentPage.candidateExitoso();
    }



}
