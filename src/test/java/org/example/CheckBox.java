package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CheckBox {
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
    public void testCheckBox() throws InterruptedException {
        driver.findElement(By.id("bmwcheck")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("benzcheck")).click();
        Thread.sleep(3000);
        boolean ans1=driver.findElement(By.id("benzcheck")).isSelected();
assertEquals(true,ans1);

        boolean ans=driver.findElement(By.id("hondacheck")).isSelected();
        assertFalse(ans);
        Thread.sleep(3000);
    }
    @After

    public void earDown(){
        driver.close();
    }

}
