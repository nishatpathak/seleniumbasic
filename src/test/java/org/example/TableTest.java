package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

public class TableTest {
    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Actions action=new Actions(driver);
    }
    @Test
    public void testWebTable() throws InterruptedException {
        WebElement mouseHover=driver.findElement(By.id("mousehover"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mouseHover);
        driver.findElement(By.xpath("//*[@id=\"table-example-div\"]"));
        Thread.sleep(3000);
    }




}
