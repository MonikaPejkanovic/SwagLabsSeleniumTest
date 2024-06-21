package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPage {
    WebDriver driver;
    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement finishButton;
    public WebElement getFinishButton() {
        return driver.findElement(By.id("finish"));
    }
    //--------------------------------------------------------------------------------

    public void clickOnFinishButton(){
        getFinishButton().click();
    }
}
