package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrlWithJunit2 {
    static WebDriver driver;
    @Before
    public void setup1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();}
@Test
        public void openNopCommerce() throws InterruptedException {
            driver.get("https://demo.nopcommerce.com/");
            Thread.sleep(3000);
            driver.findElement(By.className("ico-register")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("gender-female")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("FirstName")).sendKeys("Nisha");
            Thread.sleep(3000);
            driver.findElement(By.id("LastName")).sendKeys("Pathak");
            Thread.sleep(3000);
            driver.findElement(By.name("DateOfBirthDay")).sendKeys("3");
            Thread.sleep(3000);
            driver.findElement(By.name("DateOfBirthMonth")).sendKeys("february");
            Thread.sleep(3000);
            driver.findElement(By.name("DateOfBirthYear")).sendKeys("1986");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@name=\'Email\']")).sendKeys("nisha@hotmail.com");
            Thread.sleep(3000);
    }
    @After
    public void tearDown(){
        driver.quit();

    }
}
