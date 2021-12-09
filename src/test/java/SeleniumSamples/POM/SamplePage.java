package SeleniumSamples.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SamplePage {

     WebDriver driver;

    private By lnk_SIGN_ON = By.xpath("//a[text()='SIGN-ON']");

    public SamplePage(WebDriver driver) {

        this.driver = driver;
    }



    public void ClickClink(){
        driver.findElement(lnk_SIGN_ON).click();
    }

}
