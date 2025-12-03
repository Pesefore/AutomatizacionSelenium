package pages.recruitment;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RecruitmentPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(css = "a[href='/web/index.php/recruitment/viewRecruitmentModule']")
    private WebElement buttonRecruitment;
    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement buttonAddRecruitment;
    @FindBy(name = "firstName")
    private WebElement inputFirstNameRecruitment;
    @FindBy(name = "middleName")
    private WebElement inputMiddleName;
    @FindBy(name = "lastName")
    private WebElement inputLastName;
    @FindBy(css = ".oxd-select-wrapper .oxd-select-text")
    private WebElement dropdownVacancy;
    // Acá solo vamos a localizar de forma estática el dropdown y de forma dinámica una de sus opciones (lo veremos más abajo)
    @FindBy(xpath = "//label[normalize-space()='Email']/following::input[1]")
    private WebElement inputEmailRecruitment;
    @FindBy(xpath = "//label[normalize-space()='Contact Number']/following::input[1]")
    private WebElement inputContactRecruitment;
    //Con respecto a la localización del elemento web que nos permite subir un archivo, se utilizará una estrategia dinámica
    @FindBy(xpath = "//label[normalize-space()='Keywords']/following::input[1]")
    private WebElement inputKeywordsRecruitment;
    @FindBy(xpath = "//label[normalize-space()='Date of Application']/following::input[1]")
    private WebElement dateOfApplication;
    //label[normalize-space()='Date of Application']/following::input[1]
    //label[normalize-space()='Date of Application']/following::input[@placeholder='yyyy-mm-dd'] -> No escogí este, ya que el mm-dd es variable y no se mantiene estable
    @FindBy(xpath = "//label[normalize-space()='Notes']/following::textarea[@placeholder='Type here']")
    private WebElement inputNotesRecruitment;
    /*@FindBy(css = "div.oxd-checkbox-wrapper input[type='checkbox']")
    private WebElement checkBoxConsenttoKeep; */
    // Es imposible localizarlo de forma estática
    @FindBy(css = "button.oxd-button--secondary.orangehrm-left-space")
    private WebElement buttonSaveRecruitment;
    //button[type='submit'].oxd-button--secondary  <- Otra manera de poder ubicarlo en css
    @FindBy(xpath = "//p[contains(@class,'oxd-text--toast-message')]")
    private WebElement messageSuccesfullyRecruitment;

    public RecruitmentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }


    public void moduloRecruitment(){
        wait.until(ExpectedConditions.visibilityOf(buttonRecruitment));
        buttonRecruitment.click();
    }
    public void buttonAddRecruitment(){
        wait.until(ExpectedConditions.visibilityOf(buttonAddRecruitment));
        buttonAddRecruitment.click();
    }
    public void ingresaFistNameRecruitment(String firstName){
        wait.until(ExpectedConditions.visibilityOf(inputFirstNameRecruitment));
        inputFirstNameRecruitment.clear();
        inputFirstNameRecruitment.sendKeys(firstName);
    }
    public void ingresaMiddleNameRecruitment(String middleName){
        wait.until(ExpectedConditions.visibilityOf(inputMiddleName));
        inputMiddleName.clear();
        inputMiddleName.sendKeys(middleName);
    }
    public void ingresaLastNameRecruitment(String lastName){
        wait.until(ExpectedConditions.visibilityOf(inputLastName));
        inputLastName.clear();
        inputLastName.sendKeys(lastName);
    }
    public void dropdownVacancy(){
        dropdownVacancy.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement deploymentElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Senior QA Lead']")));
        deploymentElement.click();
    }
    public void ingresaEmailRecruitment(String email){
        wait.until(ExpectedConditions.visibilityOf(inputEmailRecruitment));
        inputEmailRecruitment.clear();
        inputEmailRecruitment.sendKeys(email);
    }
    public void ingresaContactNumber(String phoneNumber){
        wait.until(ExpectedConditions.visibilityOf(inputContactRecruitment));
        inputContactRecruitment.clear();
        inputContactRecruitment.sendKeys(phoneNumber);
    }
    public void ingresaResumenRecruitment(String resumenRecruitment){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file'].oxd-file-input")));
        WebElement inputFile = driver.findElement(By.cssSelector("input[type='file'].oxd-file-input"));
        inputFile.sendKeys(resumenRecruitment);
    }
    public void ingresaKeywords(String keywords){
        wait.until(ExpectedConditions.visibilityOf(inputKeywordsRecruitment));
        inputKeywordsRecruitment.clear();
        inputKeywordsRecruitment.sendKeys(keywords);
    }
    public void ingresaDateofAplication(){
        wait.until(ExpectedConditions.visibilityOf(dateOfApplication));
        dateOfApplication.click();
        dateOfApplication.sendKeys(Keys.chord(Keys.CONTROL, "a")); //Selecciona el texto actual
        dateOfApplication.sendKeys(Keys.DELETE);
        dateOfApplication.sendKeys("2000-10-09");
    }
    public void ingresaNoteRecruitment(String noteRecruitment){
        wait.until(ExpectedConditions.visibilityOf(inputNotesRecruitment));
        inputNotesRecruitment.clear();
        inputNotesRecruitment.sendKeys(noteRecruitment);
    }
    public void bottonConsentKeepData(){
        // Esperar que el checkbox esté presente en el DOM
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.oxd-checkbox-wrapper input[type='checkbox']")));
        // Forzar click vía JS
        WebElement checkBox = driver.findElement(By.cssSelector("div.oxd-checkbox-wrapper input[type='checkbox']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkBox);
    }
    public void bottonSaveNewCandidate(){
        wait.until(ExpectedConditions.visibilityOf(buttonSaveRecruitment));
        buttonSaveRecruitment.click();
    }
    public void candidateExitoso(){

        try {
            //Espera estática de 2s
            Thread.sleep(2000);

            if(messageSuccesfullyRecruitment.isDisplayed()){
                System.out.println("El mensaje de éxito se mostró correctamente");
            }
            else {
                System.out.println("El mensaje de éxito NO mostró correctamente");
            }
        } catch (InterruptedException e){
            //Manejo de la expeción en caso de que el Thread.sleep sea interrumpido
            e.printStackTrace();
            System.out.println("La espera fue interrumpida.");
        } catch (Exception e) {
            //Manejo de cualquiera otra expceción
            e.printStackTrace();
            System.out.println("Ocurrió un error al verificar el mensaje de éxito.");
        }
    }

    //El try-catch captura la interrupción del sleep y cualquier otro error que pueda ocurrir al verificar si el elemento está visible.
    /* Recordar que esto es menos eficiente que la espera explícita porque siempre espera el tiempo completo aunque
    el elemento aparezca antes, pero sirve para casos simples o cuando quieres simplicidad. */



}
