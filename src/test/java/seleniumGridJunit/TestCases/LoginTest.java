package seleniumGridJunit.TestCases;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
import seleniumGridJunit.Base;
import seleniumGridJunit.HomePage.HomePagePage;
import sun.rmi.runtime.Log;

import java.net.MalformedURLException;

public class LoginTest extends Base {
    HomePagePage homePagePage;
    public LoginTest(){
        super();
    }

    @Before
    public void setup() throws MalformedURLException {
        initialization();
        homePagePage = new HomePagePage();

    }


    @Test
    public void titleTest() {
        String result = homePagePage.getPageTitle();
        Assert.assertEquals("page title is not correct", result, "Allegro - atrakcyjne ceny");
    }

    @Test
    public void elektronikaTest() {


        homePagePage.goToElektronikaTab();
        String Title = driver.getTitle();
        Assert.assertEquals("page title is incorrect", Title, "na potrzeby nauki blad");
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
