package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.pages.*;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebFooterTest implements IAbstractTest {
    @Test
    @MethodOwner(owner = "sskorolitnyi")
    public void checkIfAllButtonsFooterMenuPresentAndOpenSuccessfully(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(),"Home page is not opened");
        FooterMenu footerMenu = homePage.getFooterMenu();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(footerMenu.isCompareLinkPresent(),"Compare button isn't present!");
        softAssert.assertTrue(footerMenu.isBlogLinkPresent(),"Blog button isn't present!");
        softAssert.assertTrue(footerMenu.isPhoneFinderLinkPresent(),"Phone finder button isn't present!");
        softAssert.assertTrue(footerMenu.isToolsLinkPresent(), "Tools button isn't present!");
        softAssert.assertTrue(footerMenu.isCoverageLinkPresent(),"Coverage button isn't present!");
        softAssert.assertTrue(footerMenu.isGlossaryLinkPresent(),"Glossary button isn't present!");
        softAssert.assertTrue(footerMenu.isContactUsLinkPresent(),"Contact us button isn't present!");
        softAssert.assertTrue(footerMenu.isNewsButtonPresent(),"News button isn't present!");
        softAssert.assertTrue(footerMenu.isReviewButtonPresent(),"Review button isn't present!");
        softAssert.assertAll();
        BlogPage blogPage = footerMenu.openBlogPage();
        Assert.assertTrue(blogPage.isPageOpened(),"Blog page isn't opened!");
        HeaderMenu headerMenu = homePage.getHeaderMenu();
        headerMenu.clickBackToHome();
        NewsPage newsPage = footerMenu.openNewsPage();
        Assert.assertTrue(newsPage.isPageOpened(),"News page isn't opened!");
        headerMenu.clickBackToHome();
        ComparePage comparePage = footerMenu.openComparePage();
        Assert.assertTrue(comparePage.isPageOpened(),"Compare page isn't opened!");
        headerMenu.clickBackToHome();
        ContactUsPage contactUsPage = footerMenu.openContactUsPage();
        Assert.assertTrue(contactUsPage.isPageOpened(),"Contact us page isn't opened!");
        headerMenu.clickBackToHome();
        CoveragePage coveragePage = footerMenu.openCoveragePage();
        Assert.assertTrue(coveragePage.isPageOpened(),"Coverage page isn't opened!");
        headerMenu.clickBackToHome();
        GlossaryPage glossaryPage = footerMenu.openGlossaryPage();
        Assert.assertTrue(glossaryPage.isPageOpened(),"Glossary isn't opened!");
        headerMenu.clickBackToHome();
        PhoneFinderPage phoneFinderPage = footerMenu.openPhoneFinderPage();
        Assert.assertTrue(phoneFinderPage.isPageOpened(),"Phone finder page isn't opened!");
        headerMenu.clickBackToHome();
        ReviewPage reviewPage = footerMenu.openReviewPage();
        Assert.assertTrue(reviewPage.isPageOpened(),"Review page isn't opened!");
        headerMenu.clickBackToHome();
        ToolsPage toolsPage = footerMenu.openToolsPage();
        Assert.assertTrue(toolsPage.isPageOpened(),"Tools page isn't opened!");
        headerMenu.clickBackToHome();
    }
}
