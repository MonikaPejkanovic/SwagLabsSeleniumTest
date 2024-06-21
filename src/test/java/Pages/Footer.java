package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer {
    WebDriver driver;
    public Footer(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement xButton;
    public WebElement FbButton;
    public WebElement LinkedinButton;
    public WebElement getxButton() {
        return driver.findElement(By.className("social_twitter"));
    }

    public WebElement getLinkedinButton() {
        return driver.findElement(By.className("social_linkedin"));
    }

    public WebElement getFbButton() {
        return driver.findElement(By.className("social_facebook"));
    }

    //---------------------------------------------------------------------------------------

    public void clickOnTwitter(){
        getxButton().click();
    }

    public void clickOnFacebook(){
        getFbButton().click();
    }

    public void clickOnLinkedin(){
       getLinkedinButton().click();
    }

}
