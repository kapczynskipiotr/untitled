package seleniumGridJunit.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumGridJunit.Base;

import java.nio.file.WatchEvent;

public class HomePagePage extends Base {

    @FindBy(xpath="//button[contains (text(), 'przejdź dalej')]")
    WebElement button;

    @FindBy(xpath="//div[contains (@data-group-id, 'departments_Elektronika')]")
    WebElement elektronikaPage;



    public void goToElektronikaTab() {
        driver.get("https://allegro.pl/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains (text(), 'przejdź dalej')]")));
        button.click();
        elektronikaPage.click();
    }
    public String getPageTitle(){
        driver.get("https://allegro.pl");
        String title = driver.getTitle();
        return title;
    }
    public HomePagePage(){
        PageFactory.initElements(driver, this);
    }
}
