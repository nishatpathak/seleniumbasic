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

public class IframeHandle2 {
        public WebDriver driver;
        public String url = "https://www.letskodeit.com/practice";

        @Before
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
@Test
        public void iframeTest() throws InterruptedException {
            WebElement iframe= driver.findElement(By.id("courses-iframe"));
            Thread.sleep(3000);
            driver.switchTo().frame(iframe);
            Thread.sleep(3000);

            WebElement blog=driver.findElement(By.className("dynamic-link"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",blog);
            blog.click();


        }
        @After
        public void tearDown(){
            driver.close();
        }

    }

