package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.junit.Assert.assertEquals;


public class WebTableTest {
    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";
    String expectedText="Selenium WebDriver With Java";
    String expectedText1="35";
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

        String actualTableText=driver.findElement(By.xpath("//table[@id=\"product\"]/tbody/tr[2]/td[2]")).getText();
        System.out.println(actualTableText);
        assertEquals("Text is not expected.text is failed", expectedText,actualTableText);        Thread.sleep(3000);
        Thread.sleep(3000);

        String actualTableText1=driver.findElement(By.xpath("//table[@id=\"product\"]/tbody/tr[2]/td[3]")).getText();
        System.out.println(actualTableText1);
       assertEquals("number is expected",expectedText1,actualTableText1);



    }
    @After
    public void tearDown(){
        driver.close();
    }




}
