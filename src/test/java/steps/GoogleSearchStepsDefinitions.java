package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.serenity.GoogleSearchSteps;

public class GoogleSearchStepsDefinitions {
    @Steps
    GoogleSearchSteps steps;

    @Given("^That I have enter to the Google search page$")
    public void enterGoogleSearch() {
    steps.i_have_enter_to_the_Google_search_page();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String word) throws Throwable {
        steps.i_search_for(word);
    }

    @Then("^I should get more than 1 link$")
    public void iShouldGetMoreThanOneLink() {
        steps.get_more_than(1);
    }
}
