package steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pageObjects.GoogleMain;
import pageObjects.GoogleSearch;


public class GoogleSearchSteps {
    private GoogleMain googleMain;
    private GoogleSearch googleSearch;
    
    @Step("Given That I have enter to the Google search page")
    public void i_have_enter_to_the_Google_search_page(){
        googleMain.open();
        Assert.assertTrue(googleMain.isInitialized());
    }

    @Step("When I search for \"cucumber\"")
    public void i_search_for(String word){
        googleSearch = googleMain.searchFor(word);
    }

    @Step("Then I should get more than 1 link")
    public void  get_more_than(int num){
        Assert.assertTrue(googleSearch.count() >= num);
    }
}
