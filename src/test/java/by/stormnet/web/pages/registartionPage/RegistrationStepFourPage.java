package by.stormnet.web.pages.registartionPage;

import by.stormnet.web.pages.AbstractPage;

public class RegistrationStepFourPage extends AbstractPage {

    private String educationOne = "//*[@data-id='employment-select-education']";
    private String educationTwo = ".ng-option.ng-option-marked.ng-star-inserted";
    private String position = "//*[@data-id='employment-select-positiontype']";
    private String optionSelect = ".ng-option.ng-star-inserted.ng-option-marked";
    private String jobsSelect = "//*[@data-id='employment-select-jobposition']";
    private String workExpirionce = "//*[@data-id='employment-select-workexperience']";
    private String activity = "//*[@data-id='employment-select-employeeactivity']";
    private String namePlantField = "//*[@data-id='employment-int-employer']";
    private String namePlant = "Автозавод";
    private String adressPlant = "//*[@data-id='employment-int-employeraddress']";
    private String adress = "Петровщина";
    private String continueButton = "//span[@class='app-button_text ng-star-inserted']";
    private String phoneField = "//*[@data-id='incomes-int-phone']";
    private String familyField = "//*[@data-id='incomes-select-status']";
    private String childrenFieldOne = "//*[@data-id='incomes-select-children']";
    private String childrenFieldTwo = ".ng-option.ng-star-inserted";
    private String amountOne = "//*[@data-id='incomes-int-monthly']";
    private String amountTwo = "//*[@data-id='incomes-int-amount']";
    private String ibanField = "//*[@data-id='payment-int-banckaccountnumber']";
    private String iban = "KZ75 125K ZT20 6910 0100";

    public RegistrationStepFourPage updateEmployment() {
        waitForElementVisible(getElementBy(educationOne));
        getElement(educationOne).click();
        waitForElementVisible(getElementByCssWaiter(educationTwo));
        getElementByCss(educationTwo).click();
        getElement(position).click();
        waitOption();
        getElement(jobsSelect).click();
        waitOption();
        getElement(workExpirionce).click();
        waitOption();
        getElement(activity).click();
        waitOption();
        return this;
    }

    public RegistrationStepFourPage waitOption() {
        waitForElementVisible(getElementByCssWaiter(optionSelect));
        getElementByCss(optionSelect).click();
        return this;
    }

    public RegistrationStepFourPage updateAdressEmployment() {
        getElement(namePlantField).sendKeys(namePlant);
        getElement(adressPlant).sendKeys(adress);
        return this;
    }

    public RegistrationStepFourPage clickContinueButton() {
        getElement(continueButton).click();
        return this;
    }

    public RegistrationStepFourPage updateIncome(String phone) {
        waitForElementVisible(getElementBy(phoneField));
        getElement(phoneField).sendKeys(phone);
        getElement(familyField).click();
        getElementByCss(optionSelect).click();
        getElement(childrenFieldOne).click();
        getElementByCss(childrenFieldTwo).click();
        getElement(amountOne).sendKeys(phone);
        getElement(amountTwo).sendKeys(phone);
        return this;
    }

    public RegistrationStepFourPage updateIban() {
        waitForElementVisible(getElementBy(ibanField));
        getElement(ibanField).sendKeys(iban);
        return this;
    }
}
