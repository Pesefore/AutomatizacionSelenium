package pages.jobTitle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JobTitlePage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement buttonAdmin;
    @FindBy(xpath = "//span[normalize-space()='Job']")
    private WebElement buttonJob;
    @FindBy(xpath = "//a[normalize-space()='Job Titles']")
    private WebElement buttonJobTitles;
    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement buttonAdd;
    @FindBy(xpath = "//label[normalize-space()='Job Title']/following::input[1]")
    private WebElement inputJobTitle;
    @FindBy(xpath = "//label[normalize-space()='Job Description']/following::textarea[1]")
    private WebElement txtTareaDescription;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonSave;
    @FindBy(xpath = "//p[contains(@class,'oxd-text--toast-message')]")
    private WebElement messageExito;
    @FindBy(xpath = "//label[normalize-space()='Note']/following::textarea[1]")
    private WebElement txtNote;



    public JobTitlePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void seleccionaAdmin() {
        wait.until(ExpectedConditions.visibilityOf(buttonAdmin));
        buttonAdmin.click();
    }

    public void seleccionaButtonJob() {
        wait.until(ExpectedConditions.visibilityOf(buttonJob));
        buttonJob.click();
    }

    public void seleccionaJobTitles() {
        wait.until(ExpectedConditions.visibilityOf(buttonJobTitles));
        buttonJobTitles.click();
    }

    public void seleccionaButtonAdd(){
        wait.until(ExpectedConditions.visibilityOf(buttonAdd));
        buttonAdd.click();
    }
    public void ingresaJobTitle(String title){
        wait.until(ExpectedConditions.visibilityOf(inputJobTitle));
        inputJobTitle.sendKeys(title);
    }
    public void ingresaDescription(String description){
        wait.until(ExpectedConditions.visibilityOf(txtTareaDescription));
        txtTareaDescription.sendKeys(description);
    }
    public void ingresaNote(String note){
        wait.until(ExpectedConditions.visibilityOf(txtNote));
        txtNote.sendKeys(note);
    }
    public void seleccionaButtonSave(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonSave));
        buttonSave.click();
    }
    public void titleExitoso() {
        wait.until(ExpectedConditions.visibilityOf(messageExito));
        assert messageExito.isDisplayed(): "El mensaje de exito no se mostro correctamente.";

    }



}
