package TestNGSampels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNGTests {

    WebDriver driver;

    @Test
    public void Login(){

        System.setProperty("webdriver.chrome.driver", "/D:/SampleCodesNew/src/libs/chromedriver.exe");
        // System.setProperty("webdriver.chrome.driver", "./src/libs/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
        driver.findElement(By.name("userName")).sendKeys("dimuthu");
        String actualTest=driver.findElement(By.xpath("")).getText();
        String expectedTest="fdfkjkl";
        Assert.assertEquals(actualTest,expectedTest);
    }

}
