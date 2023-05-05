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

public class ActionHover {
    public WebDriver driver;
    public String url="https://www.letskodeit.com/practice";
@Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void testMouseHover() throws InterruptedException {
        Actions action=new Actions(driver);
        WebElement mouseHover=driver.findElement(By.id("mousehover"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mouseHover);
        action.moveToElement(mouseHover).perform();
        Thread.sleep(3000);

        WebElement top=driver.findElement(By.linkText("Top"));
        action.moveToElement(top).click().perform();
        Thread.sleep(3000);

        WebElement reload=driver.findElement(By.xpath("//*[@id=\"mouse-hover-example-div\"]/div[1]/fieldset/div/div/a[2]"));
        action.moveToElement(reload).click().perform();
        Thread.sleep(3000);
    }

    @After
    public void tearDown(){
    driver.close();
    }
}
