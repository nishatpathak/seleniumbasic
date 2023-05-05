package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class EnableAndDisable {
    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";

    @Before
public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);}
    @Test
        public void testEnableDisable() throws InterruptedException {

        driver.findElement(By.id("disabled-button")).click();
        Thread.sleep(3000);
        boolean ans= driver.findElement(By.id("enabled-example-input")).isEnabled();
        assertFalse(ans);


        driver.findElement(By.id("enabled-button")).click();
        Thread.sleep(3000);
        boolean ans1=driver.findElement(By.id("enabled-button")).isEnabled();
        driver.findElement(By.id("enabled-example-input")).sendKeys("well done");
        Thread.sleep(5000);


        assertTrue(ans1);

    }
    @After
    public void tearDown(){
    driver.close();
    }
}