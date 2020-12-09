package com.example.project.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    private WebDriver driver;

    @FindBy(xpath = "//div[@data-product-id=\"1399_5795_300\"]")
    private WebElement productTile;

    public SearchResultsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnProductTile(){
        productTile.click();
    }
}
