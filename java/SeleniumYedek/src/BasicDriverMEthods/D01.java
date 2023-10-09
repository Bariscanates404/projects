package BasicDriverMEthods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D01 {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver","/Users/bariscanates/selenium/chromedriver_mac64/chromedriver");

        WebDriver driver = new ChromeDriver();


        driver.get("https://amazon.com.tr");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.close();










    }
}
