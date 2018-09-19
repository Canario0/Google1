
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/GoogleSearch.feature",
        plugin = { "pretty", "json:target/cucumber-json-report.json","html:target/cucumber-html-report"},
        glue = "steps"
)
public class TestRunner {
}
