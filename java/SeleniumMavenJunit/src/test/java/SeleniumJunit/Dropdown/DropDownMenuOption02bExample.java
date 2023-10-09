package SeleniumJunit.Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDownMenuOption02bExample {


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
        //1- https://the-internet.herokuapp.com/dropdown sitesine gidin.
        //2- dropdown elementini locate ediniz.
        //3- 1. indexteki optionu seçelim ve bunun "Option 1" olduğunu test edelim.
        //4- 2. indexteki optionu seçelim ve bunun "Option 2" olduğunu test edelim.
        //5- dropdown menunun optionları toplamının 2 olduğunu test edelim.


        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement ddm= driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select= new Select(ddm);
        select.selectByIndex(1);
        Assert.assertEquals("Option 1",select.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        select.selectByIndex(2);
        Assert.assertEquals("Option 2",select.getFirstSelectedOption().getText());

        List<WebElement> optionList = select.getOptions();

        int actualOptionSayisi= optionList.size();
        int expectedOptionsayisi=3;

        Assert.assertEquals(expectedOptionsayisi,actualOptionSayisi);

    }






}
