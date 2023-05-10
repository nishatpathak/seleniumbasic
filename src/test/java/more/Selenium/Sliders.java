package more.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {
    public WebDriver driver;
    public String url = "https://www.flipkart.com/";

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
@Test
public void testSliders() throws InterruptedException {
        driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2doB4z\"]")).click();
        WebElement search=driver.findElement(By.className("_3704LK"));
        search.sendKeys("watch");
        search.sendKeys(Keys.ENTER);;
        Thread.sleep(4000);

        WebElement sliderForward=driver.findElement(By.xpath("//*[@class=\"_3FdLqY\"]"));
        Thread.sleep(2000);
    Actions action=new Actions(driver);
    Thread.sleep(4000);
    action.dragAndDropBy(sliderForward,50,0).perform();
    Thread.sleep(4000);
}
@After
    public void tearDown(){
        driver.quit();
    }
}
