package seleniumGridJunit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base extends BrowserStackConfig{
    public static WebDriver driver;


    public Base(){
    }
    public static void initialization() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Piotrek\\IdeaProjects\\SeleniumJava.com\\src\\resources\\driver\\chromedriver.exe");

        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability("os", "Windows");
        cap.setCapability("os_version", "10");
        cap.setCapability("browser", "Chrome");
        cap.setCapability("browser_version", "80");


        cap.setCapability("name", "piotrkapczyski1's First Test");
        cap.setPlatform(Platform.WINDOWS);


        driver = new RemoteWebDriver(new URL(URL), cap);

//        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

}
