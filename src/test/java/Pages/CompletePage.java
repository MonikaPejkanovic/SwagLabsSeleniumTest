package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompletePage {
    WebDriver driver;
    public CompletePage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement backHomeButton;
    public WebElement copleteCheckoutMessage;
    public WebElement getCopleteCheckoutMessage() {
        return driver.findElement(By.className("complete-header"));
    }
    public WebElement getBackHomeButton() {
        return driver.findElement(By.id("back-to-products"));
    }

    //--------------------------------------------------------------------------

    public void clickOnBackHomeButton(){
        getBackHomeButton().click();
    }
}
