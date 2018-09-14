import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class FirstTestCase {

    public static void main(String[] args) {

        /*
        Reading the config file.
         */
        //------------------------------------------------------------

        ResourceBundle config = ResourceBundle.getBundle("config");

        //------------------------------------------------------------


        System.setProperty("webdriver.chrome.driver", config.getString("webDriverKey"));
        // Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(config.getString("timeoutKey")), TimeUnit.SECONDS);

        //Launch the Online Store Website
        driver.get(config.getString("urlKey"));
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website" + config.getString("urlKey"));

        WebElement element = driver.findElement(By.id("lst-ib"));
        element.sendKeys(config.getString("wordKey"));
        element.submit();

        driver.quit();
    }
}