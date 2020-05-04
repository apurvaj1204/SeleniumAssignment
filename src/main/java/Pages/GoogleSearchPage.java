package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertTrue;

public class GoogleSearchPage {

    private WebDriver driver;
    private By searchArea = By.id("rcnt");
    private By allSearchedLinks = By.tagName("a");
    private By allImageSearchLinks = By.className("WGvvNb");


    public GoogleSearchPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getSearchElement() {
        return  driver.findElement(searchArea);
    }

    public List<String> getSearchResultText(){
        List<WebElement> allLinks = getSearchElement().findElements(allSearchedLinks);
        return allLinks.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public List<String> getImageTitles(){
        List<WebElement> allLinks = driver.findElements(allImageSearchLinks);
        return allLinks.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public GoogleMapsPage getFirstLink(int i){
        List<WebElement> allLinks = getSearchElement().findElements(allSearchedLinks);
        allLinks.get(i).click();
        return new GoogleMapsPage(driver);
    }
/* page level assertion */
    public void assertFirstImageTitle(int i, String searchTerm){
        assertTrue(getImageTitles().get(i).contains(searchTerm), "Search result doesn't contain the phrase 'Dealey Plaza'");
    }
    /* page level assertion */
    public void assertFirstLinkText(int i, String searchTerm){
        assertTrue(getSearchResultText().get(i).contains(searchTerm), "Search result doesn't contain the phrase 'Chemtrails'");
    }



}
