package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Xpath01 {
    public static void main(String[] args) {

        //        XPATH SYNTAX
        //  //tagname[@attribute='value']
        //
        //  relative selectors
        //  //div[@class='page-body']
        //
        //  parent child ile yukarıdan aşağıya doğru önce verilen 1. elementi bulur sonra o elementin childları içerisinde
        //  bulunan 2. locatorını verdiğimiz elementi arar.
        //
        // //body[@data-new-gr-c-s-check-loaded='14.1104.0']//div[@class='page-body']
        //
        //  aşağıda tagname i p olan elementler içerisinde 'para' textine sahil olan bütün elementleri aradık.
        //
        //  //p[contains(text(),'para')]
        //
        //  yukarıd ayaptığımız seçme işleminin bize döndürdüğü bütün elementler içerisinde 2. indexte bulunan elementi bize döndürmesini istedik.
        //
        //  (//p[contains(text(),'para')])[2]


        //   css locaterlarında bildiğiniz gibi xpath de bulunan text ile arama opsiyonu yoktur.
        //   tagname i div olan elementler içerisinde arama yap, bu elemetleri içerisinde ".c-icon__title" isimli classa sahip olan elementleri bul,
        //   ve bu elementlerin içerisinde 'Online' kelimesinin geçtiği elementi seç.

        //  ----->  div:has(.c-icon__title:contains('Online'))  JQuery selector


        //seçilen bir elementin parent nodu'una ulaşmak için kullandığımız /parent ve /ancestor komutları vardır. Bunları kullanabiliriz.

        //rfr: https://stackoverflow.com/questions/58062965/how-select-a-parent-node-with-xpath

        //a[normalize-space()='EvilTester.com']/ancestor::div
        //a[normalize-space()='EvilTester.com']/parent::div


        System.getProperty("webdriver.chrome.driver", "/Users/bariscanates/selenium/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();

        //test01
        driver.get("https://testpages.herokuapp.com/styled/find-by-playground-test.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement baslik01 = driver.findElement(By.xpath("//a[@href='https://eviltester.com']"));

        //   for (int i = 0; i < basliklar.size(); i++) {
        //       System.out.println(basliklar.get(i).getText());
        //   }

        System.out.println(baslik01.getText());


        driver.close();

    }
}
