package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelTest2 {
    WebDriver driver;

    @Test
    void loginTest() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
         Thread.sleep(3000);
    }

    @AfterClass
    void tearDown(){
        driver.close();
    }
}
