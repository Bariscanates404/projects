package BasicDriverMEthods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethodlari {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver","/Users/bariscanates/selenium/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();


        //arguman olarak yazdigimiz url'e gider.
        driver.get("https://www.amazon.com");

        //halihazirda acik olan web sayfasinin title'ini string olarak bize geri döndürür.
        System.out.println("amazon title: " + driver.getTitle());

        //halihazırda acik olan web sayfasının urlini bize string olarak döndürür.
        System.out.println("current url: " + driver.getCurrentUrl());

        //halihazirda acik olan web sayfasnin kaynak kodlarini bize string olarak döndürür.
        System.out.println("source code: " + driver.getPageSource());

        //halihazırda acik olan pencerenin hash codunu bize string olarak geri döndürür.
        System.out.println("window hash codu: " + driver.getWindowHandle());


        driver.close();










    }
}
