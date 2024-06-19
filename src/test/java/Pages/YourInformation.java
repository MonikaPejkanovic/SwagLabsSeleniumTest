package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourInformation {
    WebDriver driver;

    public YourInformation(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement firstNameField;
    public WebElement lastNameField;
    public WebElement continueButton;
    public WebElement postalCodeField;

    public WebElement getFirstNameField() {
        return driver.findElement(By.id("first-name"));
    }

    public WebElement getLastNameField() {
        return driver.findElement(By.id("last-name"));
    }

    public WebElement getPostalCodeField() {
        return driver.findElement(By.id("postal-code"));
    }

    public WebElement getContinueButton() {
        return driver.findElement(By.id("continue"));
    }

    //---------------------------------------------------------------

    public void fillForm(String firstname, String lastname, String number){
        getFirstNameField().sendKeys(firstname);
        getLastNameField().sendKeys(lastname);
        getPostalCodeField().sendKeys(number);
    }
    public void clickOnContinue(){
        getContinueButton().click();
    }
}
