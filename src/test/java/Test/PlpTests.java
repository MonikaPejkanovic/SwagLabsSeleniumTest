package Test;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class PlpTests extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        logInPage.login(logInPage.getValidUsername(), logInPage.getValidPassword());
    }


    @Test
    public void sortingTestZToA (){
        sortingMenu.clickOnSortingMenu();
        sortingMenu.clickOnZToA();
        Assert.assertEquals(plp.getLista1().getFirst().getText(), "Test.allTheThings() T-Shirt (Red)");
    }

    @Test
    public void sortingTestAToZ (){
        sortingMenu.clickOnSortingMenu();
        sortingMenu.clickOnAToZ();
        Assert.assertEquals(plp.getLista1().getFirst().getText(), "Sauce Labs Backpack");
    }

    @Test
    public void sortingTestLowToHigh (){
        sortingMenu.clickOnSortingMenu();
        sortingMenu.clickOnLowToHigh();
        Assert.assertEquals(plp.getLista1().getFirst().getText(), "Sauce Labs Onesie");
    }

    @Test
    public void sortingTestHighToLow (){
        sortingMenu.clickOnSortingMenu();
        sortingMenu.clickOnHighToLow();
        Assert.assertEquals(plp.getLista1().getFirst().getText(), "Sauce Labs Fleece Jacket");
    }

    @Test
    public void aboutButtonTest(){
        plp.clickOnHamburgerMenu();
        plp.clickOnHamburgerItem("About");
        Assert.assertEquals(driver.getCurrentUrl(), "https://saucelabs.com/");
    }

    @Test
    public void allItemButtonTest() throws InterruptedException {
        plp.addToCartBackpack();
        plp.clickOnCart();
        Assert.assertTrue(yourCart.getCheckoutButton().isDisplayed());
        plp.clickOnHamburgerMenu();
        plp.clickOnHamburgerItem("All Items");
        Assert.assertTrue(plp.getAddLightButton().isDisplayed());
    }


    @AfterMethod
    public void clean(){
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }

}
