package pages.cambiodeventana;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step.cambiodeventanaStep.CambiodeVentanaStep;

import java.time.Duration;
import java.util.Set;


public class CambiodeVentanaPage {

    private WebDriverWait wait;
    private WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='Browser Windows']")
    private WebElement clickBrowserWindows;
    @FindBy(css = "button[id='tabButton']")
    private WebElement clickNewTab;
    @FindBy(xpath = "//h1[@id='sampleHeading' and normalize-space()='This is a sample page']")
    private WebElement pestañayventanaIdentificada;
    @FindBy(css = "button[id='windowButton']")
    private WebElement clickNewWindow;
    @FindBy(css = "button[id='messageWindowButton']")
    private WebElement clickNewWindowMessage;
    @FindBy(css = "img[src='https://ad.plus/adplus-advertising.svg']")
    private WebElement imagenEntradaTools;


    public CambiodeVentanaPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void clickAlertsFrame(){
       WebElement buttonAlertsFrame = driver.findElement(By.xpath("//div[@class='card-body']//h5[normalize-space()='Alerts, Frame & Windows']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",buttonAlertsFrame);
        buttonAlertsFrame.click();
    }
    public void clickBrowserWindow(){
        wait.until(ExpectedConditions.elementToBeClickable(clickBrowserWindows));
        clickBrowserWindows.click();
    }
    public void clickNewTab(){
        wait.until(ExpectedConditions.elementToBeClickable(clickNewTab));
        String currentTab = driver.getWindowHandle();
        System.out.println("El identificador de la pestaña actual es "+ currentTab); //Sale el identificador de la pestaña actual
        clickNewTab.click();
        Set<String> allTab = driver.getWindowHandles();
        System.out.println("Los identificadores de las pestañas son "+allTab);  //Tenía que salir ambos identificadores y salieron ambos
        for(String tab : allTab){
            if(!tab.equals(currentTab)){
                driver.switchTo().window(tab);
                break;
            }
        }
    }
    public void cambioPestañaExitoso(){
        wait.until(ExpectedConditions.visibilityOf(pestañayventanaIdentificada));
        assert pestañayventanaIdentificada.isDisplayed(): "El mensaje que queríamos observar no ha salido de forma exitosa";

    }

    public void clickNewWindows(){
        wait.until(ExpectedConditions.elementToBeClickable(clickNewWindow));
        clickNewWindow.click();
        String currentWindow = driver.getWindowHandle();
        System.out.println("El identificador de la ventana actual es "+currentWindow);
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Los identificadores de las ventanas son "+allWindows);
        for(String window : allWindows){
            if(!window.equals(currentWindow)){
                driver.switchTo().window(window);
                break;
            }
        }
    }
    public void cambioVentanaExitoso(){
        wait.until(ExpectedConditions.visibilityOf(pestañayventanaIdentificada));
        assert pestañayventanaIdentificada.isDisplayed(): "El mensaje que queríamos observar no ha salido de forma exitosa";
    }

    public void newWindowMessage(){
        String primerWindowMessage = driver.getWindowHandle();
        System.out.println("El identificador de la ventana actual es "+primerWindowMessage);
        wait.until(ExpectedConditions.elementToBeClickable(clickNewWindowMessage));
        clickNewWindowMessage.click();
        wait.until(driver -> driver.getWindowHandles().size() > 1);
        Set<String> allWindowMessage = driver.getWindowHandles();
        System.out.println("Los identificadores de las ventana actuales son "+allWindowMessage);
        for (String variableTemporal : allWindowMessage){
            if(!variableTemporal.equals(primerWindowMessage)){
                driver.switchTo().window(variableTemporal);
                break;
            }
        }
        String segundoWindowMessage = driver.getWindowHandle();
        Assert.assertNotEquals("No cambió la ventana",primerWindowMessage,segundoWindowMessage);
        driver.close();
        driver.switchTo().window(primerWindowMessage);

    }
    public void mensajeenNuevaVentanaExitoso() {
        wait.until(ExpectedConditions.visibilityOf(imagenEntradaTools));
        assert imagenEntradaTools.isDisplayed() : "No se mostró la imagen de la página.";
    }

}




