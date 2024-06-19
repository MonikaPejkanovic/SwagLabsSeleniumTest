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
    WebElement inventoryList;
    String mainWindowHandle;
    List<WebElement> lista1;
    WebElement addToCartBackpack;
    public WebElement shopingCartBadge;
    public WebElement removeBackpackButton;
    public WebElement addLightButton;
    public WebElement cartIcon;
    public WebElement hamburgerMenu;
    public WebElement resetAppState;
    public List<WebElement>hamburgerList;
    public WebElement allItemsButton;
    public WebElement getAllItemsButton() {
    return driver.findElement(By.id("inventory_sidebar_link"));
    }
    public WebElement getAddToCartBackpack() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }
    public List<WebElement> getLista1() {
        return driver.findElements(By.className("inventory_item_name"));
    }
    public WebElement getInventoryList() {
        return driver.findElement(By.className("inventory_list"));
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
    public WebElement getResetAppState() {
        return  driver.findElement(By.id("reset_sidebar_link"));
    }
    public List<WebElement> getHamburgerList() {
        return driver.findElements(By.className("bm-item"));
    }
    public WebElement getShopingCartBadge() {
        return driver.findElement(By.cssSelector("button[name=remove-sauce-labs-backpack]"));
    }

    //-----------------------------------------------------------------
    public void clickOnHamburgerItem(String name){
       for( WebElement item : getHamburgerList()){
           if(item.getText().equals(name)){
               item.click();
               break;
           }
       }
    }
    public void addToCartBackpack() {
        getAddToCartBackpack().click();
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
    public void clickOnAllItemsButton(){
        getAllItemsButton().click();

    }
    public void clickOnResetAppState(){
        getResetAppState().click();
    }
}
