package com.example.project.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    private WebDriver driver;

    @FindBy(xpath = "//div[@aria-label=\"Size\"]")
    private WebElement sizeSelect;
    @FindBy(xpath = "//li[@data-value=\"0034096016\"]")
    private WebElement sizeMListItem;
    @FindBy(xpath = "//button[@data-tl=\"btn-add-to-bag\"]")
    private WebElement addToBagButton;
    @FindBy(xpath = "//button[@data-tl=\"btn-view-bag\"]")
    private WebElement viewBagButton;
    @FindBy(css = "h1.product-name.cms-ae-product-name")
    public WebElement productName;
    @FindBy(xpath = "//strong[@class='equity-item-prod-id']")
    public WebElement style;
    @FindBy(xpath = "//strong[@class='equity-item-color-id']")
    public WebElement color;
    @FindBy(xpath = "//div[@class=\"product-sale-price ember-view\"]")
    public WebElement price;


    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addProductToBagAndGoToBag() {
        sizeSelect.click();
        sizeMListItem.click();
        addToBagButton.click();
        viewBagButton.click();
    }
}
