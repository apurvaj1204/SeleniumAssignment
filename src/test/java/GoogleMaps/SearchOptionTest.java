package GoogleMaps;

import Base.baseTest;
import Pages.GoogleMapsPage;
import Pages.GoogleSearchPage;
import org.testng.annotations.Test;

public class SearchOptionTest extends baseTest {


    @Test

    public void testGoogleMapsOptions(){
        String optionName = "Street View"; //could not find the option named "Flat Earth View" on the Google Maps
        //hence, used the webelement for "Street View" to do the test. It can also be a case of unclear requirement.


        String searchTerm = "Google Maps";
        GoogleSearchPage googleSearchPage = homePage.enterSearchTerm(searchTerm);
        googleSearchPage.getSearchElement();
        googleSearchPage.getSearchResultText();
        GoogleMapsPage googleMapsPage = googleSearchPage.getFirstLink(0);
        googleMapsPage.clickMenuButton();
        googleMapsPage.getOptionName();
        googleMapsPage.assertOptionText(optionName);

    }




}
