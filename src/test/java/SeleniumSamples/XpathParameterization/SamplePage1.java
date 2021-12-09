package SeleniumSamples.XpathParameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SamplePage1 {

     WebDriver driver;



    String prm_Name;

    String lnk_SIGN_ON = "//a[text()='"+prm_Name+"']";


    public SamplePage1(WebDriver driver) {

        this.driver = driver;
    }



    public void ClickClink(){
        prm_Name="SIGN-ON";
        driver.findElement(By.xpath(lnk_SIGN_ON)).click();
    }

}
