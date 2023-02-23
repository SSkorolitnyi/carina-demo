package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.components.LoginPopUp;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebLoginTest implements IAbstractTest {
    @Test
    @MethodOwner(owner = "sskorolitnyi")
    public void checkUserLogInWorkAsExpected() {
        final String EMAIL = "hadhajfdjfjf@gmail.com";
        final String PASSWORD = "123123123f";
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        HeaderMenu headerMenu = homePage.getHeaderMenu();
        LoginPopUp loginPopUp = headerMenu.openLoginPopUp();
        Assert.assertTrue(loginPopUp.isPageOpened(), "Login page isn't opened!");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(loginPopUp.isEmailInputPopUpPresent(), "Email input isn't present!");
        softAssert.assertTrue(loginPopUp.isPasswordInputPopUpPresent(), "Password input isn't present!");
        softAssert.assertTrue(loginPopUp.isLoginButtonPopUpPresent(), "login button isn't present!");
        softAssert.assertTrue(loginPopUp.isIForgotMyPasswordPopUpPresent(), "I forgot my password isn't present!");
        softAssert.assertAll();
        loginPopUp.logInUser(EMAIL, PASSWORD);
    }
}
