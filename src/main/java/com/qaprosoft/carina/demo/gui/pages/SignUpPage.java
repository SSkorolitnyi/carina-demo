package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends AbstractPage {

    @FindBy(className = "article-info-name")
    private ExtendedWebElement signUpPageTitle;

    @FindBy(xpath = "//form[@id = 'frmOpin']/fieldset/input[@id = 'uname']")
    private ExtendedWebElement usernameInput;

    @FindBy(xpath = "//form[@id = 'frmOpin']/fieldset/input[@id = 'email']")
    private ExtendedWebElement userEmailInput;

    @FindBy(xpath = "//form[@id = 'frmOpin']/input[@id = 'upass']")
    private ExtendedWebElement userPassInput;

    @FindBy(xpath = "//fieldset[2]/div/label[@for = 'iagree1']")
    private ExtendedWebElement iAgreeToStoreMyDataButton;

    @FindBy(xpath = "//fieldset[2]/div/label[@for = 'iagree2']")
    private ExtendedWebElement iAgreeMyAgeButton;

    @FindBy(xpath = "//input[@class = 'button float-right']")
    private ExtendedWebElement submitButton;

    @FindBy(xpath = "//div[@class = 'normal-text res-success']/h3")
    private ExtendedWebElement successRegisterMessage;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return signUpPageTitle.isElementPresent(3);
    }

    public boolean isUsernameInputPresent() {
        usernameInput.scrollTo();
        return usernameInput.isElementPresent();
    }

    public boolean isUserEmailInputPresent() {
        userEmailInput.scrollTo();
        return userEmailInput.isElementPresent();
    }

    public boolean isUserPassInputPresent() {
        userPassInput.scrollTo();
        return userPassInput.isElementPresent();
    }

    public boolean isIAgreeToStoreMyDataButtonPresent() {
        iAgreeToStoreMyDataButton.scrollTo();
        return iAgreeToStoreMyDataButton.isElementPresent();
    }

    public boolean isSuccessRegisterMessagePresent() {
        successRegisterMessage.scrollTo();
        return successRegisterMessage.isElementPresent();
    }

    public boolean isIAgreeMyAgeButtonPresent() {
        iAgreeToStoreMyDataButton.scrollTo();
        return iAgreeMyAgeButton.isElementPresent();
    }

    public boolean isSubmitButtonPresent() {
        submitButton.scrollTo();
        return submitButton.isElementPresent();
    }

    public void insertUserNameInput(String username) {
        usernameInput.type(username);
    }

    public void insertUserEmailInput(String userEmail) {
        userEmailInput.type(userEmail);
    }

    public void insertUserPassword(String userPassword) {
        userPassInput.type(userPassword);
    }

    public void clickIAgreeToStoreMyDataButton() {
        iAgreeToStoreMyDataButton.click();
    }

    public void clickIAgreeMyAgeButton() {
        iAgreeMyAgeButton.click();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void signUpUser(String username, String userEmail, String password) {
        insertUserNameInput(username);
        insertUserEmailInput(userEmail);
        insertUserPassword(password);
        clickIAgreeToStoreMyDataButton();
        clickIAgreeMyAgeButton();
        clickSubmitButton();
    }
}
