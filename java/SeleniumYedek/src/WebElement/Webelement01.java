package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Webelement01 {
    public static void main(String[] args) throws InterruptedException {

        System.getProperty("webdriver.chrome.driver","/Users/bariscanates/selenium/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement searchBox =driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        searchBox.sendKeys("baris" + Keys.ENTER);
        Thread.sleep(5000);

        driver.close();






    }
}
