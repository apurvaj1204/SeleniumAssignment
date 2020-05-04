package ImageSearch;

import Base.baseTest;
import Pages.GoogleSearchPage;
import org.testng.annotations.Test;

public class imageSearchTests extends baseTest {

    @Test

    public void testFirstImageTitle(){
        String searchTerm = "Dealey Plaza";
        homePage.getImageSearchBox();
        GoogleSearchPage googleSearchPage = homePage.enterSearchTerm(searchTerm);
        googleSearchPage.getImageTitles();
        googleSearchPage.assertFirstImageTitle(0, searchTerm); //assertion done at page level


        /* Assertion in test method */

        /*
        var allTitles = googleSearchPage.getImageTitles();
        int i = 0; //for first image title
        assertTrue(allTitles.get(i).contains(searchTerm), "Search result doesn't contain the phrase 'Dealey Plaza'");
        */
    }
}
