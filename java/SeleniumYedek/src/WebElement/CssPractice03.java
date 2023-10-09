package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CssPractice03 {
    public static void main(String[] args) throws InterruptedException {

        System.getProperty("webdriver.chrome.driver", "/Users/bariscanates/selenium/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement aramaBari = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        aramaBari.click();
        Thread.sleep(1000);

        aramaBari.sendKeys("selenium");
        Thread.sleep(1000);

        WebElement araButtonu = driver.findElement(By.cssSelector("div.nav-search-submit.nav-sprite"));
        araButtonu.click();


        WebElement currentResultElementi= driver.findElement(By.cssSelector("div.a-section.a-spacing-small.a-spacing-top-small"));

        //burada bir elementin içerisinde bulunan texti bir String değişkene atama yapmayı görelim.
        String currentResultStringi= currentResultElementi.getText();
        //getText() methodu elementin içerisinde bulunan texti alır ve bize String olarak geri döndürür. String olarak geri döndürüğü için
        //biz String bir değişken içerisini bunu atayabiliriz.

        //karşılaştırma yapmak için bir beklenen text String değişkeni oluşturduk.
        String expectedResult = "85 sonuç arasından 1-48 arası gösteriliyor.";


        //webelementinden kazıdığımız String beklediğimiz stringden uzun olduğu için karışaltırma yapmak amacıyla ikisini
        // ilk nokta sembbolune kadar substring ile kısalttik.
        // Öncesi = 85 sonuç arasından 1-48 arası gösteriliyor. Aranan ürün: "selenium"
       currentResultStringi=currentResultStringi.substring(0,(currentResultStringi.indexOf(".")+1));
        // after = 85 sonuç arasından 1-48 arası gösteriliyor.


        //if ile Stringlerin aynı olup olmadığını karşılaştırdık.
        if (expectedResult.equals(currentResultStringi)){
            System.out.println("test passed!!!");
        }
        else System.out.println("test failed!!!");
        //ve sonuç olarak TEST PASSED!!! döndü.

        Thread.sleep(5000);
        driver.close();


    }
}
