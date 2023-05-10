package more.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public WebDriver driver;
    String url = "https://jqueryui.com/droppable/";

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void testDragAndDrop() throws InterruptedException {
        driver.switchTo().frame(0);
        WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        Thread.sleep(2000);
        WebElement drop=driver.findElement(By.id("droppable"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(drag,drop).perform();
        Thread.sleep(2000);
    }
    @After
        public void tearDown(){
        driver.quit();
    }
}
