package step.sauceDemoStep;

import hooks.Hooks;
import org.openqa.selenium.WebDriver;
import pages.sauceDemo.SauceDemoPage;
import webdrivermanager.WebDriverManager;

public class SauceDemoStep {

    private WebDriver driver;
    private SauceDemoPage sauceDemoPage;

    public SauceDemoStep(){
        this.driver = WebDriverManager.getDriver();
        this.sauceDemoPage = new SauceDemoPage(driver);
    }
    public void ingresoExitosoPaginaLogin(){
        driver.get("https://www.saucedemo.com/");
    }
    public void ingresoUsername(String user){
        sauceDemoPage.ingresoUsername(user);
    }
    public void ingresoPassword(String pass){
        sauceDemoPage.ingresoPassword(pass);
    }
    public void clickBotonLogin(){
        sauceDemoPage.clickBotonLogin();
    }
    public void ingresoExitoModuloCompras(){
        sauceDemoPage.ingresoExitoModuloCompras();
    }
    public void clickArticuloKacbpack(){
        sauceDemoPage.clickArticuloKacbpack();
    }
    public void clickArticuloBikeLight(){
        sauceDemoPage.clickArticuloBikeLight();
    }
    public void clickAritculoBoltTshirt(){
        sauceDemoPage.clickAritculoBoltTshirt();
    }
    public void clickArticuloFleeceJacket(){
        sauceDemoPage.clickArticuloFleeceJacket();
    }
    public void clickArticuloLabsOnesie(){
       sauceDemoPage.clickArticuloLabsOnesie();
    }
    public void clickArticuloRedTshirt(){
        sauceDemoPage.clickArticuloRedTshirt();
    }
    public void clickCarritoCompras(){
        sauceDemoPage.clickCarritoCompras();
    }
    public void vistaExitosaArticulosSeleccionados(){
        sauceDemoPage.vistaExitosaArticulosSeleccionados();
    }
    public void clickBottonCheckout(){
        sauceDemoPage.clickBottonCheckout();
    }
    public void vistaExitosaHaciaDatosPersonales(){
        sauceDemoPage.vistaExitosaHaciaDatosPersonales();
    }
    public void ingresoFirstName(String primerNombre){
       sauceDemoPage.ingresoFirstName(primerNombre);
    }
    public void ingresoLastName(String lastName){
        sauceDemoPage.ingresoLastName(lastName);
    }
    public void ingresoPostCode(String codigoPostal){
        sauceDemoPage.ingresoPostCode(codigoPostal);
    }
    public void clickButtonContinue(){
        sauceDemoPage.clickButtonContinue();
    }
    public void detalleExitosoPedidoYTotalPagar(){
        sauceDemoPage.detalleExitosoPedidoYTotalPagar();
    }
    public void clickButtonFinish(){
        sauceDemoPage.clickButtonFinish();
    }
    public void compraExitosaArticulos(){
        sauceDemoPage.compraExitosaArticulos();
    }

}
