package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;

public class AutomationPracticePage {

    private WebDriver driver;

    @FindBy(xpath = "//div[@class='columns-container']//li[4]")
    private WebElement persInfoBtn;

    @FindBy(xpath = "//div[@class='shopping_cart']")
    private WebElement cartBtn;

    public AutomationPracticePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
