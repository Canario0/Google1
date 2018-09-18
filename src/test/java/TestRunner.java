
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ResourceBundle;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "steps"
)
public class TestRunner {

//    public static WebDriver driver;
//    private static ResourceBundle config;
//
//    @BeforeClass
//    public static void setUp() {
//       /*
//        Reads the config file.
//         */
//        //------------------------------------------------------------
//
//        config = ResourceBundle.getBundle("config");
//
//        //------------------------------------------------------------
//
//
//        System.setProperty("webdriver.chrome.driver", config.getString("webDriverKey"));
//        // Create a new instance of the Chrome driver
//        driver = new ChromeDriver();
//    }
//
////    @Test
////    public void signUp() {
////        driver.get(config.getString("urlKey"));
////        GoogleMain googleMain = new GoogleMain(driver);
////        assertTrue(googleMain.isInitialized());
////        googleMain.enterWord(config.getString("wordKey"));
////        googleMain.submit();
////    }
//
//
//    @After
//    public void cleanUp() {
//        driver.manage().deleteAllCookies();
//    }
//
//    @AfterClass
//    public static void tearDown() {
//        if (driver != null)
//            driver.close();
//    }
//

}
