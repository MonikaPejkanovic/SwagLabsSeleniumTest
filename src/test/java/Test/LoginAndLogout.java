package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginAndLogout extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void validLogIn(){
        logInPage.login(logInPage.getValidUsername(), logInPage.getValidPassword());
        Assert.assertTrue(plp.getInventoryList().isDisplayed());
    }

    @Test
    public void logInWithInvalidPassword() {
        logInPage.login(logInPage.getValidUsername(), "blabla");
        Assert.assertTrue(logInPage.getErrorMessage().isDisplayed());

    }

    @Test
    public void logInWithInvalidUsername(){
        logInPage.login("blabla", logInPage.getValidPassword());
        Assert.assertTrue(logInPage.getErrorMessage().isDisplayed());
    }

    @Test
    public void logInWithInvalidCredentials(){
        logInPage.login("bla", "blabla");
        Assert.assertTrue(logInPage.getErrorMessage().isDisplayed());
    }
    @Test
    public void logout(){
        validLogIn();
        plp.clickOnHamburgerMenu();
        plp.clickOnHamburgerItem("Logout");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
    }

    @AfterMethod
    public void clean(){
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }



}
