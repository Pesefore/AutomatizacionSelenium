package stepDefinitions.sauceDemoStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import step.sauceDemoStep.SauceDemoStep;

public class SauceDemoStepDefinitions {

    private SauceDemoStep sauceDemoStep = new SauceDemoStep();

    @Given("el usuario se encuentra en la pagina de loguin")
    public void ingresoExitosoPaginaLogin(){
        sauceDemoStep.ingresoExitosoPaginaLogin();
    }
    @And("escribe su {string} en el campo de Username")
    public void ingresoUsername(String user){
        sauceDemoStep.ingresoUsername(user);
    }
    @And("escribe su {string} en el campo de Password")
    public void ingresoPassword(String pass){
        sauceDemoStep.ingresoPassword(pass);
    }
    @And("da click al boton de login")
    public void clickBotonLogin(){
        sauceDemoStep.clickBotonLogin();
    }

    @Then("el usuario habra entrado exitosamente al modulo de compras")
    public void ingresoExitoModuloCompras(){
        sauceDemoStep.ingresoExitoModuloCompras();
    }
    @When("el usuario añade al carrito haciendo click en el articulo de Backpack")
    public void clickArticuloKacbpack(){
        sauceDemoStep.clickArticuloKacbpack();
    }
    @And("añade a la cesta de compras haciendo click en el articulo Bike Light")
    public void clickArticuloBikeLight(){
        sauceDemoStep.clickArticuloBikeLight();
    }
    @And("añade a la cesta de compras haciendo click en el articulo Bolt T-Shirt")
    public void clickAritculoBoltTshirt() {
        sauceDemoStep.clickAritculoBoltTshirt();
    }
    @And("añade a la cesta de compras haciendo click en el articulo Fleece Jacket")
    public void clickArticuloFleeceJacket(){
        sauceDemoStep.clickArticuloFleeceJacket();
    }
    @And("añade a la cesta de compras haciendo click en el articulo Sauce Labs Onesie")
    public void clickArticuloLabsOnesie(){
        sauceDemoStep.clickArticuloLabsOnesie();
    }
    @And("añade a la cesta de compras haciendo click en el articulo Red T-Shirt")
    public void clickArticuloRedTshirt(){
        sauceDemoStep.clickArticuloRedTshirt();
    }
    @And("el usuario clickea el carrito de compras para realizar la compra")
    public void clickCarritoCompras(){
        sauceDemoStep.clickCarritoCompras();
    }
    @Then("habra sido redireccionado exitosamente a que verifique sus articulos seleccionados")
    public void vistaExitosaArticulosSeleccionados(){
        sauceDemoStep.vistaExitosaArticulosSeleccionados();
    }
    @And("da click en el boton Checkout")
    public void clickBottonCheckout(){
        sauceDemoStep.clickBottonCheckout();
    }
    @Then("habra sido redireccionado exitosamente a que rellene sus datos personales")
    public void vistaExitosaHaciaDatosPersonales(){
        sauceDemoStep.vistaExitosaHaciaDatosPersonales();
    }
    @And("el usuario escribe su {string} en el campo de First Name")
    public void ingresoFirstName(String primerNombre){
        sauceDemoStep.ingresoFirstName(primerNombre);
    }
    @And("escribe su {string} en el campo de Last Name")
    public void ingresoLastName(String lastName){
        sauceDemoStep.ingresoLastName(lastName);
    }
    @And("escribe su {string} en el campo de Postal Code")
    public void ingresoPostCode(String codigoPostal){
        sauceDemoStep.ingresoPostCode(codigoPostal);
    }
    @And("da click en el boton Continue")
    public void clickButtonContinue(){
        sauceDemoStep.clickButtonContinue();
    }
    @Then("habra sido redireccionado exitosamente los detalles de su pedido y el precio total a pagar")
    public void detalleExitosoPedidoYTotalPagar(){
        sauceDemoStep.detalleExitosoPedidoYTotalPagar();
    }
    @And("da click en el boton Finish")
    public void clickButtonFinish(){
        sauceDemoStep.clickButtonFinish();
    }
    @Then("el usuario habra comprado exitosamente los articulos")
    public void compraExitosaArticulos(){
        sauceDemoStep.compraExitosaArticulos();
    }

}
