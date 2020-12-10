package com.example.project.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    private WebDriver driver;

    @FindBy(xpath = "//body/div[2]/div[5]/div[1]/div[2]/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]")
    private WebElement sizeChoiceList;
    @FindBy(xpath = "//li[@data-value=\"0034096016\"]")
    private WebElement sizeM;
    @FindBy(xpath = "//button[@data-tl=\"btn-add-to-bag\"]")
    private WebElement addToBagButton;
    @FindBy(xpath = "//button[@data-tl=\"btn-view-bag\"]")
    private WebElement viewBagButton;
    @FindBy(xpath = "//body/div[2]/div[5]/div[1]/div[2]/div[2]/div[1]/h1[1]")
    public WebElement productName;
    @FindBy(xpath = "//strong[contains(text(),'1399-5795')]")
    public WebElement style;
    @FindBy(xpath = "//strong[contains(text(),'300')]")
    public WebElement color;
    @FindBy(xpath = "//div[@class=\"product-sale-price ember-view\"]")
    public WebElement price;


    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addProductToBagAndGoToBag() {
        sizeChoiceList.click();
        sizeM.click();
        addToBagButton.click();
        viewBagButton.click();
    }
}
