package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Xpath05 {
    public static void main(String[] args) throws InterruptedException {

        System.getProperty("webdriver.chrome.driver", "/Users/bariscanates/selenium/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();

        //xpath4 classında yaptığımız işlemin fiyat ortalaması versiyonunu yapalım

        driver.get("https://amazon.com.tr");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        WebElement aramaKutusu = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        aramaKutusu.sendKeys("selenium" + Keys.ENTER);


        List<WebElement> urunListesi = driver.findElements(By.xpath("//div[@class='sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']//span[@class='a-price-whole']"));
        System.out.println(urunListesi.size());

        int getApprx = 0;
        for (int i = 0; i < urunListesi.size(); i++) {
            System.out.println(urunListesi.get(i).getText());
            getApprx += Integer.parseInt(urunListesi.get(i).getText());
        }
        System.out.println("aranan urunun market fıyat ortamalası= " + (getApprx / urunListesi.size()));


        Thread.sleep(5000);
        driver.close();



    }
}
