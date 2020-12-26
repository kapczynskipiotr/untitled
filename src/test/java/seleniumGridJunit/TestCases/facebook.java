package seleniumGridJunit.TestCases;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import seleniumGridJunit.Base;
import seleniumGridJunit.HomePage.HomePagePage;

import java.net.MalformedURLException;

public class facebook extends Base {
    HomePagePage homePagePage;
    public facebook(){
        super();
    }

    @Before
    public void setup() throws MalformedURLException {
        initialization();
        homePagePage = new HomePagePage();

    }


    @Test
    public void facebookTitle() {
        driver.get("https://facebook.com");
        String facebooktitle = driver.getTitle();
        System.out.println(facebooktitle);
        Assert.assertEquals("page title is not correct", facebooktitle, "Facebook - zaloguj się lub zarejestruj");
    }


    @After
    public void tearDown(){
        driver.quit();
    }
}
