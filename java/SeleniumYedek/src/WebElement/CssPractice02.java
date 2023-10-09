package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class CssPractice02 {
    public static void main(String[] args) throws InterruptedException {
        // 1. https://www.amazon.com.tr/ ye gidiniz.
        // 2. Amazon.com.tr logosuna tıklayınız.
        // 3. 5 saniye hard wait ile bekleyiniz, sonra sayfayı refreshleyiniz.
        // 4. arama bar'ına tıklayınız.
        // 5. arama bar'ına "hello selenium" yazınız.
        // 6. ara butonuna tıklayınız.
        // 7. alışveriş sepetine tıklayınız.
        // 8. web safyasını kapatınız.

        System.getProperty("webdriver.chrome.driver", "/Users/bariscanates/selenium/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();


        //1.
        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //2.
        WebElement logo = driver.findElement(By.cssSelector("div a.nav-logo-link.nav-progressive-attribute"));
        logo.click();
        //3.
        Thread.sleep(5000);

        //4.
        WebElement aramaBari= driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        aramaBari.click();
        Thread.sleep(1000);

        //5.
        aramaBari.sendKeys("hello selenium");
        Thread.sleep(1000);

        //6.
        WebElement araButtonu=driver.findElement(By.cssSelector("div.nav-search-submit.nav-sprite"));
        araButtonu.click();

        //7.
        WebElement alisverisSepeti=driver.findElement(By.cssSelector("span.nav-cart-count.nav-cart-0.nav-progressive-attribute.nav-progressive-content"));
        alisverisSepeti.click();

        //8.
        Thread.sleep(5000);
        driver.close();



    }
}
