package com.example.project.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingBagPage {
    private WebDriver driver;

    @FindBy(css="h3.qa-cart-item-name")
    public WebElement productName;
    @FindBy(css="span.qa-cart-item-sale-price")
    public WebElement price;
    @FindBy(css="button.qa-btn-go2checkout")
    private WebElement proceedToCheckoutButton;

    public ShoppingBagPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickProceedToCheckout() {
        proceedToCheckoutButton.click();
    }
}
