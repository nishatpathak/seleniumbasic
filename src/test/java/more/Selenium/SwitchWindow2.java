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

import java.util.ArrayList;

public class SwitchWindow2 {
    public WebDriver driver;
    String url="https://www.google.com/search?q=google&oq=goo&aqs=chrome.0.35i39i650j46i67i131i199i433i465i650j69i57j0i20i131i263i433i512j0i131i433i512j69i60l3.893j0j7&sourceid=chrome&ie=UTF-8#cobssid=s";
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        //driver.manage().deleteAllCookies();

    }
    @Test
    public void openNewWindow() throws InterruptedException {
        driver.findElement(By.id("L2AGLb")).click();///cookie
        Thread.sleep(3000);
       // driver.findElement(By.className("class=\"M2vV3 vOY7J\""));
        WebElement write=driver.findElement(By.id("input"));
        write.sendKeys("netflix");
        Thread.sleep(3000);

        write.sendKeys(Keys.ENTER);

        ArrayList<String>newWindow=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newWindow.get(1));

        WebElement opennetflix=driver.findElement(By.className("LC20lb MBeuO DKV0Md") );
        opennetflix.click();


    }
    @After
public void tearDown(){
        driver.quit();

    }
}
