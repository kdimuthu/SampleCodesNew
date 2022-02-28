package SeleniumSamples.DragAndDropExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropSample1 {
    WebDriver driver;

    @Test
    public void DoDragAndDrop(){

        WebDriverManager.chromedriver().setup();
        //  System.setProperty("webdriver.chrome.driver", "./src/libs/chromedriver.exe");
        driver=new ChromeDriver();
        //Open the application
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().maximize();
        //Locate source element
        WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
        //Target element
        WebElement targetElement = driver.findElement(By.xpath("//div[@id='draggable']/following::div[@id='droppable'][1]"));
        Actions actionProvider = new Actions(driver);
        actionProvider.dragAndDrop(sourceElement, targetElement).build().perform();

    }

    @Test
    public void ClickAndHoldAndRelease(){

        WebDriverManager.chromedriver().setup();
        //  System.setProperty("webdriver.chrome.driver", "./src/libs/chromedriver.exe");
        driver=new ChromeDriver();
        //Open the application
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().maximize();
        //Locate source element
        WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
        //Target element
        WebElement targetElement = driver.findElement(By.xpath("//div[@id='draggable']/following::div[@id='droppable'][1]"));
        Actions actionProvider = new Actions(driver);
        actionProvider.clickAndHold(sourceElement).moveToElement(targetElement).build().perform();
        // Performs release event
        actionProvider.release().build().perform();

    }

    @Test
    public void DragAndDropUsingJavaScriptExecutor(){

        WebDriverManager.chromedriver().setup();
        //  System.setProperty("webdriver.chrome.driver", "./src/libs/chromedriver.exe");
        driver=new ChromeDriver();
        //Open the application
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().maximize();
        //Locate source element
        WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
        //Target element
        WebElement targetElement = driver.findElement(By.xpath("//div[@id='draggable']/following::div[@id='droppable'][1]"));
        Actions actionProvider = new Actions(driver);
        actionProvider.dragAndDrop(sourceElement, targetElement).build().perform();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
                + "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
                + "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
                + "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
                + "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
                + "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
                + "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
                + "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
                + "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
                + "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
                + "var dropEvent = createEvent('drop');\n"
                + "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
                + "var dragEndEvent = createEvent('dragend');\n"
                + "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
                + "var source = arguments[0];\n" + "var destination = arguments[1];\n"
                + "simulateHTML5DragAndDrop(source,destination);", sourceElement, targetElement);


    }
}
