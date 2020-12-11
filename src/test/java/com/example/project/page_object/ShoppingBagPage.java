package com.example.project.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingBagPage {
    private WebDriver driver;

    @FindBy(xpath = "//h3[@class='cart-item-name qa-cart-item-name editable']")
    public WebElement productName;
    @FindBy(xpath = "//span[@class='cart-item-sale-price qa-cart-item-sale-price text-bold']")
    public WebElement price;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-cart-checkout btn-block btn-go2checkout qa-btn-go2checkout']")
    private WebElement proceedToCheckoutButton;

    public ShoppingBagPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickProceedToCheckout() {
        proceedToCheckoutButton.click();
    }
}
