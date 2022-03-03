package SeleniumSamples.KeyBoardActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class KeyBoardActions {


    WebDriver driver;

    @Test
    public void KeyDown() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        // Enter "WebDriver" text and perform "ENTER" keyboard action
        driver.findElement(By.name("q")).sendKeys("WebDriver" + Keys.ENTER);
        Actions actionProvider = new Actions(driver);
        Action keyDown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
        keyDown.perform();
    }

    @Test
    public void KeyUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        // Store google search box WebElement
        WebElement search = driver.findElement(By.name("q"));
        // Enters text "qwerty" with keyDown SHIFT key and after keyUp SHIFT key (QWERTY)
        action.keyDown(Keys.SHIFT).sendKeys(search,"qwerty").keyUp(Keys.SHIFT).sendKeys("qwerty").perform();

    }

}
