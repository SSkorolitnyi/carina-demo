/*
 * Copyright 2013-2021 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qaprosoft.carina.demo.gui.components;

import com.qaprosoft.carina.demo.gui.pages.*;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class FooterMenu extends AbstractUIObject {
    @FindBy(linkText = "Home")
    private ExtendedWebElement homeLink;

    @FindBy(xpath = "//div[@class='footer-inner']//a[contains(text(),'Compare')]")
    private ExtendedWebElement compareLink;
    
    @FindBy(linkText = "News")
    private ExtendedWebElement newsLink;

    @FindBy(xpath = "//div[@class = 'footer-inner']//a[contains(text(),'Blog')]")
    private ExtendedWebElement blogLink;

    @FindBy(xpath = "//div[@class = 'footer-inner']//a[contains(text(),'Phone Finder')]")
    private ExtendedWebElement phoneFinderLink;

    @FindBy(xpath = "//div[@class = 'footer-inner']//a[contains(text(),'Tools')]")
    private ExtendedWebElement toolsLink;

    @FindBy(xpath = "//div[@class = 'footer-inner']//a[contains(text(),'Coverage')]")
    private ExtendedWebElement coverageLink;

    @FindBy(xpath = "//div[@class = 'footer-inner']//a[contains(text(),'Glossary')]")
    private ExtendedWebElement glossaryLink;

    @FindBy(xpath = "//div[@class = 'footer-inner']//a[contains(text(),'Contact us')]")
    private ExtendedWebElement contactUsLink;

    @FindBy(xpath = "//div[@class = 'footer-inner']//a[contains(text(),'Review')]")
    private ExtendedWebElement reviewLink;

    public FooterMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isBlogLinkPresent() {
        blogLink.scrollTo();
        return blogLink.isElementPresent();
    }

    public boolean isPhoneFinderLinkPresent() {
        phoneFinderLink.scrollTo();
        return phoneFinderLink.isElementPresent();
    }

    public boolean isToolsLinkPresent() {
        toolsLink.scrollTo();
        return toolsLink.isElementPresent();
    }

    public boolean isCoverageLinkPresent() {
        coverageLink.scrollTo();
        return coverageLink.isElementPresent();
    }

    public boolean isGlossaryLinkPresent() {
        glossaryLink.scrollTo();
        return glossaryLink.isElementPresent();
    }

    public boolean isContactUsLinkPresent() {
        contactUsLink.scrollTo();
        return contactUsLink.isElementPresent();
    }

    public boolean isCompareLinkPresent() {
        compareLink.scrollTo();
        return compareLink.isElementPresent();
    }

    public boolean isNewsButtonPresent() {
        newsLink.scrollTo();
        return newsLink.isElementPresent();
    }

    public boolean isReviewButtonPresent() {
        reviewLink.scrollTo();
        return reviewLink.isElementPresent();
    }

    public HomePage openHomePage() {
        homeLink.click();
        return new HomePage(driver);
    }

    public ComparePage openComparePage() {
        compareLink.scrollTo();
        compareLink.click();
        return new ComparePage(driver);
    }

    public NewsPage openNewsPage() {
        newsLink.scrollTo();
        newsLink.click();
        return new NewsPage(driver);
    }

    public BlogPage openBlogPage() {
        blogLink.scrollTo();
        blogLink.click();
        return new BlogPage(driver);
    }

    public ContactUsPage openContactUsPage() {
        contactUsLink.scrollTo();
        contactUsLink.click();
        return new ContactUsPage(driver);
    }

    public CoveragePage openCoveragePage() {
        coverageLink.scrollTo();
        coverageLink.click();
        return new CoveragePage(driver);
    }

    public GlossaryPage openGlossaryPage() {
        glossaryLink.scrollTo();
        glossaryLink.click();
        return  new GlossaryPage(driver);
    }

    public PhoneFinderPage openPhoneFinderPage() {
        phoneFinderLink.scrollTo();
        phoneFinderLink.click();
        return new PhoneFinderPage(driver);
    }

    public ReviewPage openReviewPage() {
        reviewLink.scrollTo();
        reviewLink.click();
        return new ReviewPage(driver);
    }

    public ToolsPage openToolsPage() {
        toolsLink.scrollTo();
        toolsLink.click();
        return new ToolsPage(driver);
    }
}
