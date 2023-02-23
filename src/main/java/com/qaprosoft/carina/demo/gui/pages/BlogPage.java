package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends AbstractPage {

    @FindBy(className = "article-info-name")
    private ExtendedWebElement blogPageTitle;

    public BlogPage(WebDriver driver){
        super(driver);
        setPageURL("/blog.php3");
    }

    public boolean isPageOpened() {
        return blogPageTitle.isElementPresent();
    }

}
