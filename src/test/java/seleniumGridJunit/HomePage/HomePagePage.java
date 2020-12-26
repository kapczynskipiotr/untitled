package seleniumGridJunit.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumGridJunit.Base;
import seleniumGridJunit.testData;

import java.util.List;

public class HomePagePage extends Base {

    @FindBy(xpath="//div[contains (@slot, 'button')]/button[contains (@data-role, 'accept-consent')]")
    WebElement button;

    @FindBy(xpath="//div[contains (@data-group-id, 'departments_Elektronika')]")
    WebElement elektronikaPage;

    testData testdata = new testData();
    List danetestowe = testdata.jsonreader();
    String url=  (String) danetestowe.get(0);
    String cos = (String) danetestowe.get(1);
    public void goToElektronikaTab() {

        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains (@slot, 'button')]/button[contains (@data-role, 'accept-consent')]")));
        button.click();
        elektronikaPage.click();
    }
    public String getPageTitle(){

        driver.get(url);
        String title = driver.getTitle();
        return title;

    }
    public HomePagePage(){
        PageFactory.initElements(driver, this);
    }
}
