package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DynamicLoadingExample2Page {

    private WebDriver driver ;
    private  By startButton = By.tagName("button");
    private  By finishText = By.id("finish");

    public DynamicLoadingExample2Page(WebDriver driver ) {
        this.driver = driver ;
    }

    public void clickStartButton (){
        driver.findElement(startButton).click();

        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(finishText));

    }


    public String getText (){
       return driver.findElement(finishText).getText();
    }





}
