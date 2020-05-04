package search;

import Base.baseTest;
import Pages.GoogleSearchPage;
import org.testng.annotations.Test;

public class searchTextTests extends baseTest {

@Test
    public void testFirstTextEntry(){
        String searchTerm = "Chemtrail";
        GoogleSearchPage googleSearchPage = homePage.enterSearchTerm(searchTerm);
        googleSearchPage.getSearchElement();
        googleSearchPage.getSearchResultText();
        googleSearchPage.assertFirstLinkText(0, searchTerm);
        /* Assertion in test method */
      //  var allResults = googleSearchPage.getSearchResultText();
       // int i = 0; //for first search result
       // assertTrue(allResults.get(i).contains(searchTerm), "Search result doesn't contain the word 'Chemtrails'");
    }
}
