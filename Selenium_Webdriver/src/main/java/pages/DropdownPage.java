package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {

    private  WebDriver driver ;
    private  By dropdownElement = By.id("dropdown");



    public DropdownPage(WebDriver driver) {
        this.driver = driver ;
    }

    public void selectOptionFromDrobdown (String option){
        getDropdown().selectByVisibleText(option);
    }

    public List <String> getSelectedOpstions (){
     List <WebElement> selectedOptions = getDropdown().getAllSelectedOptions();
        return selectedOptions.stream().map(e->e.getText()).collect(Collectors.toList());
    }





    private Select getDropdown (){

        return new Select(driver.findElement(dropdownElement));


    }



















}
