package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://www.google.com")
public class GoogleMain extends PageObject {
    @FindBy(id = "lst-ib")
    private WebElement searchBox;

    public GoogleMain(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized(){
        return searchBox.isDisplayed();
    }

    public GoogleSearch searchFor(String word) {
        searchBox.clear();
        searchBox.sendKeys(word);
        searchBox.submit();
        return new GoogleSearch(getDriver());
    }
}
