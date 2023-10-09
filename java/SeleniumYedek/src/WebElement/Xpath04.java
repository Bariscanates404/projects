package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Xpath04 {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver", "/Users/bariscanates/selenium/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();

        //1. amazona gidelim
        //2. arama kutusuna selenium yazalım
        //3. çıkan sonuçların hepsini bir listeye atayalım
        //4. listedeki birinci elemana tıklayalım.



        driver.get("https://amazon.com.tr");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        WebElement aramaKutusu= driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        aramaKutusu.sendKeys("selenium" + Keys.ENTER);


        List<WebElement> urunListesi = driver.findElements(By.xpath("//div[@class='sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']"));
        System.out.println(urunListesi.size());
        WebElement ilkUrun= urunListesi.get(0);
        ilkUrun.click();

        Thread.sleep(5000);
        driver.close();



    }
}
