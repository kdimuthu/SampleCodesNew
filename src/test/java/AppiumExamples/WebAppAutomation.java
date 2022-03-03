package AppiumExamples;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WebAppAutomation {

    AppiumDriver driver;

    @Test
    public void setUp() throws MalformedURLException
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
    //    capabilities.setCapability(CapabilityType.VERSION, "5.1");
        driver = new AppiumDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//input[@id='nav-search-keywords']")).sendKeys("Harry porter gifts");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
     //   driver.quit();
    }
}
