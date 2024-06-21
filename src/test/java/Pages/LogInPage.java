package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
    WebDriver driver;
    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }
    WebElement usernameField;
    WebElement passwordField;
    WebElement logInButton;
    WebElement ErrorMessage;
    String validUsername;
    String validPassword;
    public WebElement getUsernameField() {
        return driver.findElement(By.id("user-name"));
    }
    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }
    public WebElement getLogInButton() {
        return driver.findElement(By.id("login-button"));
    }
    public WebElement getErrorMessage() {
        return driver.findElement(By.className("error-button"));
    }
    public String getValidUsername() {
        return "standard_user";
    }
    public String getValidPassword() {
        return "secret_sauce";
    }

    //-----------------------------------------------------------------

    public void login(String username, String password){
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLogInButton().click();
    }
}
