package com.example.project.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;

    @FindBy(name = "countries")
    private WebElement countrySelect;
    @FindBy(name = "firstname")
    private WebElement firstNameInput;
    @FindBy(name = "lastname")
    private WebElement lastNameInput;
    @FindBy(name = "streetAddress")
    private WebElement streetAddressInput;
    @FindBy(name = "city")
    private WebElement cityInput;
    @FindBy(name = "states")
    private WebElement statesSelect;
    @FindBy(name = "postalCode")
    private WebElement zipCodeInput;


    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setCountry(String country) {
        countrySelect.sendKeys(country);
    }

    public void setFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    public void setStreetAddress(String streetAddress) {
        streetAddressInput.sendKeys(streetAddress);
    }

    public void setCity(String city) {
        cityInput.sendKeys(city);
    }

    public void setState(String state) {
        statesSelect.sendKeys(state);
    }

    public void setZipCode(String zipCode) {
        zipCodeInput.sendKeys(zipCode);
    }
}
