package SeleniumJunit.Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDownMenu01bExample {


    WebDriver driver;

    @Before
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void TearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }


    @Test
    public void radioButtonTest() throws InterruptedException {
        //1- amazon.com a gidelim
        //2- drowdownmenuyu locat edelim
        //3- dropdown menu içerisinden pet supplies kategorisi seçelim.
        //4- arama kutusuna "cat bed" yazalım ve arama yapalım.
        //5- filter menu den Majestic Cat markasına tıklayalım.
        //6- up to 25$ a tıklayalım
        //7- gelen sonuç sayısının 9 olduğunu test edelim. (Assert.assertTrue((listeye atılmış elementlerin length'i)==9))



        //1- amazon.com a gidelim
        driver.get("https://www.amazon.com/");
        //2- drowdownmenuyu locat edelim
        WebElement dropDownMenu= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        //3- dropdown menu içerisinden pet supplies kategorisi seçelim.
        Select select=new Select(dropDownMenu);
        select.selectByVisibleText("Pet Supplies");
        //4- arama kutusuna "cat bed" yazalım ve arama yapalım.
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("cat bed" + Keys.ENTER);
        //5- filter menu den Majestic Cat markasına tıklayalım.
        driver.findElement(By.xpath("//li[@id='p_89/Majestic Pet']//i[@class='a-icon a-icon-checkbox']")).click();
        Thread.sleep(5000);
        //6- up to 25$ a tıklayalım
        driver.findElement(By.xpath("//span[contains(text(),'Up to $25')]")).click();
        //7- gelen sonuç sayısının 9 olduğunu test edelim. (Assert.assertTrue((listeye atılmış elementlerin length'i)==9))
        Thread.sleep(10000);
        List<WebElement> countOfResults = driver.findElements(By.cssSelector(".a-section.a-spacing-base"));
        Assert.assertEquals(9, countOfResults.size());
        Thread.sleep(5000);

    }



}
