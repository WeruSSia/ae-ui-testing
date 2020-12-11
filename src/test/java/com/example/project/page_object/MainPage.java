package com.example.project.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;

    @FindBy(name = "acceptCookie")
    private WebElement acceptCookiesButton;
    @FindBy(xpath = "//div[@class='flags-wrapper']//div[1]")
    private WebElement countryButton;
    @FindBy(xpath = "//span[normalize-space()='Search']")
    private WebElement searchBarButton;
    @FindBy(name = "search")
    private WebElement searchInput;
    @FindBy(xpath = "//button[@aria-label='Search']")
    private WebElement searchButton;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acceptCookies() {
        acceptCookiesButton.click();
    }

    public void chooseCountry() {
        countryButton.click();
    }

    public void searchForProduct(String productName) {
        searchBarButton.click();
        searchInput.sendKeys(productName);
        searchButton.click();
    }
}
