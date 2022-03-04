package AppiumExamples;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class AppiumServerRunUsingAnyPort {

    private AppiumDriver driver;
    private AppiumDriverLocalService server;

    @BeforeTest
    public void startAppiumServer() {
        AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
        // Use any port, in case the default 4723 is already taken (maybe by another Appium server)
        serviceBuilder.usingAnyFreePort();
       // serviceBuilder.usingPort(4890);
        // Tell serviceBuilder where node is installed. Or set this path in an environment variable named NODE_PATH
        serviceBuilder.usingDriverExecutable(new File("C:/Program Files/nodejs/node.exe"));

//        // Tell serviceBuilder where Appium is installed. Or set this path in an environment variable named APPIUM_PATH
        serviceBuilder.withAppiumJS(new File("C:/Users/dimuthur/AppData/Local/Programs/Appium Server GUI/resources/app/node_modules/appium/build/lib/main.js"));
       // serviceBuilder.withAppiumJS(new File(System.getenv("APPIUM_PATH")));
        // The XCUITest driver requires that a path to the Carthage binary is in the PATH variable. I have this set for my shell, but the Java process does not see it. It can be inserted here.
        HashMap<String, String> environment = new HashMap();
        environment.put("PATH", "/usr/local/bin:" + System.getenv("PATH"));
        serviceBuilder.withEnvironment(environment);
        server = AppiumDriverLocalService.buildService(serviceBuilder);
        server.start();

    }
    @Test
    public void setUp() throws MalformedURLException
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        //capabilities.setCapability(CapabilityType.VERSION, "5.1");
        driver = new AppiumDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//input[@id='nav-search-keywords']")).sendKeys("Harry porter gifts");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.quit();
    }


    @AfterTest
    public void stopAppiumServer() {
        server.stop();
    }
}
