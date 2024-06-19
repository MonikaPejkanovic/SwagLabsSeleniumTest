package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortingMenu {
    WebDriver driver;

    public SortingMenu(WebDriver driver) {
        this.driver = driver;
    }

    WebElement sortingButton;
    WebElement nameZToA;
    WebElement nameAToZ;

    WebElement lowToHigh;
    WebElement HighToLow;

    public WebElement getLowToHigh() {
        return driver.findElement(By.cssSelector("option[value=lohi]"));
    }

    public WebElement getHighToLow() {
        return driver.findElement(By.cssSelector("option[value=hilo]"));
    }

    public WebElement getNameZToA() {
        return driver.findElement(By.cssSelector("option[value=za]"));
    }

    public WebElement getNameAToZ() {
        return driver.findElement(By.cssSelector("option[value=az]"));
    }


    public WebElement getSortingButton() {
        return driver.findElement(By.className("product_sort_container"));
    }



    //==============================================================

    public void clickOnSortingMenu(){
        getSortingButton().click();
    }
    public void clickOnZToA(){
        getNameZToA().click();
    }

    public void clickOnAToZ(){
        getNameAToZ().click();
    }
    public void clickOnLowToHigh(){
        getLowToHigh().click();
    }
    public void clickOnHighToLow(){
        getHighToLow().click();
    }
}
