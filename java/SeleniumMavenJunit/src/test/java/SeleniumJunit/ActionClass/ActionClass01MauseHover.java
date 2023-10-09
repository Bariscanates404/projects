package SeleniumJunit.ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionClass01MauseHover {

    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://amazon.com");

        Actions actions = new Actions(driver);
        WebElement languageSelection = driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']//span[@class='nav-line-2']"));
        actions.moveToElement(languageSelection).perform();
        driver.findElement(By.xpath("(//a[@href='#switch-lang=de_DE'])[1]")).click();


        Thread.sleep(5000);
        WebElement languageSelection2 = driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']//span[@class='nav-line-2']"));
        actions.moveToElement(languageSelection2).perform();
        driver.findElement(By.xpath("(//a[@href='#switch-lang=en_US'])[1]")).click();
        Thread.sleep(5000);



    }




}
