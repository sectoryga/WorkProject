package by.stormnet.web.pages.registartionPage;

import by.stormnet.web.pages.AbstractPage;

public class RegistrationStepThreePage extends AbstractPage {

    private String regionOne = ".ng-arrow-wrapper";
    private String regionTwo = ".ng-option-label.ng-star-inserted";
    private String continueButton = "//span[@class='app-button_text ng-star-inserted']";
    private String regionThree = "ng-select.reg-input.ng-select-single.ng-untouched.ng-pristine.ng-valid:last-child";
    private String regionFour = ".ng-option-label.ng-star-inserted:last-child";
    private String regionFive = ".ng-input";
    private String streetField = "//input[@data-id='address-int-street']";
    private String street = "Рокоссовского";
    private String houseField = "//input[@data-id='address-int-house']";
    private String house = "123";
    private String apatmentFiled = "//input[@data-id='address-int-apartment']";
    private String apatment = "321";
    private String phoneField = "//input[@data-id='address-int-phone']";
    private String name = "Брат Александра";
    private String contactNameField = "//input[@data-id='contacts-int-name']";
    private String contactPhoneField = "//input[@data-id='contacts-int-phone']";
    private String typeContactFieldOne = "//div[@class='ng-input']";
    private String typeContactFieldTwo = ".ng-option-label.ng-star-inserted";


    public RegistrationStepThreePage clickRegion() {

        getElementByCss(regionOne).click();
        getElementByCss(regionTwo).click();
        getElementByCss(regionThree).click();
        getElementByCss(regionFour).click();
        getElementByCss(regionFive).click();
        getElementByCss(regionTwo).click();
        return this;
    }

    public RegistrationStepThreePage fillAdress() {
        waitForElementVisible(getElementBy(streetField));
        getElement(streetField).sendKeys(street);
        getElement(houseField).sendKeys(house);
        getElement(apatmentFiled).sendKeys(apatment);
        return this;
    }

    public RegistrationStepThreePage fillPhone(String phone) {
        getElement(phoneField).sendKeys(phone);
        return this;
    }

    public RegistrationStepThreePage clickContinueButton() {
        getElement(continueButton).click();
        return this;
    }

    public RegistrationStepThreePage addContactName(String phone){
        waitForElementVisible(getElementBy(contactNameField));
        getElement(contactNameField).sendKeys(name);
        getElement(contactPhoneField).sendKeys(phone);
        getElement(typeContactFieldOne).click();
        getElementByCss(typeContactFieldTwo).click();
        return this;
    }
}
