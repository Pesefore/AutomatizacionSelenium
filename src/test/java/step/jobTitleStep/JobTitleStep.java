package step.jobTitleStep;

import hooks.Hooks;
import org.openqa.selenium.WebDriver;
import pages.jobTitle.JobTitlePage;
import step.loginStep.LoginStep;

public class JobTitleStep {

    private WebDriver Driver;
    private LoginStep loginStep;
    private JobTitlePage jobTitlePage;

    public JobTitleStep(){
        this.Driver = Hooks.getDriver();
        this.loginStep = new LoginStep(); //Estás creando un objeto de otra clase para usar sus métodos dentro de tu clase
        this.jobTitlePage = new JobTitlePage(Driver);
    }

    public void realizarLogin(String username, String password){
        loginStep.abrirPagina();
        loginStep.ingresaUsername(username);
        loginStep.ingresaPassword(password);
        loginStep.clickButton();
    }

    public void seleccionaAdmin(){
        jobTitlePage.seleccionaAdmin();
    }

    public void seleccionaButtonJob(){
        jobTitlePage.seleccionaButtonJob();
    }

    public void seleccionaJobTitles(){
        jobTitlePage.seleccionaJobTitles();
    }

    public void seleccionaButtonAdd(){
        jobTitlePage.seleccionaButtonAdd();
    }

    public void ingresaJobTitle(String title){
        jobTitlePage.ingresaJobTitle(title);
    }
    public void ingresaDescription(String description){
        jobTitlePage.ingresaDescription(description);
    }
    public void ingresaNote(String note){jobTitlePage.ingresaNote(note);
    }
    public void seleccionaButtonSave(){
        jobTitlePage.seleccionaButtonSave();
    }
    public void titleExitoso(){
        jobTitlePage.titleExitoso();
    }


}
