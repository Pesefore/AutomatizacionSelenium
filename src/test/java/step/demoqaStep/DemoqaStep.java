package step.demoqaStep;

import hooks.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.demoqa.DemoqaPage;
import pages.login.LoginPage;

public class DemoqaStep {

    private DemoqaPage demoqaPage;
    private WebDriver driver;

    public DemoqaStep(){
        this.driver = Hooks.getDriver();
        this.demoqaPage = new DemoqaPage(driver);
    }

    public void abrirPaginaDemoQA(){
        driver.get("https://demoqa.com/");
    }
    public void clickForms(){
        demoqaPage.clickForms();
    }
    public void clickPracticeForms(){
        demoqaPage.clickPracticeForms();
    }
    public void ingresoExitoso(){
        demoqaPage.ingresoExitoso();
    }
    //--------------------------------------------------------------------------------------------------
    public void ingresaPrimerNombre(String primerNombre){
        demoqaPage.ingresaPrimerNombre(primerNombre);
    }
    public void ingresaSegundoNombre(String segundoNombre){
        demoqaPage.ingresaSegundoNombre(segundoNombre);
    }
    public void ingresaCorreoElectronico(String correoElectronico){
        demoqaPage.ingresaCorreoElectronico(correoElectronico);
    }
    public void clickGenero(){
        demoqaPage.clickGenero();
    }
    public void ingresaNumeroTelefono(String numeroTelefono){
        demoqaPage.ingresaNumeroTelefono(numeroTelefono);
    }
    public void ingresaFechaCumpleaños(){
        demoqaPage.ingresaFechaCumpleaños();
    }
    public void ingresaProfesion(String profesion){
        demoqaPage.ingresaProfesion(profesion);
    }
    public void clickPasatiempo(){
        demoqaPage.clickPasatiempo();
    }
    public void ingresaFotoPersonalUsuario(String foto){
        demoqaPage.ingresaFotoPersonalUsuario(foto);
    }
    public void ingresaDireccionCasa(String direccion){
        demoqaPage.ingresaDireccionCasa(direccion);
    }
    public void clickEstado(){
        demoqaPage.clickEstado();
    }
    public void clickCiudad(){
        demoqaPage.clickCiudad();
    }
    public void clickSubmitDemoQA(){
        demoqaPage.clickSubmitDemoQA();
    }
    public void formularioExitoso(){
        demoqaPage.formularioExitoso();
    }

}
