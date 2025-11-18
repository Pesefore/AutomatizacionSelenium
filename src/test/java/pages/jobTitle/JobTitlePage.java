package pages.jobTitle;

import org.openqa.selenium.*;
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
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    private WebElement buttonYesDelete;
    @FindBy(xpath = "//p[contains(@class,'oxd-text--toast-message')]")
    private WebElement toastMessage;

    //   //p[contains(@class,'oxd-text--toast-message')]
    //   //div[contains(@class,'oxd-table-row')][.//div[normalize-space()='QA Lead']]//i[contains(@class,'bi-trash')]/ancestor::button    <- localizador dinámico del job title generado



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
        try{
            if(buttonJobTitles.isDisplayed()){
                Thread.sleep(2000);//Vamos a dormir al sistema para que se observe que el usuario va a clikear el Job Titles
                buttonJobTitles.click();
            }
        }catch (NoSuchElementException e){
            throw new RuntimeException("No se encontró el elemento para interactuar.");
        }
        catch (InterruptedException e){
            throw new RuntimeException("El tiempo de espera fue interrumpido.");
        }
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
    // -----------------------------------------------------------------------------------------------------------------
    //Localizador dinámico (devuelve WebElement listo para usar)
    /*Este localizador se almacenará en la variable "xpath", en el que reconocerá que será del tipo String; por lo que, una vez
    que se localiza según la condición de que sea cickleable va a retornarse en una variable "title" del tipo String. Luego, se le
    mandará una acción en el método "public void buttonDelete".
     */
    public WebElement getDeleteButton(String title){
        String xpath = "//div[contains(@class,'oxd-table-row')]" + "[.//div[normalize-space()='" + title + "']]" + "//i[contains(@class,'bi-trash')]/ancestor::button";
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }

    public void buttonDelete(String title){
        try {
            getDeleteButton(title).click();
        } catch (TimeoutException e) {
            throw new RuntimeException("No se encontró el botón Delete para el título: " + title);
        }
    }
    public void buttonYesDelete(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonYesDelete));
        buttonYesDelete.click();
    }

    public void titleDelete(){
        wait.until(ExpectedConditions.visibilityOf(toastMessage));
        assert toastMessage.isDisplayed() : "No se mostró el mensaje de eliminación.";
    }

}
