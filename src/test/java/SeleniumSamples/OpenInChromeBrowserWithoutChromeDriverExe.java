package SeleniumSamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenInChromeBrowserWithoutChromeDriverExe {

    WebDriver driver;

    @Test
    public void Login(){

        WebDriverManager.chromedriver().setup();
      //  System.setProperty("webdriver.chrome.driver", "./src/libs/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
        driver.findElement(By.name("userName")).sendKeys("dimuthu");

    }
}
