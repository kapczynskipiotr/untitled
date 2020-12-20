package seleniumGridJunit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackConfig {
    protected RemoteWebDriver driver;
    public static final String USERNAME = "piotrkapczyski1";
    public static final String AUTOMATE_KEY = "bbJcCsypogF9sqspzHq9";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public BrowserStackConfig(){

    }
    public void browserStackSettings() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Piotrek\\IdeaProjects\\SeleniumJava.com\\src\\resources\\driver\\chromedriver.exe");
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability("os", "Windows");
        cap.setCapability("os_version", "10");
        cap.setCapability("browser", "Chrome");
        cap.setCapability("browser_version", "80");

        cap.setCapability("name", "piotrkapczyski1's First Test");
        cap.setPlatform(Platform.WINDOWS);


        driver = new RemoteWebDriver(new URL(URL), cap);
    }
}
