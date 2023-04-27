package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrlWithJunit {
    static WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void OpenAsdaUrl() throws InterruptedException {

        driver.get("https://www.asda.com/");
        Thread.sleep(2000);

    }
    @Test
    public void OpenSportsDirectUrl() throws InterruptedException {

        driver.get("https://www.sportsdirect.com/");
        Thread.sleep(2000);

    }
    @Test
    public void OpenSmythsUrl() throws InterruptedException {

        driver.get("https://www.smythstoys.com/uk/en-gb");
        Thread.sleep(3000);

    }
    @After
    public void tearDown(){
        driver.close();
    }
}
