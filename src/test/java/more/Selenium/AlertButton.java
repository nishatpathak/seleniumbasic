package more.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertButton {
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
    public void testAlertButton() throws InterruptedException {
    driver.findElement(By.id("name")).sendKeys("yes");
    Thread.sleep(3000);
    driver.findElement(By.id("alertbtn")).click();
    Thread.sleep(3000);
    driver.switchTo().alert().accept();

}
@Test

public void testConfirmButton() throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys("no");
    Thread.sleep(3000);
    driver.findElement(By.id("confirmbtn")).click();
    driver.switchTo().alert().dismiss();
    Thread.sleep(4000);


}
    @After
    public void tearDown(){
        driver.close();
    }
    }

