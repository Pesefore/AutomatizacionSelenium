package pages.moduloPIM;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.nio.channels.WritableByteChannel;
import java.time.Duration;

public class ModuloPimPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(css = "a[href='/web/index.php/pim/viewPimModule']")
    private WebElement buttonPIM;
    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement buttonAdd;
    @FindBy(css = "input[name='firstName']")
    private WebElement inputName;
    @FindBy(css = "input[name='middleName']")
    private WebElement inputMiddleName;
    @FindBy(css = "input[name='lastName']")
    private WebElement inputLastName;
    @FindBy(xpath = "//label[normalize-space()='Employee Id']/ancestor::div[contains(@class,'oxd-input-group')]//input")
    private WebElement inputID;
    /*@FindBy(css = "div.oxd-switch-wrapper input[type='checkbox']")
    private WebElement checkBox; */
    @FindBy(xpath = "//label[normalize-space()='Username']/ancestor::div[contains(@class,'oxd-input-field')]//input")
    private WebElement inputUsername;
    @FindBy(xpath = "//label[normalize-space()='Password']/ancestor::div[contains(@class,'oxd-input-group')]//input")
    private WebElement inputPassword;
    @FindBy(xpath = "//label[normalize-space()='Confirm Password']/ancestor::div[contains(@class,'oxd-input-group')]//input")
    private WebElement inputConfirmPassword;
    /*@FindBy(css = "input[type='file'].oxd-file-input")
    private WebElement buttonPhoto; */
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement botonSave;
    @FindBy(xpath = "//p[contains(@class,'oxd-text--toast-message')]")
    private WebElement messageSuccesfully;


    public ModuloPimPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void moduloPIM(){
        wait.until(ExpectedConditions.visibilityOf(buttonPIM));
        buttonPIM.click();
    }
    public void buttonAdd(){
        wait.until(ExpectedConditions.visibilityOf(buttonAdd));
        buttonAdd.click();
    }
    public void ingresaFirstName(String firstName){
        wait.until(ExpectedConditions.visibilityOf(inputName));
        inputName.sendKeys(firstName);
    }
    public void ingresaMiddleName(String middleName){
        wait.until(ExpectedConditions.visibilityOf(inputMiddleName));
        inputMiddleName.sendKeys(middleName);
    }
    public void ingresaLastName(String lastName){
        wait.until(ExpectedConditions.visibilityOf(inputLastName));
        inputLastName.sendKeys(lastName);
    }
    public void ingresaID(String ID){
        wait.until(ExpectedConditions.visibilityOf(inputID)); // Espera a que el input esté visible
        inputID.click();  // Hacer click para enfocar
        inputID.sendKeys(Keys.chord(Keys.CONTROL, "a")); // Selecciona todo el texto actual
        inputID.sendKeys(Keys.DELETE);                    // Borra el texto seleccionado
        inputID.sendKeys(ID);                             // Ingresa el nuevo ID
    }
    public void buttonCreateLoginDetails(){
         // Esperar que el checkbox esté presente en el DOM
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.oxd-switch-wrapper input[type='checkbox']")));
        // Forzar click vía JS
        WebElement checkBox = driver.findElement(By.cssSelector("div.oxd-switch-wrapper input[type='checkbox']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkBox);

    }
    public void ingresaUsername(String username){
        wait.until(ExpectedConditions.visibilityOf(inputUsername));
        inputUsername.sendKeys(username);
    }
    public void ingresaPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(inputPassword));
        inputPassword.sendKeys(password);
    }
    public void ingresaConfirmPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(inputConfirmPassword));
        inputConfirmPassword.sendKeys(password);
    }
    public void ingresaFotoPerfil(String rutaFoto){
        // Esperar que el input file esté presente en el DOM
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file'].oxd-file-input")));
        // Buscar el input file y enviar la ruta
        WebElement inputFoto = driver.findElement(By.cssSelector("input[type='file'].oxd-file-input"));
        inputFoto.sendKeys(rutaFoto);
    }
    public void botonSave(){
        wait.until(ExpectedConditions.elementToBeClickable(botonSave));
        botonSave.click();
    }
    public void employeeExitoso() {
        wait.until(ExpectedConditions.visibilityOf(messageSuccesfully));
        assert messageSuccesfully.isDisplayed(): "El mensaje de exito no se mostro correctamente.";

}

}