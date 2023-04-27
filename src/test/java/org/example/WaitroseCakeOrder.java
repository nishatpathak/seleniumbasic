package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitroseCakeOrder {
    static WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void waitRose() throws InterruptedException {
        driver.get("https://www.waitrose.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/section/div[2]/button[2]")).click();//accept cookies
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"slide-out-navigation\"]/div[2]/a[1]")).click();//food to order
        Thread.sleep(4000);
        driver.findElement(By.className("anchor___1NIVR")).click();//cakes to order
        Thread.sleep(4000);
        driver.findElement(By.className("label___3jkaq")).click();//Personalised Cakes button
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"tPp596602-706053-706054\"]/div[2]/section[2]/div/div/a/span")).click();//10 birthday cake
        Thread.sleep(5000);
        driver.findElement(By.className("input___1YlS1")).sendKeys("Happy BIG birthday my BIG baby girl!!");//my message is
        Thread.sleep(5000);
        driver.findElement(By.linkText("Add to Trolley")).click();//add to trolley
        Thread.sleep(5000);
    }
    @After
    public void tearDown(){
        driver.close();
    }

    }

