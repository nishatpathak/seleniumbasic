package more.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class OpenNewTab {
    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
@Test
    public void testOpenNewTab() throws InterruptedException {
        driver.findElement(By.id("opentab")).click();

        ArrayList<String> newTab=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        WebElement newWindow= driver.findElement(By.xpath("//input[@id=\"search\"]"));
        newWindow.sendKeys("Python");
        Thread.sleep(3000);

        driver.switchTo().window(newTab.get(0));
        WebElement parentWindow=driver.findElement(By.id("benzcheck"));
        parentWindow.click();
        Thread.sleep(3000);

}
    @After
    public void tearDown() {
        driver.quit();
    }
}
