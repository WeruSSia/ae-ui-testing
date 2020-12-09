package com.example.project.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingBagPage {
    private WebDriver driver;

    @FindBy(xpath = "//body/div[2]/div[5]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/button[1]")
    private WebElement proceedToCheckoutButton;

    public ShoppingBagPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickProceedToCheckout() {
        proceedToCheckoutButton.click();
    }
}