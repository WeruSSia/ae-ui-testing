package com.example.project.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    private WebDriver driver;

    @FindBy(xpath = "//body/div[2]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]")
    private WebElement productTile;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnProductTile() {
        productTile.click();
    }
}
