import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pablo.renero\\IdeaProjects\\Google1\\src\\main\\resources\\chromedriver.exe");
        // Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();

        //Launch the Online Store Website
        driver.get("http://www.google.com");


        // Print a Log In message to the screen
        System.out.println("Successfully opened the website Google.es");

        //Wait for 5 Sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement element = driver.findElement(By.id("q"));


        // Close the driver
        driver.quit();
    }
}