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

import java.util.ArrayList;

public class SwitchWindow1 {
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
    public void testSwitchWindow() throws InterruptedException {
        driver.findElement(By.id("openwindow")).click();
        ArrayList<String>newWindow=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newWindow.get(1));
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",newWindow);

        WebElement courseName=driver.findElement(By.className("dynamic-heading"));
        courseName.click();
        Thread.sleep(3000);
        //Where to put the mousehover action?

        driver.switchTo().window(newWindow.get(0));
        WebElement parentWindow=driver.findElement(By.id("benzcheck"));
        parentWindow.click();
        Thread.sleep(3000);
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
