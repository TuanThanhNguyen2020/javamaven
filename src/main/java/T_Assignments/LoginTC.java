package T_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTC {
    WebDriver driver;
    @BeforeTest
    void homePage(){
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        driver = new FirefoxDriver();


    }
    @Test
    void selectCountry() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        Select select = new Select(driver.findElement(By.name("country")));
        select.selectByVisibleText("MONACO");
        select.selectByVisibleText("ANGOLA");
        Thread.sleep(3000);
    }

}
