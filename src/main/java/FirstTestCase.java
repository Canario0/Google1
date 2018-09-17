import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class FirstTestCase {

    public static void main(String[] args) {

        /*
        Reads the config file.
         */
        //------------------------------------------------------------

        ResourceBundle config = ResourceBundle.getBundle("config");

        //------------------------------------------------------------


        System.setProperty("webdriver.chrome.driver", config.getString("webDriverKey"));
        // Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();

        // Maximize the window and wait until the browser is fully loaded
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(config.getString("timeoutKey")), TimeUnit.SECONDS);

        // Search the url stored in .properties file
        driver.get(config.getString("urlKey"));
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website" + config.getString("urlKey"));

        // Select the html element whose id is "lst-ib" then search a word and close the browser
        WebElement element = driver.findElement(By.id("lst-ib"));
        element.sendKeys(config.getString("wordKey"));
        element.submit();

        // Look for the search results in the first page and print the link name
        System.out.println("\n\t- Method 1 -\n");
        List<WebElement> results = driver.findElements(By.className("rc"));
        System.out.println("Count of links: " + results.size());

        for (WebElement i : results){
            WebElement aux = i.findElement(By.tagName("a"));
            System.out.println(aux.getText());
        }

        // Other way to do the same thing
        System.out.println("\n\t- Method 2 -\n");

        results = driver.findElements(By.className("r"));
        System.out.println("Count of links: " + results.size());


        for (WebElement i : results){
            WebElement aux = i.findElement(By.tagName("a"));
            System.out.println(aux.getText());
        }


        // Close the driver
        driver.quit();
    }
}