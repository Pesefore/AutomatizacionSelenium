package pages.sauceDemo;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import step.sauceDemoStep.SauceDemoStep;

import java.time.Duration;

public class SauceDemoPage {

    private WebDriver driver;
    private Wait<WebDriver> fluenWait;
    private WebDriverWait wait;

        public SauceDemoPage(WebDriver driver){
            this.driver = driver;
            this.fluenWait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(15))
                    .pollingEvery(Duration.ofMillis(1000))
                    .ignoring(NoSuchElementException.class)
                    .ignoring(StaleElementReferenceException.class);
            PageFactory.initElements(driver,this);
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

    @FindBy(css = "input[id='user-name']")
    private WebElement inputUsername;
    @FindBy(css = "input#password")
    private WebElement inputPassword;
    @FindBy(css = "input[type='submit']")
    private WebElement buttonLogin;
    @FindBy(xpath = "//span[normalize-space()='Products']")
    private WebElement textoProducts;
    @FindBy(css = "button[id='add-to-cart-sauce-labs-backpack']")
    private WebElement buttonBackPack;
    @FindBy(css = "button[id='add-to-cart-sauce-labs-bike-light']")
    private WebElement buttonBijeLight;
    @FindBy(css = "button[id='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement buttonBoltTshirt;
    @FindBy(css = "button[id='add-to-cart-sauce-labs-fleece-jacket']")
    private WebElement buttonFleeceJacket;
    @FindBy(css = "button#add-to-cart-sauce-labs-onesie")
    private WebElement buttonLabsOnesie;
    @FindBy(css = "button[id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement buttonRedTshirt;
    @FindBy(css = "a[data-test='shopping-cart-link']")
    private WebElement clickCarritoCompras;
    @FindBy(xpath = "//span[text()='Your Cart']")
    private WebElement textoYourCart;
    @FindBy(css = "button[id='checkout']")
    private WebElement buttonCheckOut;
    @FindBy(xpath = "//span[text()='Checkout: Your Information']")
    private WebElement textoYourInformation;
    @FindBy(css = "input#first-name")
    private WebElement inputFirsName;
    @FindBy(css = "input[placeholder='Last Name']")
    private WebElement inputLastName;
    @FindBy(css = "input[placeholder='Zip/Postal Code']")
    private WebElement inputPostalCode;
    @FindBy(css = "input[name='continue']")
    private WebElement buttonContinue;
    @FindBy(xpath = "//span[normalize-space()='Checkout: Overview']")
    private WebElement textoCheckoutOverview;
    @FindBy(css = "button[id='finish']")
    private WebElement buttonFinish;
    @FindBy(css = "[data-test='complete-header']")
    private WebElement compraExitosa;

    public void ingresoUsername(String user){
        fluenWait.until(ExpectedConditions.visibilityOf(inputUsername));
        inputUsername.sendKeys(user);
    }
    public void ingresoPassword(String pass){
        wait.until(ExpectedConditions.visibilityOf(inputPassword));
        inputPassword.sendKeys(pass);
    }

    public void clickBotonLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonLogin));
        buttonLogin.click();
    }

    public void ingresoExitoModuloCompras(){
        wait.until(ExpectedConditions.visibilityOf(textoProducts));
        assert textoProducts.isDisplayed(): "No se redireccionó correctamente al módulo de compras";
    }
    public void clickArticuloKacbpack(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonBackPack));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",buttonBackPack);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",buttonBackPack);
    }
    public void clickArticuloBikeLight(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonBijeLight));
        buttonBijeLight.click();
    }
    public void clickAritculoBoltTshirt(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonBoltTshirt));
        buttonBoltTshirt.click();
    }
    public void clickArticuloFleeceJacket(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonFleeceJacket));
        buttonFleeceJacket.click();
    }
    public void clickArticuloLabsOnesie(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonLabsOnesie));
        buttonLabsOnesie.click();
    }
    public void clickArticuloRedTshirt(){
        try {
            wait.until(ExpectedConditions.elementToBeClickable(buttonRedTshirt));
            Actions actions = new Actions(driver);
            actions.moveToElement(buttonRedTshirt).perform();
            Thread.sleep(1000);
            buttonRedTshirt.click();
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);

        }
    }
    public void clickCarritoCompras(){
        wait.until(ExpectedConditions.elementToBeClickable(clickCarritoCompras));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",clickCarritoCompras);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",clickCarritoCompras);
    }
    public void vistaExitosaArticulosSeleccionados(){
        wait.until(ExpectedConditions.visibilityOf(textoYourCart));
        assert textoYourCart.isDisplayed(): "No se redireccionó correctamente al perfil de tu carrito de compras";

    }
    public void clickBottonCheckout(){
        wait.until(ExpectedConditions.visibilityOf(buttonCheckOut));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",buttonCheckOut);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",buttonCheckOut);

    }
    public void vistaExitosaHaciaDatosPersonales(){
        wait.until(ExpectedConditions.visibilityOf(textoYourInformation));
        assert textoYourInformation.isDisplayed(): "No se redireccionó correctamente a la validación de datos personales";
    }

    public void ingresoFirstName(String primerNombre){
        wait.until(ExpectedConditions.visibilityOf(inputFirsName));
        inputFirsName.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        inputFirsName.sendKeys(Keys.chord(Keys.DELETE));
        inputFirsName.sendKeys(primerNombre);


    }
    public void ingresoLastName(String lastName){
        wait.until(ExpectedConditions.visibilityOf(inputLastName));
        inputLastName.sendKeys(lastName);
    }
    public void ingresoPostCode(String codigoPostal){
        wait.until(ExpectedConditions.visibilityOf(inputPostalCode));
        inputPostalCode.sendKeys(codigoPostal);
    }
    public void clickButtonContinue(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonContinue));
        buttonContinue.click();
    }
    public void detalleExitosoPedidoYTotalPagar(){
        wait.until(ExpectedConditions.visibilityOf(textoCheckoutOverview));
        assert textoCheckoutOverview.isDisplayed(): "No se redireccionó correctamente a la validación de artículos comprados y pago total";
    }
    public void clickButtonFinish(){
        fluenWait.until(driver -> buttonFinish.isDisplayed());
        buttonFinish.click();
    }
    public void compraExitosaArticulos(){
        wait.until(ExpectedConditions.visibilityOf(compraExitosa));
        assert compraExitosa.isDisplayed(): "No se hiz la compra de forma exitosa";
    }


}
