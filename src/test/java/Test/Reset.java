package Test;

import Base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Reset extends BaseTest {
    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        logInPage.login(logInPage.getValidUsername(), logInPage.getValidPassword());
    }

    @Test
    public void addToCartReoveButton() throws InterruptedException {
        plp.addToCartBackpack();
        resetAppState();
        Thread.sleep(10000);
    }
}
