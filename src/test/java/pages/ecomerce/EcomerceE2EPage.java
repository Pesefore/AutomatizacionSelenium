package pages.ecomerce;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class EcomerceE2EPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(css = "a[href='#tab_tienda-para-pruebas']")
    private WebElement buttonTiendaParaPruebas;
    @FindBy(css = "a[href='https://tiendaqa.centyc.cl']")
    private WebElement buttonIrTiendaPruebasCentyc;
    @FindBy(xpath = "//p[normalize-space()='Mostrando el único resultado']")
    private WebElement textoDeConfirmacion;
    @FindBy(xpath = "//p[@class='name product-title']/a[normalize-space()='Mascara Buena Onda']")
    private WebElement articuloMascaraBuenaOnda;
    @FindBy(css = "input[value='+'] ")
    private WebElement buttonAñadirMasProductos;
    @FindBy(css = "button[name='add-to-cart']")
    private WebElement buttonAgregarAlCarrito;
    /* Elemento dinámico para el método clickFinalizarCompra
    -> //a[@href='https://tiendaqa.centyc.cl/checkout/' and normalize-space()='Finalizar compra']*/
    @FindBy(xpath = "//h3[normalize-space()='Detalles de facturación']")
    private WebElement textoDetalleFacturacion;
    @FindBy(css = "input[id='billing_email']")
    private WebElement inputEmail;
    @FindBy(css = "input[id='billing_first_name']")
    private WebElement inputName;
    @FindBy(css = "input[id='billing_last_name']")
    private WebElement inputLastName;
    /* Elemento dinámico para el método ingresaPaisDeEnvio
     WebElement paisEnvioSelect = driver.findElement(By.cssSelector("select#billing_country"));
     Select selectPais = new Select(paisEnvioSelect);
     selectMes.selectByVisibleText("Perú");
    */
    @FindBy(css = "input[id='billing_city']")
    private WebElement inputCity;
    @FindBy(css = "input#billing_address_1")
    private WebElement inputDireccion;
    @FindBy(css = "input#billing_phone")
    private WebElement inputCellPhone;
    @FindBy(css = "textarea#order_comments")
    private WebElement inputNotas;
    @FindBy(css = "button#place_order")
    private WebElement inputRealizarPedido;
    @FindBy(xpath = "//strong[normalize-space()='Gracias. Tu pedido ha sido recibido.']")
    private WebElement mensajeExito;

    /* Cosas que se debe repasar para poder entender mejor lo que se está haciendo:
    1. private: Define la visibilidad; es decir, significa que solo puede usar dentro de la misma clase
    Un ejemplo de ello sería lo siguiente -> private int contador;
    Nadie fuera de esa clase puede acceder directamente a contador (útil para la encapsulación, que es una
    buena práctica en POO).
    2. static: es una característica que pertenece a la clase y que lo comparte todos los instanciamientos de la clase
    o, que es lo mismo decir, los objetos que se crean a partir de esa clase.
    ¿Qué significa esto?
    - No tienes que crear un objeto para usarlo
    - Solo existe una copia para toda la clase
    Un ejemplo de ello sería lo siguiente -> static int cantididadDeUsuarios = 0;
    Todas las instancias compartirían este valor
    Si una instancia lo modifica, entonces cambia para todas.
    3. final: Hace que la variable no pueda cambiar su valor, osease, se vuelve constante.
    Es decir, una vez asignada, entonces ya no se puede modificar.
    Es usada en repetidas ocasiones para valores fijos.
    Un ejemplo de ello sería lo siguiente -> final int edadMaxima = 99;
    ¡NO SE PUEDE CAMBIAR LA EDAD MÁXIMA!
    Y si están los tres juntos, entonces ¿qué significaría?
    Por ejemplo: private final static int TIMEOUT = 10;
    private -> Solo la clase puede acceder a TIMEOUT.
    static -> Hay una sola copia compartida para toda la clase y no necesitas hacer new para usarla.
    final -> El valor no puede modificarse nunca, ya que es una constante.
    */

    public EcomerceE2EPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }
    public void clickTiendraPruebas(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonTiendaParaPruebas));
        buttonTiendaParaPruebas.click();
    }

    public void clickTiendaPruebasCentyc(){
        String currentWindow = driver.getWindowHandle();
        System.out.println("El identificador de la pestaña actual es "+currentWindow);
        wait.until(ExpectedConditions.elementToBeClickable(buttonIrTiendaPruebasCentyc));
        buttonIrTiendaPruebasCentyc.click();
        //Esperar hasta que otra ventana o pestaña esté abierta
        wait.until(driver -> driver.getWindowHandles().size() > 1);
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Los identificadores de las pestañas encontradas son "+allWindows);
        for(String variableTemporal : allWindows){
            if(!variableTemporal.equals(currentWindow)){
                driver.switchTo().window(variableTemporal);
                System.out.println("Cambio a la nueva pestaña "+variableTemporal);
                break;
            }
        }
    }
    public void pestañaNuevaExitosa(){
        wait.until(ExpectedConditions.visibilityOf(textoDeConfirmacion));
        assert textoDeConfirmacion.isDisplayed(): "El cambió de pestaña no resultó y no se encontró el texto solicitado.";
    }
    public void mascaraBuenaOnda(){
        wait.until(ExpectedConditions.elementToBeClickable(articuloMascaraBuenaOnda));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",articuloMascaraBuenaOnda);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",articuloMascaraBuenaOnda);
    }
    public void clickCuatroUnidadesAlCarrito(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonAñadirMasProductos));
        try {
            for(int i=0; i<4; i++){
                Thread.sleep(500);
                buttonAñadirMasProductos.click();
            }
        } catch (InterruptedException e){
            throw new RuntimeException("Error al esperar clicks ",e);
        }
    }
    public void clickAgregarAlCarrito(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonAgregarAlCarrito));
        buttonAgregarAlCarrito.click();
    }
    public void clickFinalizarCompra(){

        WebElement finalizarCompra = driver.findElement(By.xpath("//a[@href='https://tiendaqa.centyc.cl/checkout/' and normalize-space()='Finalizar compra']"));
        wait.until(ExpectedConditions.elementToBeClickable(finalizarCompra));
        finalizarCompra.click();
    }

    public void nuevaPestañaDetallesDeUsuario(){
        wait.until(ExpectedConditions.visibilityOf(textoDetalleFacturacion));
        assert textoDetalleFacturacion.isDisplayed(): "El cambió de página no resultó y no se encontró el texto solicitado.";
    }
    public void ingresoCorreoElectronico(String correoElectronico){
        wait.until(ExpectedConditions.visibilityOf(inputEmail));
        inputEmail.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        inputEmail.sendKeys(Keys.chord((Keys.DELETE)));
        inputEmail.sendKeys(correoElectronico);
    }
    public void ingresoNombreCompleto(String nombreCompleto){
        wait.until(ExpectedConditions.visibilityOf(inputName));
        inputName.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        inputName.sendKeys(Keys.chord(Keys.DELETE));
        inputName.sendKeys(nombreCompleto);
    }
    public void ingresaApellidoCompleto(String apellidoCompleto){
        wait.until(ExpectedConditions.visibilityOf(inputLastName));
        inputLastName.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        inputLastName.sendKeys(Keys.chord(Keys.DELETE));
        inputLastName.sendKeys(apellidoCompleto);
    }
    public void ingresaPaisDeEnvio(){
        WebElement paisEnvioSelect = driver.findElement(By.cssSelector("select#billing_country"));
        Select selectPais = new Select(paisEnvioSelect);
        selectPais.selectByVisibleText("Perú");
    }
    public void ingresaCiudadDeEnvio(String ciudad){
        wait.until(ExpectedConditions.visibilityOf(inputCity));
        inputCity.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        inputCity.sendKeys(Keys.chord(Keys.DELETE));
        inputCity.sendKeys(ciudad);
    }
    public void ingresaDireccionCompleta(String direccionCompleta){
        wait.until(ExpectedConditions.visibilityOf(inputDireccion));
        inputDireccion.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        inputDireccion.sendKeys(Keys.DELETE);
        inputDireccion.sendKeys(direccionCompleta);
    }
    public void ingresaNumeroTelefono(String numeroTelefono){
        wait.until(ExpectedConditions.visibilityOf(inputCellPhone));
        inputCellPhone.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        inputCellPhone.sendKeys(Keys.chord(Keys.DELETE));
        inputCellPhone.sendKeys(numeroTelefono);
    }
    public void ingresaNotasDelPedido(String notaAdicional){
        wait.until(ExpectedConditions.visibilityOf(inputNotas));
        inputNotas.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        inputNotas.sendKeys(Keys.chord(Keys.DELETE));
        inputNotas.sendKeys(notaAdicional);
    }
    public void clickRealizarPedido(){
        wait.until(ExpectedConditions.elementToBeClickable(inputRealizarPedido));
        ((JavascriptExecutor) driver).executeScript("document.querySelectorAll('.blockUI').forEach(e => e.remove());");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",inputRealizarPedido);
    }
    public void pedidoCompletadoExitosamente(){
        wait.until(ExpectedConditions.visibilityOf(mensajeExito));
        assert mensajeExito.isDisplayed(): "El cambió de págino no resultó y no se encontró el mensaje solicitado.";
        //Debemos dejar de usar este tipo de assert porque es POCO PROFESIONAL
        //La mejor manera de utilizar un assert de la siguiente manera:
        //Assert.assertTrue("Mensaje de error", mensajeExito.isDisplayed());    -> Una manera más profesional de hacer el assert
    }


}
