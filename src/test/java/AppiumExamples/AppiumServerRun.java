package AppiumExamples;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class AppiumServerRun {

    AppiumDriver driver;

    @Test
    public void setUp() throws MalformedURLException
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.fqms");
        capabilities.setCapability("appActivity","com.fqms.MainActivity");

        AppiumServiceBuilder builder=new AppiumServiceBuilder();
        builder.withIPAddress("0.0.0.0");
        builder.usingPort(4723);
        builder.withCapabilities(capabilities);
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
        AppiumDriverLocalService service=AppiumDriverLocalService.buildService(builder);

        driver = new AppiumDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//android.widget.EditText[@text='Phone number']")).sendKeys("786776767");
        driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
        driver.findElementByXPath("//android.widget.EditText[@text='Pin number']").sendKeys("345");
        driver.quit();
    }
}
