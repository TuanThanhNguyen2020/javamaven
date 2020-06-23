package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelTest1 {

    WebDriver driver;
    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));
        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(3000);
    }


    @Test
    void homePageTitle() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
        Thread.sleep(3000);
    }
    @AfterClass
    void teardown(){
        driver.quit();
    }
}
