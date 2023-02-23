package com.qaprosoft.carina.demo.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPopUp extends AbstractUIObject {

    @FindBy(xpath = "//span [@id = 'login-popup2']/form/p")
    private ExtendedWebElement loginPageTitle;

    @FindBy(xpath = "//span[@id = 'login-popup2']/form/input[@id = 'email']")
    private ExtendedWebElement emailInput;

    @FindBy(xpath = "//span[@id = 'login-popup2']/form/input[@id = 'upass']")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//span[@id = 'login-popup2']/form/input[@id = 'nick-submit']")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//span[@id = 'login-popup2']/a")
    private ExtendedWebElement iForgotMyPassword;

    public LoginPopUp(WebDriver driver) {
        super(driver);
    }

    public LoginPopUp(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isPageOpened() {
        return loginPageTitle.isElementPresent();
    }

    public boolean isEmailInputPopUpPresent() {
        return emailInput.isElementPresent();
    }

    public boolean isPasswordInputPopUpPresent() {
        return passwordInput.isElementPresent();
    }

    public boolean isLoginButtonPopUpPresent() {
        return loginButton.isElementPresent();
    }

    public boolean isIForgotMyPasswordPopUpPresent() {
        return iForgotMyPassword.isElementPresent();
    }

    public void insertEmailInput(String email) {
        emailInput.click();
        emailInput.type(email);
    }

    public void insertPasswordInput(String password) {
        passwordInput.click();
        passwordInput.type(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void logInUser(String email, String password) {
        insertEmailInput(email);
        insertPasswordInput(password);
        clickLoginButton();
    }


}
