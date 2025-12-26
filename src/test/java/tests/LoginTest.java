package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(groups = {"smoke"})
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("tomsmith", "SuperSecretPassword!");

        String message = loginPage.getSuccessMessage();
        Assert.assertTrue(message.contains("You logged into a secure area"));
    }

    @Test(groups = {"regression"})
    public void invalidLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("wrongUser", "wrongPass");

        String message = loginPage.getSuccessMessage();
        Assert.assertTrue(message.contains("Your username is invalid"));
    }
}
