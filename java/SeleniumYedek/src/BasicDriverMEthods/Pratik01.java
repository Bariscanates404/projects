package BasicDriverMEthods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratik01 {
    public static void main(String[] args) {

        System.getProperty("webdriver.chrome.driver","/Users/bariscanates/selenium/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();

        // google sayfasını açın ve sayfanın titlenı consola bastırın,
        // 10 saniye bekleyin facebook sayfasını açın ve sayfanın titlenı consola bastırın,
        // 10 saniye bekleyin geri tuşuna basın ve sayfanın titlenı consola bastırın.


        //amazon.com.tr yi açın, önce title'ı String bir değişkene atayın sonra window hash codunu string bir değişkene atayın bastırın.
        //sayfayı yenileyin, tek bir string değişkene atayın window hash codunu farklı bir string değişkene atayın.
        //driveri kapatın ve 1. title ile 2. title'ın aynı olup olmadıgını kontrol edin. Eğer aynı ise consola title'lar aynıdır yazdırın.
        //değil ise title'lar farklıdır yazdırın. Aynı işlemi hash codeları içinde yapın.


        //html selectors xpath-css



        String title1=driver.getTitle();



    }
}
