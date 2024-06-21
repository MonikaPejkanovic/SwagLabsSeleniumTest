package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public LogInPage logInPage;
    public PLP plp;
    public SortingMenu sortingMenu;
    public YourCart yourCart;
    public YourInformation yourInformation;
    public OverviewPage overviewPage;
    public CompletePage completePage;
    public Footer footer;
    public String mainWindowHandle;

    public void switchToNewWindow(){
        closeNewWindow();
        for (String window : driver.getWindowHandles()) {
            if (!window.equals(mainWindowHandle)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }
    public void closeNewWindow(){
        for(String window: driver.getWindowHandles()){
            if(!window.equals(mainWindowHandle)){
                driver.close();
                break;
            }
        }
    }
    public void resetAppState() {
        plp.clickOnHamburgerMenu();
        plp.clickOnHamburgerItem("Reset App State");
        driver.navigate().refresh();
    }
    public void waitForAllElementsVisibility(List<WebElement> elements) {
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }



    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        footer = new Footer(driver);
        logInPage = new LogInPage(driver);
        plp = new PLP(driver);
        sortingMenu = new SortingMenu(driver);
        yourCart = new YourCart(driver);
        yourInformation = new YourInformation(driver);
        overviewPage =new OverviewPage(driver);
        completePage = new CompletePage(driver);
    }

    @AfterClass
    public void quit(){
        driver.quit();
    }
}
