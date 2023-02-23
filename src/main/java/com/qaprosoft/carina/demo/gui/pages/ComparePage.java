package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ComparePage extends AbstractPage {

    @FindBy(className = "article-info-name")
    private ExtendedWebElement comparePageTitle;

    public ComparePage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return comparePageTitle.isElementPresent();
    }
}
