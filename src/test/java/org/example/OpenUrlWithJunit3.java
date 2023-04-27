package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrlWithJunit3 {
    static WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
public void openYoutube() throws InterruptedException {
        driver.get("https://www.youtube.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button")).click();
    Thread.sleep(5000);
    driver.findElement(By.name("search_query")).sendKeys("joome jo pathan");
        Thread.sleep(5000);
        driver.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(8000);

    //driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
    //Thread.sleep(4000);
    driver.findElement(By.linkText("Jhoome Jo Pathaan Song | Shah Rukh Khan, Deepika | Vishal & Sheykhar, Arijit Singh, Sukriti, Kumaar")).click();
    Thread.sleep(5000);
    }
    @After
    public void tearDown(){
        driver.quit();
    }


}
