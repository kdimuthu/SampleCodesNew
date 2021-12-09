package SeleniumSamples.XpathParameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SamplePage1_Tests {

     WebDriver driver;
     SamplePage1 _SamplePage;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "./src/libs/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
    }

    @Test
    public void test() {
        _SamplePage=new SamplePage1(driver);
        _SamplePage.ClickClink();
    }
}
