import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.getProperty("webdriver.chrome.driver","/Users/bariscanates/selenium/chromedriver_mac64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com.tr");




    }
}