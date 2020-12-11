package com.example.project.test;

import com.example.project.page_object.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class AETest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.ae.com/us/en");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void buyProductTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.acceptCookies();
        mainPage.chooseCountry();
        mainPage.searchForProduct("1399-5795 300");

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.clickOnProductTile();

        ProductPage productPage = new ProductPage(driver);
        String productName = productPage.productName.getText();
        String price = productPage.price.getText();
        productPage.clickSelectSize();
        productPage.selectSizeM();
        productPage.clickAddToBagButton();
        productPage.clickViewBagButton();

        ShoppingBagPage shoppingBagPage = new ShoppingBagPage(driver);
        assertThat(shoppingBagPage.productName.getText()).isEqualToIgnoringCase(productName);
        assertThat(shoppingBagPage.price.getText()).isEqualTo(price);
        shoppingBagPage.clickProceedToCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.setCountry("United States");
        checkoutPage.setFirstName("John");
        checkoutPage.setLastName("Doe");
        checkoutPage.setStreetAddress("507 Central St.");
        checkoutPage.setCity("Middletown");
        checkoutPage.setState("Connecticut");
        checkoutPage.setZipCode("06457");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
