package hooks;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import webdrivermanager.WebDriverManager;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("=== Iniciando navegador ===");
        WebDriverManager.getDriver(); // Inicializa el driver desde la clase centralizada

    }

    @After
    public void tearDown() {
        System.out.println("=== Cerrando navegador ===");
        WebDriverManager.quitDriver(); //Cierra y limpia el driver
    }

    public static WebDriver getDriver() {
        return WebDriverManager.getDriver();
    }
}
