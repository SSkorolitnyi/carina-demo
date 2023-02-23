package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.gui.pages.SignUpPage;
import com.qaprosoft.carina.demo.gui.pages.TipUsPage;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebHeaderTest implements IAbstractTest {
    @Test
    @MethodOwner(owner = "sskorolitnyi")
    public void checkIfAllButtonsHeaderMenuPresentAndOpenSuccessfully() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(),"Home page is not opened");
        HeaderMenu headerMenu = homePage.getHeaderMenu();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(headerMenu.isTipUsButtonPresent(),"Tip us button isn't present!");
        softAssert.assertTrue(headerMenu.isYouTubeButtonPresent(),"YouTube button isn't present!");
        softAssert.assertTrue(headerMenu.isInstagramButtonPresent(),"Instagram button isn't present!");
        softAssert.assertTrue(headerMenu.isRss2ButtonPresent(), "Rss2 button isn't present!");
        softAssert.assertTrue(headerMenu.isSpecsCarButtonPresent(),"Specs car button isn't present!" );
        softAssert.assertTrue(headerMenu.isCartButtonPresent(), "Cart button isn't present!");
        softAssert.assertTrue(headerMenu.isLoginButtonPresent(),"Login button isn't present!");
        softAssert.assertTrue(headerMenu.isSignUpButtonPresent(),"Sign up button isn't present!");
        softAssert.assertTrue(headerMenu.isSearchBarInputPresent(),"Search bar isn't present!");
        softAssert.assertTrue(headerMenu.isBurgerMenuButtonPresent(),"Burger menu button isn't present!");
        softAssert.assertTrue(headerMenu.isSearchBarButtonPresent(),"Search button isn't present!");
        softAssert.assertAll();
        TipUsPage tipUsPage = headerMenu.openTipUsPage();
        Assert.assertTrue(tipUsPage.isPageOpened(),"Tip us page isn't opened!");
        headerMenu.clickBackToHome();
        SignUpPage signUpPage = headerMenu.openSignUpPage();
        Assert.assertTrue(signUpPage.isPageOpened(),"Sign up page isn't opened!");
        headerMenu.clickBackToHome();
    }
}
