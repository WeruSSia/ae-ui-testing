package com.example.project.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    private WebDriver driver;

    @FindBy(css = "h1.cms-ae-product-name")
    public WebElement productName;
    @FindBy(css = "div.product-sale-price")
    public WebElement price;
    @FindBy(xpath = "//div[@aria-label='Size']")
    private WebElement sizeSelect;
    @FindBy(xpath = "//span[normalize-space()='M']")
    private WebElement sizeMListItem;
    @FindBy(name = "addToBag")
    private WebElement addToBagButton;
    @FindBy(name = "viewBag")
    private WebElement viewBagButton;


    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ProductPage clickSelectSize() {
        sizeSelect.click();
        return this;
    }

    public ProductPage selectSizeM() {
        sizeMListItem.click();
        return this;
    }

    public ProductPage clickAddToBagButton() {
        addToBagButton.click();
        return this;
    }

    public ProductPage clickViewBagButton() {
        viewBagButton.click();
        return this;
    }
}
