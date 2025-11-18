package stepDefinitions.loginSharedStepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import step.loginSharedStep.LoginStep;

public class LoginStepDefinitions {

    private LoginStep loginStep = new LoginStep();

    @Given("el usuario se encuentra en la página de OrangeHMR")
    public void abrirPagina(){
        loginStep.abrirPagina();
    }
    //------------------------------------------------------------------------------------
    @Given("el usuario inicia sesion con usuario {string} y password {string}")
    public void loginGlobal(String username, String password){
        loginStep.abrirPagina();
        loginStep.ingresaUsername(username);
        loginStep.ingresaPassword(password);
        loginStep.clickButton();
        loginStep.ingresoExitoso();
    }
    /* Esto va a permitir hacer un login global; es decir, va a ser reutilizable o escalable el módulo de login
    para los distintos módulos que tengan que pasar por el módulo de login: Job Title, PIM, etc. */
    //-------------------------------------------------------------------------------------
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
