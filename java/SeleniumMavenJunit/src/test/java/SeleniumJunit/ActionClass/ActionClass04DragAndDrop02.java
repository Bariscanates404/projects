package SeleniumJunit.ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionClass04DragAndDrop02 {
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

        driver.get("https://demoqa.com/dragabble");

        Actions actions = new Actions(driver);

        WebElement cursor = driver.findElement(By.xpath("//a[@id='draggableExample-tab-cursorStyle']"));
        actions.moveToElement(cursor).click().perform();

        WebElement ele1= driver.findElement(By.xpath("//div[@id='cursorCenter']"));
        WebElement ele2= driver.findElement(By.xpath("//div[@id='cursorTopLeft']"));
        WebElement ele3= driver.findElement(By.xpath("//div[@id='cursorBottom']"));

        actions.clickAndHold(ele1).moveToElement(ele2).release().clickAndHold(ele3).moveToElement(ele1).release().perform();


        Thread.sleep(5000);





    }
}
