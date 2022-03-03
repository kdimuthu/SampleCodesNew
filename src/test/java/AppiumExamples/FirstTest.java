package AppiumExamples;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class FirstTest {
    AppiumDriver driver;

    @Test
    public void setUp() throws MalformedURLException
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.fqms");
        capabilities.setCapability("appActivity","com.fqms.MainActivity");
        driver = new AppiumDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText[@text='Phone number']")).sendKeys("786776767");
        driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
        driver.findElementByXPath("//android.widget.EditText[@text='Pin number']").sendKeys("345");
        driver.quit();
    }

}
