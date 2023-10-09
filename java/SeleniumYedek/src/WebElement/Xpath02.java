package WebElement;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath02 {
    public static void main(String[] args) throws InterruptedException {

        System.getProperty("webdriver.chrome.driver", "/Users/bariscanates/selenium/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();

        //test 01
        //1. https://testpages.herokuapp.com/styled/basic-web-page-test.html  sitesine gidiniz.
        //2. ana başlıkta bulunan texti bir değişkene atayınız.
        //3. bu başlığın içerisinde "Basic Web Page" metninin var olup olmadığını test ediniz.

        //test02
        //1. https://testpages.herokuapp.com/styled/basic-web-page-test.html  sitesine gidiniz.
        //2. id=para1 ve id=para2 elementlerini locate ediniz.
        //3. bu elementlerin textlerini bir değişkene atayın ve birbirleri ile aynı olmadıklarını test edin. (false dönecek)
        //4. bu textlerin 15 karakterden uzun olup olmadığını test edin.





        //test01
        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement anaBaslik = driver.findElement(By.xpath("//div[@class='page-body']//h1"));
        String anabaslik01= anaBaslik.getText();
        if (anabaslik01.contains("Basic Web Page")){
            System.out.println("evet aranan metin başlıkta var!");
        }else System.out.println("aranan metin başlıkta yok!");


        driver.close();

        //test02
        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement para1= driver.findElement(By.xpath("//*[@id='para1']"));
        WebElement para2= driver.findElement(By.xpath("//*[@id='para2']"));

        String para1Text=para1.getText();
        String para2Text=para2.getText();

        if (para1Text.equals(para2Text)){
            System.out.println("textler aynıdır!");
        }else System.out.println("textler farklıdır!!!");


        if (para1Text.length()>15 && para2Text.length()>15){
            System.out.println("textler 15 karakterden büyüktür!!!");
        }else System.out.println("textler kucuktur!!");

        Thread.sleep(5000);
        driver.close();
    }
}
