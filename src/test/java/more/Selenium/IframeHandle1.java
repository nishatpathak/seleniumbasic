package more.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IframeHandle1 {
    public WebDriver driver;
    public String url="https://www.letskodeit.com/practice";
@Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    //@Test
    //public void actionHover() throws InterruptedException {
      //  Actions action = new Actions(driver);
        //WebElement mouseHover = driver.findElement(By.className("dynamic-text"));
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",mouseHover);
        //action.moveToElement(mouseHover).perform();
        //Thread.sleep(3000);

   // }
@Test
public void testFrame() throws InterruptedException {
WebElement iframe=driver.findElement(By.id("courses-iframe"));
Thread.sleep(3000);
driver.switchTo().frame(iframe);
    Thread.sleep(3000);


    WebElement search = driver.findElement(By.xpath("//input[@class=\"form-control find-input dynamic-text\"]"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",search);

    search.sendKeys("Python");
    Thread.sleep(3000);

    search.sendKeys(Keys.ENTER);
}


    @After
    public void tearDown(){
        driver.close();
    }
}
