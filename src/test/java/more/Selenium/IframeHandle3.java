package more.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IframeHandle3 {

    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void testCategory() throws InterruptedException {
        //WebElement find=driver.findElement(By.id("courses-iframe"));
        Thread.sleep(4000);
        driver.switchTo().frame(0);// use the index(here it is at 0th position because its only 1 iframe
        Thread.sleep(4000);

        WebElement find1=driver.findElement(By.className("categories"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",find1);
        find1.click();

        driver.switchTo().defaultContent();
        WebElement honda= driver.findElement(By.id("hondacheck"));
        Thread.sleep(3000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",honda);
        honda.click();



    }
    @After
    public void tearDown(){
        driver.close();
    }
}