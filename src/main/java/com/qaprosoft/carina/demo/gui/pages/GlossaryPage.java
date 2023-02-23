package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class GlossaryPage extends AbstractPage {

    @FindBy(className = "article-info-name")
    private ExtendedWebElement glossaryPageTitle;

    public GlossaryPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return glossaryPageTitle.isElementPresent();
    }
}
