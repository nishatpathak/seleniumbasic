package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrlWithJunit1 {
    static WebDriver driver;
    @Before
            public void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
            public void openGoogle() throws InterruptedException {
        driver.get("https://www.google.com/search?q=google&oq=google&aqs=chrome..69i57.2350j0j7&sourceid=chrome&ie=UTF-8");
        Thread.sleep(2000);
    }
    @Test
    public void openNext() throws InterruptedException {
        driver.get("https://www.next.co.uk/");
        Thread.sleep(5000);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("header-big-screen-search-box")).click();
    }

    @After
            public void tearDown() {
        driver.close();
    }

}
