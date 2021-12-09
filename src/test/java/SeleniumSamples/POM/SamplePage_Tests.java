package SeleniumSamples.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SamplePage_Tests {

     WebDriver driver;
     SamplePage _SamplePage;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "./src/libs/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
    }

    @Test
    public void test() {
        _SamplePage=new SamplePage(driver);
        _SamplePage.ClickClink();
    }
}
