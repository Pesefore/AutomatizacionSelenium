package stepDefinitions.ecomerceE2EStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import step.ecomerceStep.EcomerceStep;

public class EcomerceE2EStepDefinitions {

    private EcomerceStep ecomerceStep = new EcomerceStep();

    @Given("el usuario se encuentra en la plataforma de Academia Centyc")
    public void ingresaPlataforma(){
        ecomerceStep.ingresaPlataforma();
    }
    @And("ingresa al modulo de TIENDA PARA PRUEBAS")
    public void clickTiendraPruebas(){
        ecomerceStep.clickTiendraPruebas();
    }
    @And("da click a IR A LA TIENDA DE PRUEBAS CENTYC")
    public void clickTiendaPruebasCentyc(){
        ecomerceStep.clickTiendaPruebasCentyc();
    }
    @Then("habra cargado otra pestaña de articulos para que el usuario pueda hacer su compra")
    public void pestañaNuevaExitosa(){
        ecomerceStep.pestañaNuevaExitosa();
    }
    @And("escoge la Mascara Buena Onda")
    public void mascaraBuenaOnda(){
        ecomerceStep.mascaraBuenaOnda();
    }
    @And("agrega al carrito cuatro unidades del articulo escogido")
    public void clickCuatroUnidadesAlCarrito(){
        ecomerceStep.clickCuatroUnidadesAlCarrito();
    }
    @And("da click a AGREGAR AL CARRITO")
    public void clickAgregarAlCarrito(){
        ecomerceStep.clickAgregarAlCarrito();
    }
    @And("da click a Finalzar Compra")
    public void clickFinalizarCompra(){
        ecomerceStep.clickFinalizarCompra();
    }
    @Then("se redirigira a una nueva pagina para colocar los detalles del usuario comprador")
    public void nuevaPestañaDetallesDeUsuario(){
        ecomerceStep.nuevaPestañaDetallesDeUsuario();
    }
    @And("el usuario digita su {string} en el imput de Correo electronico")
    public void ingresoCorreoElectronico(String correoElectronico){
        ecomerceStep.ingresoCorreoElectronico(correoElectronico);
    }
    @And("digita su {string} en el imput de Nombre")
    public void ingresoNombreCompleto(String nombreCompleto){
        ecomerceStep.ingresoNombreCompleto(nombreCompleto);
    }
    @And("digita su {string} en el imput de Apellido")
    public void ingresaApellidoCompleto(String apellidoCompleto){
        ecomerceStep.ingresaApellidoCompleto(apellidoCompleto);
    }
    @And("escoge su pais de nacimiento en el dropdown de Pais")
    public void ingresaPaisDeEnvio(){
        ecomerceStep.ingresaPaisDeEnvio();
    }
    @And("digita su {string} en el imput de Ciudad")
    public void ingresaCiudadDeEnvio(String ciudad){
        ecomerceStep.ingresaCiudadDeEnvio(ciudad);
    }
    @And("ingresa su {string} en el imput de Direccion")
    public void ingresaDireccionCompleta(String direccionCompleta){
        ecomerceStep.ingresaDireccionCompleta(direccionCompleta);
    }
    @And("ingresa su {string} en el imput de Telefono")
    public void ingresaNumeroTelefono(String numeroTelefono){
        ecomerceStep.ingresaNumeroTelefono(numeroTelefono);
    }
    @And("ingresa su {string} en el imput de Notas del Pedido")
    public void ingresaNotasDelPedido(String notaAdicional){
        ecomerceStep.ingresaNotasDelPedido(notaAdicional);
    }
    @And("usuario da click al REALIZAR EL PEDIDO")
    public void clickRealizarPedido(){
        ecomerceStep.clickRealizarPedido();
    }
    @Then("usuario habra completado exitosamente el pedido")
    public void pedidoCompletadoExitosamente(){
        ecomerceStep.pedidoCompletadoExitosamente();
    }




}
