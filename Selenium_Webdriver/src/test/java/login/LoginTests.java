package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SecureAreaPage;

import static org.testng.Assert.*;


public class LoginTests extends BaseTests{
    @Test
    public void testSuccessfullLogin (){
        var loginPage = homePage.clickFormAuthenticationLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
       assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));
    }


}
