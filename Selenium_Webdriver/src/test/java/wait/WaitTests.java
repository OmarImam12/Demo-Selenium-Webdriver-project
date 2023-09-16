package wait;

import base.BaseTests;
import org.testng.Assert.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {


@Test
    public void testWaitUntilHidden () {
    var example2Page = homePage.clickDynamicLoadingLink().clickExample2();
        example2Page.clickStartButton();
      assertEquals( example2Page.getText(), "Hello World!" );





    }










}
