package com.example.project.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    private WebDriver driver;

    @FindBy(xpath = "//h1[@class='product-name cms-ae-product-name']")
    public WebElement productName;
    @FindBy(xpath = "//strong[@class='equity-item-prod-id']")
    public WebElement style;
    @FindBy(xpath = "//strong[@class='equity-item-color-id']")
    public WebElement color;
    @FindBy(xpath = "//div[@class='product-sale-price ember-view']")
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

    public void clickSelectSize() {
        sizeSelect.click();
    }

    public void selectSizeM() {
        sizeMListItem.click();
    }

    public void clickAddToBagButton() {
        addToBagButton.click();
    }

    public void clickViewBagButton() {
        viewBagButton.click();
    }
}
