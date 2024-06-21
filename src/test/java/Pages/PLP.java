package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class PLP {
    WebDriver driver;
    public PLP(WebDriver driver) {
        this.driver = driver;
    }
    public List<WebElement> inventoryList;
    public String mainWindowHandle;
    public WebElement addToCartBackpack;
    public WebElement shopingCartBadge;
    public WebElement removeBackpackButton;
    public WebElement addBikeLightButton;
    public WebElement cartIcon;
    public WebElement hamburgerMenu;
    public List<WebElement>hamburgerList;
    public List<WebElement>productsNameList;
    public List<WebElement> getProductsNameList() {
        return driver.findElements(By.className("inventory_item_name"));
    }
    public WebElement getAddBackpackToCartButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }
    public List<WebElement> getInventoryList() {
        return driver.findElements(By.className("inventory_list"));
    }
    public WebElement getAddLightButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
    }
    public WebElement getRemoveBackpackButton() {
        return driver.findElement(By.cssSelector(".btn.btn_secondary.btn_small.btn_inventory"));
    }
    public WebElement getCartIcon() {
        return driver.findElement(By.id("shopping_cart_container"));
    }
    public WebElement getHamburgerMenu() {
        return driver.findElement(By.id("react-burger-menu-btn"));
    }
    public List<WebElement> getHamburgerList() {
        return driver.findElements(By.className("bm-item"));
    }
    public WebElement getShopingCartBadge() {
        return driver.findElement(By.cssSelector("button[name=remove-sauce-labs-backpack]"));
    }

    //----------------------------------------------------------------------------
    public void clickOnHamburgerItem(String name){
       for( WebElement item : getHamburgerList()){
           if(item.getText().equals(name)){
               item.click();
               break;
           }
       }
    }
    public void addBackpackToCart() {
        getAddBackpackToCartButton().click();
    }
    public void removeBackpack(){
        getRemoveBackpackButton().click();
    }
    public void addBikeLightToCart(){
        getAddLightButton().click();
    }
    public boolean badgeCheck(String num){
        getShopingCartBadge().getText().equals(num);
        return true;
    }
    public void clickOnCart(){
        getCartIcon().click();
    }
    public void clickOnHamburgerMenu(){
        getHamburgerMenu().click();
    }
}
