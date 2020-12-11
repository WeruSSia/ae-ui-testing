package com.example.project.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;

    @FindBy(xpath = "//button[@name=\"acceptCookie\"]")
    private WebElement acceptCookiesButton;
    @FindBy(xpath="//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
    private WebElement countryButton;
    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")
    private WebElement searchBarButton;
    @FindBy(xpath = "//input[@name=\"search\"]")
    private WebElement searchInput;
    @FindBy(xpath = "//button[@aria-label=\"Search\"]")
    private WebElement searchButton;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acceptCookies() {
        acceptCookiesButton.click();
    }

    public void chooseCountry(){
        countryButton.click();
    }

    public void searchForProduct(String productName) {
        searchBarButton.click();
        searchInput.sendKeys(productName);
        searchButton.click();
    }
}
