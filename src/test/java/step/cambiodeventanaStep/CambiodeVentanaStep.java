package step.cambiodeventanaStep;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.cambiodeventana.CambiodeVentanaPage;

public class CambiodeVentanaStep {
    private CambiodeVentanaPage cambiodeVentanaPage;
    private WebDriver driver;

    public CambiodeVentanaStep(){
        this.driver = Hooks.getDriver();
        this.cambiodeVentanaPage = new CambiodeVentanaPage(driver);
    }
    public void clickAlertsFrame(){
        cambiodeVentanaPage.clickAlertsFrame();
    }
    public void clickBrowserWindow(){
        cambiodeVentanaPage.clickBrowserWindow();
    }
    public void clickNewTab(){
       cambiodeVentanaPage.clickNewTab();
    }
    public void cambioPestañaExitoso(){
        cambiodeVentanaPage.cambioPestañaExitoso();
    }
    public void clickNewWindows(){
        cambiodeVentanaPage.clickNewWindows();
    }
    public void cambioVentanaExitoso(){
        cambiodeVentanaPage.cambioVentanaExitoso();
    }
    public void newWindowMessage(){
        cambiodeVentanaPage.newWindowMessage();
    }
    public void mensajeenNuevaVentanaExitoso(){
        cambiodeVentanaPage.mensajeenNuevaVentanaExitoso();
    }

}
