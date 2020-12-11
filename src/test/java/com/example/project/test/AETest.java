package com.example.project.test;

import com.example.project.page_object.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class AETest {

    private WebDriver driver;

    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.ae.com/us/en");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void buyProductTest() throws InterruptedException {
        String style = "1399-5795";
        String color = "300";

        MainPage mainPage = new MainPage(driver);
        mainPage.acceptCookies();
        mainPage.searchForProduct(style + " " + color);

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.clickOnProductTile();

        ProductPage productPage = new ProductPage(driver);
        assertThat(productPage.style.getText()).isEqualTo(style);
        assertThat(productPage.color.getText()).isEqualTo(color);
        String productName = productPage.productName.getText();
        String price = productPage.price.getText();
        productPage.addProductToBagAndGoToBag();

        ShoppingBagPage shoppingBagPage = new ShoppingBagPage(driver);
        assertThat(shoppingBagPage.productName.getText()).isEqualToIgnoringCase(productName);
        assertThat(shoppingBagPage.price.getText()).isEqualTo(price);
        shoppingBagPage.clickProceedToCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.setFirstName("John");
        checkoutPage.setLastName("Doe");
        checkoutPage.setStreetAddress("507 Central St.");
        checkoutPage.setCity("Middletown");
        checkoutPage.setState("Connecticut");
        checkoutPage.setZipCode("06457");
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
