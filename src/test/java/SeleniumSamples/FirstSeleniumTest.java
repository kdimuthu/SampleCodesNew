package SeleniumSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstSeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
      //  System.setProperty("webdriver.chrome.driver", "/D:/SampleCodesNew/src/libs/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "./src/libs/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();
        String ActualTitle = driver.getTitle();
        String ExpectedTitle="Amazon.com. Spend less. Smile more.";
        if(ActualTitle.equalsIgnoreCase(ExpectedTitle)){
            System.out.println("Title Matches");
        }
        else{
            System.out.println(ActualTitle);
        }
        //Locate a web element

        String tagname=" ";
        tagname = driver.findElement(By.cssSelector(".nav-search-facade")).getText();
        System.out.println(tagname);
        WebElement amazonlink;
        WebDriverWait wait = new WebDriverWait(driver, 10);
        amazonlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/div[1]/a")));
        amazonlink.click();
        WebElement category = driver.findElement(By.cssSelector(".nav-search-facade"));
        Actions action = new Actions(driver);
        action.moveToElement(category).perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Books")).click();
        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }
}
