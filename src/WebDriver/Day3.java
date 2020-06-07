package WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

    ChromeDriver driver;

    public void launch(){
        lection();
    }

    private void lection(){
        // Такая конструкция вернет "чистый" драйвер, без открытия страницы
        driver = WebDriverManager.chromeDriverInit("", null);
        driver.quit();
    }
}
