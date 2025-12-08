package stepDefinitions.cambiodeventanaStepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import step.cambiodeventanaStep.CambiodeVentanaStep;

public class CambiodeVentanaStepDefinitions {

    private CambiodeVentanaStep cambiodeVentanaStep = new CambiodeVentanaStep();

    @When("clickea al modulo de Alerts, Frame & Windows")
    public void clickAlertsFrame(){
        cambiodeVentanaStep.clickAlertsFrame();
    }
    @And("clickea el submodulo de Browser Windows")
    public void clickBrowserWindow(){
        cambiodeVentanaStep.clickBrowserWindow();
    }

    @When("el usuario da click a New Tab")
    public void clickNewTab(){
        cambiodeVentanaStep.clickNewTab();
    }
    @Then("habra cambiado exitosamente a otra pestaña")
    public void cambioPestañaExitoso(){
        cambiodeVentanaStep.cambioPestañaExitoso();
    }

    @When("el usuario da click a New Window")
    public void clickNewWindows(){
        cambiodeVentanaStep.clickNewWindows();
    }

    @Then("habra cambiado exitosamente a otra ventana")
    public void cambioVentanaExitoso(){
        cambiodeVentanaStep.cambioVentanaExitoso();
    }

    @When("el usuario da click a New Window Message")
    public void newWindowMessage(){
        cambiodeVentanaStep.newWindowMessage();
    }
    @Then("habra cambiado exitosamente a otra ventana con mensaje incluido")
    public void mensajeenNuevaVentanaExitoso(){
        cambiodeVentanaStep.mensajeenNuevaVentanaExitoso();
    }

}
