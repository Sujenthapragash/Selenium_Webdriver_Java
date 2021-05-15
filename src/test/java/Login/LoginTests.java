package Login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurePage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTest {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecurePage securePage = loginPage.clickLoginButton();
        assertTrue (securePage.getAlertText().contains("You logged into a secure area!"),"Alert Text Incorrect");
    }

}
