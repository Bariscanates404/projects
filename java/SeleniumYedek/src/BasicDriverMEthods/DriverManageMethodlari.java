package BasicDriverMEthods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethodlari {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver","/Users/bariscanates/selenium/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com.tr");

        //halihazırda açık olan web sayfasını tam ekran haline getirir.
        driver.manage().window().maximize();

        //halihazırda açik olan web sayfasında arguman olarak verilen saniye kadar bekler ve sonra çalışmaya devam eder.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //halihazırda açik olan web sayfasının pixel boyutunu string olarak geri döndürür..
        System.out.println("pixel: " +driver.manage().window().getSize());

        //halihazırda açık olan ekranın yuksekliğini strign olarak bize geri döndürür.
        System.out.println("pixel width: " +driver.manage().window().getSize().width);



        driver.close();



    }
}
