package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class GoogleSearch extends PageObject {

    @FindBy(xpath = "//div[@class='rc']//a")
    private List<WebElement> links;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public int count(){
        return links.size();
    }

    public List<String> getNames() {
       return links.stream().map(e -> e.getText()).collect(Collectors.toList());
    }
}
