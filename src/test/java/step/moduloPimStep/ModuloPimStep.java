package step.moduloPimStep;

import hooks.Hooks;
import org.openqa.selenium.WebDriver;
import pages.moduloPIM.ModuloPimPage;
import step.loginSharedStep.LoginStep;
import webdrivermanager.WebDriverManager;

public class ModuloPimStep {

    private WebDriver driver;
    //private LoginStep loginStep;
    private ModuloPimPage moduloPimPage;

    public ModuloPimStep(){
        this.driver = WebDriverManager.getDriver();
        //this.loginStep = new LoginStep(); //Estás creando un objeto de otra clase para usar sus métodos dentro de tu clase
        this.moduloPimPage = new ModuloPimPage(driver);

    }

    public void moduloPIM(){
        moduloPimPage.moduloPIM();
    }
    public void buttonAdd(){moduloPimPage.buttonAdd();}
    public void ingresaFirstName(String firstName){
        moduloPimPage.ingresaFirstName(firstName);
    }
    public void ingresaMiddleName(String middleName){
        moduloPimPage.ingresaMiddleName(middleName);
    }
    public void ingresaLastName(String lastName){
        moduloPimPage.ingresaLastName(lastName);
    }
    public void ingresaID(String ID){
        moduloPimPage.ingresaID(ID);
    }
    public void buttonCreateLoginDetails(){
        moduloPimPage.buttonCreateLoginDetails();
    }
    public void ingresaUsername(String username){
        moduloPimPage.ingresaUsername(username);
    }
    public void ingresaPassword(String password){
        moduloPimPage.ingresaPassword(password);
    }
    public void ingresaConfirmPassword(String password){
        moduloPimPage.ingresaConfirmPassword(password);
    }
    public void ingresaFotoPerfil(String rutaFoto){
        moduloPimPage.ingresaFotoPerfil(rutaFoto);
    }
    public void botonSave(){
        moduloPimPage.botonSave();
    }
    public void employeeExitoso(){
        moduloPimPage.employeeExitoso();
    }

}
