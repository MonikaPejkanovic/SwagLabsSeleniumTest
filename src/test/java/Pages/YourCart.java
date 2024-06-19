package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class YourCart {
    WebDriver driver;

    public YourCart(WebDriver driver) {
        this.driver = driver;
    }

    List<WebElement>listYourCart;
    public WebElement checkoutButton;

    public List<WebElement> getListYourCart() {
        return driver.findElements(By.className("inventory_item_name"));
    }

    public WebElement getCheckoutButton() {
        return driver.findElement(By.id("checkout"));
    }
//---------

    public boolean isTheRightProductInCart(String name){
        boolean rightProduct = getListYourCart().getFirst().getText().equals(name);
        return rightProduct;
    }
    public void clickOnCheckoutButton(){
        getCheckoutButton().click();
    }}
