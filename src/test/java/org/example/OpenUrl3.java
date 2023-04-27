package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.bbc.co.uk");
        Thread.sleep(2000);
        driver.quit();

        WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver();

        driver1.manage().window().maximize();
        driver1.get("https://www.sainsburys.co.uk");
        Thread.sleep(2000);
        driver1.quit();


        WebDriverManager.chromedriver().setup();
        WebDriver driver2=new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://www.waitrose.com");
        Thread.sleep(2000);
        driver2.quit();



    }

}
