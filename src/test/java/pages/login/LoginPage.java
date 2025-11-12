package pages.login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //Localizadores
    @FindBy(name = "username")
    private WebElement inputUser;
    @FindBy(name = "password")
    private WebElement inputPassword;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement clickButton;
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    private WebElement textDashboard;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void ingresaUsername(String user){
        wait.until(ExpectedConditions.visibilityOf(inputUser));
        inputUser.sendKeys(user);
    }
    public void ingresaPassword(String pass){
        wait.until(ExpectedConditions.visibilityOf(inputPassword));
        inputPassword.sendKeys(pass);
    }
    public void clickButton(){
        wait.until(ExpectedConditions.elementToBeClickable(clickButton));
        clickButton.click();
    }
    public void ingresoExitoso(){
        wait.until(ExpectedConditions.visibilityOf(textDashboard));
    }

}
