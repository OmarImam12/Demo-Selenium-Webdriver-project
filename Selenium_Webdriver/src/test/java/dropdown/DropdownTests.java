package dropdown;

import base.BaseTests;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTests {

    @Test

    public void  testDropdown (){
        String optionText = "Option 1" ;
        var dropdownPage = homePage.clickdropdownLink();
        dropdownPage.selectOptionFromDrobdown(optionText);
        assertEquals(dropdownPage.getSelectedOpstions().size() , 1 );
        assertTrue(dropdownPage.getSelectedOpstions().contains(optionText));

    }









}
