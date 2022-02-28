package SeleniumSamples.Waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DifferentTypeOfWaits {

    WebDriver driver;

    @Test
    public void Wait(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
        driver.findElement(By.name("userName")).sendKeys("dimuthu");
        //Implicit Waits
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Explicit waits
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='userName']")));

        //This is how to put multiple explicit waits
        /*First Way*/
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='userName'] | //input[@name='password']"))).click();

    /*    Second Way*/
        wait.until(ExpectedConditions.or(
                ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='userName']")),
                ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))));
    }
}
