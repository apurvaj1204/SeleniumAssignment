package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GoogleMapsPage {

    private WebDriver driver;
    private By menuButton = By.xpath("//button[@class='searchbox-button searchbox-hamburger']");
     private By searchBox = By.className("section-categorical-shortcut-primary");
     private By optionLink = By.cssSelector("div.widget-settings-pane > div > ul:nth-child(4) > li:nth-child(5) > button > label\n");
    public GoogleMapsPage(WebDriver driver){
        this.driver = driver;
    }


    public void clickMenuButton(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        driver.findElement(menuButton).click();
    }

    public String getOptionName(){
        WebElement term = driver.findElement(optionLink);
        String value = term.getAttribute("innerHTML");
        return value;
    }

    /* page level assertion */
    public void assertOptionText(String optionName){
        Assert.assertEquals(getOptionName(), optionName);
    }
}
