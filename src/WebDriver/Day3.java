package WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day3 {

    ChromeDriver driver;

    public void launch(){
        lectionPractice();
    }

    private void lectionPractice(){

        WebElement signInBtn;
        WebElement loginInput;
        WebElement passInput;

        driver = WebDriverManager.chromeDriverInit("http://automationpractice.com/index.php", null);
        signInBtn = driver.findElementByXPath("//a[@class='login']");
        signInBtn.click();

        try {
            Thread.sleep(1000);

            loginInput = driver.findElementByXPath("//input[@id='email']");
            passInput = driver.findElementByXPath("//input[@id='passwd']");
            signInBtn = driver.findElementByXPath("//button[@id='SubmitLogin']");

            loginInput.sendKeys("Test42.85@mail.ru");
            passInput.sendKeys("Qwert@12");
            signInBtn.click();

            AutomationPracticePage page = new AutomationPracticePage(driver);
            Thread.sleep(2000);

            driver.quit();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
