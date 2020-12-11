package com.example.project.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;

    @FindBy(xpath="//select[@name=\"countries\"]")
    private WebElement country;
    @FindBy(xpath = "//input[@name=\"firstname\"]")
    private WebElement firstName;
    @FindBy(xpath = "//input[@name=\"lastname\"]")
    private WebElement lastName;
    @FindBy(xpath = "//input[@name=\"streetAddress\"]")
    private WebElement streetAddress;
    @FindBy(xpath = "//input[@name=\"city\"]")
    private WebElement city;
    @FindBy(xpath = "//select[@name=\"states\"]")
    private WebElement stateChoiceList;
    @FindBy(xpath = "//input[@name=\"postalCode\"]")
    private WebElement zipCode;


    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setCountry(String country){
        this.country.sendKeys(country);
    }

    public void setFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress.sendKeys(streetAddress);
    }

    public void setCity(String city) {
        this.city.sendKeys(city);
    }

    public void setState(String state) {
        stateChoiceList.sendKeys(state);
    }

    public void setZipCode(String zipCode) {
        this.zipCode.sendKeys(zipCode);
    }
}
