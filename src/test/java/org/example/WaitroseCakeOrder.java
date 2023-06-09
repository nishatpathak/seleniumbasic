package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitroseCakeOrder {
    public WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test//
    public void waitRose() throws InterruptedException {
        driver.get("https://www.waitrose.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/section/div[2]/button[2]")).click();//accept cookies
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"cms-body-content\"]/nav/span[4]/a/span")).click();//food to order
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[2]/header/div[3]/section[1]/div/div[2]/div/div/section[3]/div/section[4]/div/section[1]")).click();//cakes to order
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"tSr\"]/div/div[2]/button/span")).click();//load more
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"tPp596602-706053-706054\"]/div[2]/section[1]/header/a/h2")).click();//10th birthday cake
        Thread.sleep(3000);
       // driver.findElement(By.xpath("//*[@id=\"tPp596602-706053-706054\"]/div[2]/section[2]/div/div/a/span")).click();//10 birthday cake
        //Thread.sleep(5000);
        driver.findElement(By.className("input___Q46aJ")).sendKeys("Happy birthday my girl!!");//my message is
        Thread.sleep(5000);
        driver.findElement(By.id("tAbtn-596602-706053-706054")).click();//add to trolley
        Thread.sleep(5000);
    }
    @After
    public void tearDown(){
        driver.close();
    }

    }

