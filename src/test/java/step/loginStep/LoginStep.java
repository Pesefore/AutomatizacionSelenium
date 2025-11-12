package step.loginStep;
import org.openqa.selenium.WebDriver;
import hooks.Hooks;
import pages.login.LoginPage;


public class LoginStep {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginStep(){
        this.driver = Hooks.getDriver();
        this.loginPage = new LoginPage(driver);
    }

    public void abrirPagina() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    public void ingresaUsername(String username){
        loginPage.ingresaUsername(username);
    }

    public void ingresaPassword(String password){
        loginPage.ingresaPassword(password);
    }
    public void clickButton(){
        loginPage.clickButton();
    }
    public void ingresoExitoso(){
        loginPage.ingresoExitoso();
    }

}


