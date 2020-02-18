package by.stormnet.web.pages.registartionPage;

import by.stormnet.web.pages.AbstractPage;

public class RegistrationStepOnePage extends AbstractPage {

    private String getMoneyButton = "//*[@id='calculate']/form/div/div/div/div/div[1]/div/button";
    private String emailField = "//input[@data-id='reg-int-email']";
    private String phoneField = "//input[@data-id='reg-int-phone']";
    private String getButton = "//button[@class='btn btn-register btn-code ng-star-inserted']";
    private String checkBox = "//span[contains(@class,'app-checkbox-border')]";
    private String passwordFieldOne = "//input[@type='password']";
    private String passwordFieldTwo = "//input[@data-id=\'reg-int-repeat_password\']";
    private String passwordRegistration = "Sectoryga123";
    private String ahref = "//span[@class='app-checkbox-text']//a";
    private String adminNameField = "username";
    private String adminPasswordField = "password";
    private String adminButton = "submit";
    private String adminName = "admin";
    private String adminPassword = "showmethemoney";
    private String filtr = "//b[@class='caret']";
    private String dateFiltr = "//div[@class='content-wrapper']//li[5]//a[1]";
    private String calendar = "//div[@id='dp_filter_registrationDate_value_start']//span[@class='fa-calendar fa']";
    private String filtrButton = "//*[@id=\"filter-container-s3037dac4a1\"]/div/div/form/div/div[2]/div[1]/button";
    private String codes = ".text-danger.show-tooltip";
    private String codeField = "//input[@class=\"app-form-control-input reg-input ng-star-inserted\"]";
    private String continueButton = "//span[@class='app-button_text ng-star-inserted']";


    public RegistrationStepOnePage navigateToPageSteoOne() {
        openUrl(baseUrl11);
        return this;
    }

    public RegistrationStepOnePage clickGetMoneyButton() {
        waitForElementClickable(getElementBy(getMoneyButton));
        getElement(getMoneyButton).click();
        return this;
    }


    public RegistrationStepOnePage fillEmail(String email) {
        waitForElementVisible(getElementBy(emailField));
        getElement(emailField).sendKeys(email);
        return this;
    }


    public RegistrationStepOnePage fillPhoneNumber(String phone) {
        waitForElementVisible(getElementBy(phoneField));
        getElement(phoneField).sendKeys(phone);
        return this;
    }

    public RegistrationStepOnePage clickGetButton() {
        getElement(getButton).click();
        return this;
    }

    public RegistrationStepOnePage clickCheckBox() {
        getElement(checkBox).click();
        return this;
    }

    public RegistrationStepOnePage fillPasswordOne() {
        waitForElementVisible(getElementBy(passwordFieldOne));
        getElement(passwordFieldOne).sendKeys(passwordRegistration);
        return this;
    }

    public RegistrationStepOnePage fillPasswordTwo() {
        waitForElementVisible(getElementBy(passwordFieldTwo));
        getElement(passwordFieldTwo).sendKeys(passwordRegistration);
        return this;
    }

    public RegistrationStepOnePage clickLink() {
        getElement(ahref).click();
        return this;
    }

    public RegistrationStepOnePage getCode() {
        getTabs();
        navigateToTab(1, getTabs());
        openUrl(baseUrl12);
        getElementById(adminNameField).sendKeys(adminName);
        getElementById(adminPasswordField).sendKeys(adminPassword);
        getElementById(adminButton).click();
        getElement(filtr).click();
        waitForElementVisible(getElementBy(dateFiltr));
        getElement(dateFiltr).click();
        getElement(calendar).click();
        getElement(filtr).click();
        getElement(filtrButton).click();
        String code = getElementByCss(codes).getText();
        navigateToTab(0,getTabs());
        getElement(codeField).sendKeys(code);
        getElement(continueButton).click();
        return this;
    }
}
