package TestNGSampels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGTestsWIthBeforeTest {

    WebDriver driver;

    @BeforeTest
    public void OpenApp() {
        // System.setProperty("webdriver.chrome.driver", "/D:/SampleCodesNew/src/libs/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "./src/libs/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test(priority = 1,enabled = false)
    public void Login() {
        System.out.println("Test");


        driver.get("http://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
        driver.findElement(By.name("userName")).sendKeys("dimuthu");
        String actualTest = driver.findElement(By.xpath("")).getText();
        String expectedTest = "";
        Assert.assertEquals(actualTest, expectedTest);
    }

    @Test(priority = 2,enabled = false)
    public void Login1() {
        System.out.println("Test");

        driver.get("http://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
        driver.findElement(By.name("userName")).sendKeys("dimuthu");
        String actualTest = driver.findElement(By.xpath("")).getText();
        String expectedTest = "";
        Assert.assertEquals(actualTest, expectedTest);
    }

    @AfterTest
    public void CloseApp() {
        driver.close();
    }

}
