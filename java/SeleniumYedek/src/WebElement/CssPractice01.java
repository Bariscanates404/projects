package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CssPractice01 {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver", "/Users/bariscanates/selenium/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();

        // 1. https://www.amazon.com.tr/ ye gidiniz.
        // 2. arama bar'ına tıklayınız.
        // 3. arama bar'ına "unity" yazınız.
        // 4. ara butonuna tıklayınız.
        // 5. web safyasını kapatınız.


        //1.
        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2.
        WebElement aramaBari= driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        aramaBari.click();
        Thread.sleep(1000);
        //3.
        aramaBari.sendKeys("unity");
        Thread.sleep(1000);

        //4.
        //kullanilabilir locatorlarimiz   input[type='submit'] #nav-search-submit-button
        WebElement araButtonu=driver.findElement(By.cssSelector("div.nav-search-submit.nav-sprite"));
        araButtonu.click();

        //5.
        Thread.sleep(5000);
        driver.close();


    }
}
