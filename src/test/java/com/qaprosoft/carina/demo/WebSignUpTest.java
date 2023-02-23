package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.gui.pages.SignUpPage;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebSignUpTest implements IAbstractTest {
    @Test
    @MethodOwner(owner = "sskorolitnyi")
    public void checkRegisterUserSuccessfully() {
        final String USERNAME = "Skdsksfkossdf";
        final String EMAIL = "cegijoy713@vootin.com";
        final String PASSWORD = "cdMa902050k";
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(),"Home page is not opened");
        SignUpPage signUpPage = homePage.getHeaderMenu().openSignUpPage();
        Assert.assertTrue(signUpPage.isPageOpened(),"SignUpPage isn't opened!");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(signUpPage.isUsernameInputPresent(),"Username input isn't present!");
        softAssert.assertTrue(signUpPage.isUserEmailInputPresent(),"Email input isn't present!");
        softAssert.assertTrue(signUpPage.isUserPassInputPresent(),"Password input isn't present!");
        softAssert.assertTrue(signUpPage.isIAgreeToStoreMyDataButtonPresent(),"I agree to store my data button isn't present!");
        softAssert.assertTrue(signUpPage.isIAgreeMyAgeButtonPresent(),"I agree my age button isn't present!");
        softAssert.assertTrue(signUpPage.isSubmitButtonPresent(),"Submit button isn't present!");
        softAssert.assertAll();
        signUpPage.signUpUser(USERNAME,EMAIL,PASSWORD);
        Assert.assertTrue(signUpPage.isSuccessRegisterMessagePresent(),"User isn't signed up!");
    }
}
