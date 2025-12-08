package pages.demoqa;

import org.junit.platform.commons.function.Try;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import step.demoqaStep.DemoqaStep;

import java.time.Duration;

public class DemoqaPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //localizadores
    /*@FindBy(xpath = "//div[@class='card-body']//h5[normalize-space()='Forms']")
    private WebElement buttonForm;*/
    @FindBy(xpath = "//span[normalize-space()='Practice Form']")
    private WebElement buttonPracticeForm;
    @FindBy(css = "img[src='/images/Toolsqa.jpg']")
    private WebElement imagenExitoso;
    @FindBy(css = "input#firstName")
    private WebElement inputPrimerNombre;
    @FindBy(css = "input#lastName")
    private WebElement inputSegundoNombre;
    @FindBy(css = "#userEmail")
    private WebElement inputCorreoElectronico;
    /*@FindBy(xpath = "//input[@id='gender-radio-1']")
    private WebElement radioButtonMale;*/
    @FindBy(xpath = "//input[@id='userNumber']")
    private WebElement inputNumeroTelefono;
    @FindBy(css = "input[id='dateOfBirthInput']")
    private WebElement inputFechaNacimiento;
    @FindBy(id = "subjectsInput")
    private WebElement carreraProfesion;
    @FindBy(css = "label[for='hobbies-checkbox-3']")
    private WebElement checkBoxMusic;
    @FindBy(css = "#uploadPicture")
    private WebElement seleccionarFoto;
    @FindBy(xpath = "//div[contains(@class, col-md-9)]/textarea")
    private WebElement direccionActual;
    @FindBy(xpath = "//div[contains(@class,  css-2b097c-container) and @id='state']")
    private WebElement estadoResidente;
    @FindBy(xpath = "//div[contains(@class, css-14jk2my-container) and @id='city']")
    private WebElement ciudadResidente;
    @FindBy(css = "button[id='submit']")
    private WebElement buttonEnterSubmit;
    /*@FindBy(xpath = "//div[contains(@class,'modal-title h4') and @id='example-modal-sizes-title-lg']")
    private WebElement formExitoso;*/


    public DemoqaPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public void clickForms(){
        WebElement buttonForm = driver.findElement(By.xpath("//div[@class='card-body']//h5[normalize-space()='Forms']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buttonForm);
        buttonForm.click();
    /*Acá estamos utilizando WebElement para poder ubicar un elemento de la página web, pero también podríamos ubicarlos por
      FindBy y la diferencia radica que esta última manera de ubicar elementos de la página web no es eficiente, o no debe usarse
        para elementos dinámicos del DOM; por otro lado, el WebElement sí es eficiente en ese tipo de casos*/
    }
    public void clickPracticeForms(){
        wait.until(ExpectedConditions.visibilityOf(buttonPracticeForm));
        buttonPracticeForm.click();
    }
    public void ingresoExitoso(){
        wait.until(ExpectedConditions.visibilityOf(imagenExitoso));
        assert imagenExitoso.isDisplayed(): "No se mostró la imagen de la página.";

    }

    public void ingresaPrimerNombre(String primerNombre){
        wait.until(ExpectedConditions.visibilityOf(inputPrimerNombre));
        inputPrimerNombre.sendKeys(primerNombre);
    }
    public void ingresaSegundoNombre(String segundoNombre){
        wait.until(ExpectedConditions.visibilityOf(inputSegundoNombre));
        inputSegundoNombre.sendKeys(segundoNombre);
    }
    public void ingresaCorreoElectronico(String correoElectronico){
        wait.until(ExpectedConditions.visibilityOf(inputCorreoElectronico));
        inputCorreoElectronico.sendKeys(correoElectronico);
    }
    public void clickGenero(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement radioButtonMale = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='gender-radio-1']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",radioButtonMale);
        radioButtonMale.click();
    }
    public void ingresaNumeroTelefono(String numeroTelefono){
        wait.until(ExpectedConditions.visibilityOf(inputNumeroTelefono));
        inputNumeroTelefono.sendKeys(numeroTelefono);
    }
    public void ingresaFechaCumpleaños(){
        wait.until(ExpectedConditions.visibilityOf(inputFechaNacimiento));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputFechaNacimiento);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",inputFechaNacimiento);
        WebElement monthSelect = driver.findElement(By.cssSelector("select.react-datepicker__month-select"));
        Select selectMes = new Select(monthSelect);
        selectMes.selectByVisibleText("December");
        WebElement yearSelect = driver.findElement(By.cssSelector("select.react-datepicker__year-select"));
        Select selectAño = new Select(yearSelect);
        selectAño.selectByVisibleText("1956");
        WebElement dayCalendary = driver.findElement(By.xpath("//div[@aria-label='Choose Friday, December 7th, 1956']"));
        dayCalendary.click();
    }
    public void ingresaProfesion(String profesion){
        wait.until(ExpectedConditions.visibilityOf(carreraProfesion));
        carreraProfesion.sendKeys(profesion);
        carreraProfesion.sendKeys(Keys.ENTER);
    }
    public void clickPasatiempo(){
        wait.until(ExpectedConditions.visibilityOf(checkBoxMusic));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();",checkBoxMusic);
    }
    public void ingresaFotoPersonalUsuario(String foto){
        wait.until(ExpectedConditions.visibilityOf(seleccionarFoto));
        seleccionarFoto.sendKeys(foto);
    }
    public void ingresaDireccionCasa(String direccion){
        wait.until(ExpectedConditions.visibilityOf(direccionActual));
        direccionActual.sendKeys(direccion);
    }
    public void clickEstado(){
        wait.until(ExpectedConditions.elementToBeClickable(estadoResidente));
        estadoResidente.click();
        try{ Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException("El tiempo de espera fue interrumpido.");
        }
        WebElement estadoDinamico = driver.findElement(By.xpath("//div[contains(@class,'option') and text()='NCR']"));
        wait.until(ExpectedConditions.visibilityOf(estadoDinamico));
        estadoDinamico.click();
    }

    public void clickCiudad(){
        wait.until(ExpectedConditions.visibilityOf(ciudadResidente));
        ciudadResidente.click();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException("El tiempo de espera fue interrumpido.");
        }
        WebElement ciudadDinamica = driver.findElement(By.xpath("//div[contains(@class,'option') and text()='Delhi']"));
        ciudadDinamica.click();

    }
    public void clickSubmitDemoQA(){
        wait.until(ExpectedConditions.visibilityOf(buttonEnterSubmit));
        System.out.println("Intentando hacer click en sumbit...");
        buttonEnterSubmit.click();
        System.out.println("Click realizado");
    }

    public void formularioExitoso(){
        // WebElement formExitoso = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='example-modal-sizes-title-lg']")));
        try{
            Thread.sleep(1500);
            WebElement formExitoso = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='example-modal-sizes-title-lg']")));
            assert formExitoso.isDisplayed() : "Thanks for submitting the form";
        }catch(InterruptedException e){
            throw new RuntimeException("El tiempo de espera fue interrumpido.");
        }
    }


}
