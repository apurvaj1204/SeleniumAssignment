package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By googleSearchBox = By.name("q");
    private By googleImagesLink = By.linkText("Images");

    public HomePage(WebDriver driver){
    this.driver = driver;
}

    public void getImageSearchBox(){
        driver.findElement(googleImagesLink).click();
    }

    public GoogleSearchPage enterSearchTerm(String searchTerm){
        driver.findElement(googleSearchBox).sendKeys(searchTerm);
        driver.findElement(googleSearchBox).submit();
        return new GoogleSearchPage(driver);
    }
}
