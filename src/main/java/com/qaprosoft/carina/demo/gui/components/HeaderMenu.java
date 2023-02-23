package com.qaprosoft.carina.demo.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.gui.pages.SignUpPage;
import com.qaprosoft.carina.demo.gui.pages.TipUsPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderMenu extends AbstractUIObject {

    @FindBy(id = "logo")
    private ExtendedWebElement logoButton;

    @FindBy(xpath = "//div[@id = 'social-connect']/a[1]" )
    private ExtendedWebElement tipUsButton;

    @FindBy(xpath = "//div[@id = 'social-connect']/a[2]")
    private ExtendedWebElement youTubeButton;

    @FindBy(xpath = "//div[@id = 'social-connect']/a[3]")
    private ExtendedWebElement instagramButton;

    @FindBy(xpath = "//div[@id = 'social-connect']/a[4]")
    private ExtendedWebElement rss2Button;

    @FindBy(xpath = "//div[@id = 'social-connect']/a[5]")
    private ExtendedWebElement specsCarButton;

    @FindBy(xpath = "//div[@id = 'social-connect']/a[6]")
    private ExtendedWebElement cartButton;

    @FindBy(xpath = "//div[@id = 'social-connect']/a[7]")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//div[@id = 'social-connect']/a[8]")
    private ExtendedWebElement signUpButton;

    @FindBy(xpath = "//div[@class = 'top-bar clearfix']/button")
    private ExtendedWebElement burgerMenuButton;

    @FindBy(xpath = "//div[@id = 'nav']/form/input")
    private ExtendedWebElement searchBarInput;

    @FindBy(xpath = "//div[@id = 'nav']/form/span")
    private ExtendedWebElement searchBarButton;

    @FindBy(id = "login-popup2")
    private LoginPopUp loginPopUp;

    public HeaderMenu(WebDriver driver) {
        super(driver);
    }

    public HeaderMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isTipUsButtonPresent() {
        return tipUsButton.isElementPresent();
    }

    public boolean isYouTubeButtonPresent () {
        return youTubeButton.isElementPresent();
    }

    public boolean isInstagramButtonPresent() {
        return instagramButton.isElementPresent();
    }

    public boolean isRss2ButtonPresent() {
        return rss2Button.isElementPresent();
    }

    public boolean isSpecsCarButtonPresent() {
        return specsCarButton.isElementPresent();
    }

    public boolean isCartButtonPresent() {
        return cartButton.isElementPresent();
    }

    public boolean isLoginButtonPresent() {
        return loginButton.isElementPresent();
    }

    public boolean isSignUpButtonPresent() {
        return signUpButton.isElementPresent();
    }

    public boolean isBurgerMenuButtonPresent() {
        return burgerMenuButton.isElementPresent();
    }

    public boolean isSearchBarInputPresent() {
        return searchBarInput.isElementPresent();
    }

    public boolean isSearchBarButtonPresent() {
        return searchBarButton.isElementPresent();
    }

    public TipUsPage openTipUsPage() {
        tipUsButton.click();
        return new TipUsPage(driver);
    }

    public SignUpPage openSignUpPage() {
        signUpButton.click();
        return new SignUpPage(driver);
    }

    public HomePage clickBackToHome() {
        logoButton.click();
        return new HomePage(driver);
    }

    public LoginPopUp openLoginPopUp() {
        loginButton.click();
        return loginPopUp;
    }
}
