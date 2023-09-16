package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver ;
    private By Example2_Link = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage (WebDriver driver){
        this.driver = driver ;
    }

    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(Example2_Link).click();
        return new DynamicLoadingExample2Page (driver);
    }







}
