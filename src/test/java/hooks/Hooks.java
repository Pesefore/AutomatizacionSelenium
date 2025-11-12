package hooks;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("=== Iniciando navegador ===");
        driver = new ChromeDriver(); // Abre Chrome
        driver.manage().window().maximize(); // Pantalla completa
    }

    @After
    public void tearDown() {
        System.out.println("=== Cerrando navegador ===");
        if (driver != null) {
            driver.quit(); // Cierra el navegador
        }
    }

    // Método público para que otras clases puedan usar el mismo driver
    public static WebDriver getDriver() {
        return driver;
    }

}
