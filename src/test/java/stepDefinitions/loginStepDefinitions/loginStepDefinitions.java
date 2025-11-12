package stepDefinitions.loginStepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import step.loginStep.LoginStep;

public class loginStepDefinitions {


    private LoginStep loginStep = new LoginStep();

    @Given("el usuario se encuentra en la página de OrangeHMR")
    public void abrirPagina(){
        loginStep.abrirPagina();
    }
    @When("ingresa el username {string}")
    public void ingresaUsername(String username){
        loginStep.ingresaUsername(username);
    }

    @And("ingresa el password {string}")
    public void ingresaPassword(String password){
        loginStep.ingresaPassword(password);
    }
    @And("clickea el boton login")
    public void clickButton(){
        loginStep.clickButton();
    }
    @Then("usuario ingresa exitosamente")
    public void ingresoExitoso(){
        loginStep.ingresoExitoso();
    }


}
