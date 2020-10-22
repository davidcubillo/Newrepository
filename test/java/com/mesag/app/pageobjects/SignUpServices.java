package com.mesag.app.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class SignUpServices {

    private WebDriver driver;
    private SignUpPageObject signUpPageObject;
    public SignUpServices(WebDriver driver) {
        this.driver = driver;
        signUpPageObject = new SignUpPageObject(driver);
    }

    Random rand = new Random();
    long theRandomNum;
    long number1 = 9000000000L;

    {
        theRandomNum = Long.valueOf((long) (Math.floor(Math.random() * number1) + 1000000000));
    }

    String phoneNumber = String.valueOf(theRandomNum);
    public void go(String url)
    {
        this.driver.get(url);
    }

    public void writeFirstName(String firstname) {
        this.signUpPageObject.getFirstNameTextBox().sendKeys(firstname);
    }
    public void writeLastName(String lastName) {
        this.signUpPageObject.getLastNameTextBox().sendKeys(lastName);
    }
    public void writeAddress(String address) {
        this.signUpPageObject.getAddressTextBox().sendKeys(address);
    }
    public void writeEmail(String email) {
        this.signUpPageObject.getEmailTextBox().sendKeys(email);
    }
    public void writePhone() {
        this.signUpPageObject.getPhoneTextBox().sendKeys(phoneNumber);
    }
    public void clickGender() {
        this.signUpPageObject.getGenderMaleRadioButton().click();
    }
    public void selectCountry(String country) {
        new Select(this.signUpPageObject.getCountries()).selectByValue(country);
    }
    public void selectYear(String year) {
        new Select(this.signUpPageObject.getYear()).selectByValue(year);
    }
    public void selectMonth(String month) {
        new Select(this.signUpPageObject.getMonth()).selectByValue(month);
    }
    public void selectDay(String day) {
        new Select(this.signUpPageObject.getDay()).selectByValue(day);
    }
    public void writePassword(String password) {
        this.signUpPageObject.getPassword().sendKeys(password);
    }
    public void writeConfirmPassword(String password) {
        this.signUpPageObject.getConfirmPassword().sendKeys(password);
    }
    public void clickSubmitButton() {
        this.signUpPageObject.getSubmitbutton().click();
    }
}
