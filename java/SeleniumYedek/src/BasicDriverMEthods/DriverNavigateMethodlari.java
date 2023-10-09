package BasicDriverMEthods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverNavigateMethodlari {
    public static void main(String[] args) {

        System.getProperty("webdriver.chrome.driver","/Users/bariscanates/selenium/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com.tr");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //driver.get("url") methodu ile birebir aynı işi yapar. argüman olarak verilen string urle sayfayı yönlendirir.
        driver.navigate().to("https://google.com.tr");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //halihazırda açık olan web sayfasında back işlemini yapar. (click "back" to go back)
        driver.navigate().back();

        //halihazırda açık olan web sayfasında forward işlemini yapar.
        driver.navigate().forward();

        //halihazırda açık olan web sayfasını refreshler.
        driver.navigate().refresh();



        driver.close();

    }
}
