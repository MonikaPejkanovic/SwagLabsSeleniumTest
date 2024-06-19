package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkout extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        logInPage.login(logInPage.getValidUsername(), logInPage.getValidPassword());
        resetAppState();
    }

    @Test
    public void addToCartReoveButton(){
        plp.addToCartBackpack();
        plp.removeBackpack();
    }

    @Test
    public void ShopingCatBadgeTest() throws InterruptedException {
        plp.addToCartBackpack();
        plp.badgeCheck("1");
        plp.addBikeLightToCart();
        plp.badgeCheck("2");
        plp.removeBackpack();


    }

    @Test
    public void checkoutTest(){
        plp.addBikeLightToCart();
        plp.clickOnCart();
        Assert.assertTrue(yourCart.isTheRightProductInCart("Sauce Labs Bike Light"));
        yourCart.clickOnCheckoutButton();
        yourInformation.fillForm("pera","peric", "11000");
        yourInformation.clickOnContinue();
        Assert.assertTrue(yourCart.isTheRightProductInCart("Sauce Labs Bike Light"));
        overviewPage.clickOnFinishButton();
        Assert.assertEquals(completePage.getCopleteCheckoutMessage().getText(),"Thank you for your order!");
    }

    @Test
    public void backHomeTest(){
        checkoutTest();
        completePage.clickOnBackHomeButton();
        Assert.assertTrue(plp.getInventoryList().isDisplayed());
    }



    @AfterMethod
    public void clean(){
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }
}
