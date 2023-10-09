package WebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath03 {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver", "/Users/bariscanates/selenium/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();



        //trendyol sorusu
        //1. https://www.trendyol.com/ a gidiniz.
        //2. arama cubuguna selenium yazıp arayınız.
        //3. arama sonucları arasında çıkan 1. elemana tıklayalım.
        //4. ürünün fiyatını bir değişkene atıyalım ve eğer fiyatı 200 tlden yuksek ise pahalı değil ise ucuz yazdıralım. (double işinizi kolaylaştırabilir)


        String trendyolLink = "https://www.trendyol.com/";

        //test01
        driver.get(trendyolLink);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement aramaCubugu = driver.findElement(By.xpath("//input[@class='V8wbcUhU']"));
        aramaCubugu.sendKeys("selenium" + Keys.ENTER);

        WebElement ilkUrun = driver.findElement(By.xpath("(//div[@class='p-card-chldrn-cntnr card-border'])[1] //a"));
        //buraya dikkat edelim!!

        driver.get(ilkUrun.getAttribute("href"));

        WebElement fiyatEtiketi = driver.findElement(By.xpath("//div[@class='product-price-container']//span"));


        int fiyat = Integer.parseInt(fiyatEtiketi.getText().replace(" TL", ""));

        if (fiyat > 200) {
            System.out.println("Pahalı!!!");
        } else System.out.println("Ucuz!!!");


        driver.close();


    }
}
