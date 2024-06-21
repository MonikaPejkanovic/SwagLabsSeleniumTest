package Test;

import Base.BaseTest;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FooterTests extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        mainWindowHandle = driver.getWindowHandle();
        logInPage.login(logInPage.getValidUsername(), logInPage.getValidPassword());
    }

    @Test
    public void clickOnTwitter() throws InterruptedException {
        footer.clickOnTwitter();
        switchToNewWindow();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://x.com/saucelabs");

    }

    @Test
    public void clickOnFacebook(){
        footer.clickOnFacebook();
        switchToNewWindow();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/saucelabs");
    }
    @Test
    public void clickOnLinkedin(){
        footer.clickOnLinkedin();
        switchToNewWindow();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.linkedin.com/company/sauce-labs/");

    }


    @AfterMethod
    public void clean(){
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }
}
