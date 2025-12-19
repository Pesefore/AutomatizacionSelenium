package step.ecomerceStep;

import hooks.Hooks;
import org.openqa.selenium.WebDriver;
import pages.ecomerce.EcomerceE2EPage;
import webdrivermanager.WebDriverManager;

public class EcomerceStep {

    private WebDriver driver;
    private EcomerceE2EPage ecomerceE2EPage;

    public EcomerceStep(){
        this.driver = WebDriverManager.getDriver();
        this.ecomerceE2EPage = new EcomerceE2EPage(driver);
    }

    public void ingresaPlataforma(){
        driver.get("https://nuevo.centyc.cl/practica/");
    }
    public void clickTiendraPruebas(){
        ecomerceE2EPage.clickTiendraPruebas();
    }
    public void clickTiendaPruebasCentyc(){
        ecomerceE2EPage.clickTiendaPruebasCentyc();
    }
    public void pestañaNuevaExitosa(){
        ecomerceE2EPage.pestañaNuevaExitosa();
    }
    public void mascaraBuenaOnda(){
        ecomerceE2EPage.mascaraBuenaOnda();
    }
    public void clickCuatroUnidadesAlCarrito(){
        ecomerceE2EPage.clickCuatroUnidadesAlCarrito();
    }
    public void clickAgregarAlCarrito(){
        ecomerceE2EPage.clickAgregarAlCarrito();
    }
    public void clickFinalizarCompra(){
        ecomerceE2EPage.clickFinalizarCompra();
    }
    public void nuevaPestañaDetallesDeUsuario(){
        ecomerceE2EPage.nuevaPestañaDetallesDeUsuario();
    }
    public void ingresoCorreoElectronico(String correoElectronico){
        ecomerceE2EPage.ingresoCorreoElectronico(correoElectronico);
    }
    public void ingresoNombreCompleto(String nombreCompleto){
        ecomerceE2EPage.ingresoNombreCompleto(nombreCompleto);
    }
    public void ingresaApellidoCompleto(String apellidoCompleto){
        ecomerceE2EPage.ingresaApellidoCompleto(apellidoCompleto);
    }
    public void ingresaPaisDeEnvio(){
        ecomerceE2EPage.ingresaPaisDeEnvio();
    }
    public void ingresaCiudadDeEnvio(String ciudad){
        ecomerceE2EPage.ingresaCiudadDeEnvio(ciudad);
    }
    public void ingresaDireccionCompleta(String direccionCompleta){
        ecomerceE2EPage.ingresaDireccionCompleta(direccionCompleta);
    }
    public void ingresaNumeroTelefono(String numeroTelefono){
        ecomerceE2EPage.ingresaNumeroTelefono(numeroTelefono);
    }
    public void ingresaNotasDelPedido(String notaAdicional){
        ecomerceE2EPage.ingresaNotasDelPedido(notaAdicional);
    }
    public void clickRealizarPedido(){
        ecomerceE2EPage.clickRealizarPedido();
    }
    public void pedidoCompletadoExitosamente(){
        ecomerceE2EPage.pedidoCompletadoExitosamente();
    }


}
