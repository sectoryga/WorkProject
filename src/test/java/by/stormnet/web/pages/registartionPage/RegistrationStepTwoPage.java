package by.stormnet.web.pages.registartionPage;

import by.stormnet.web.helpers.registrationHelpers.RegistrationStepTwoHelper;
import by.stormnet.web.pages.AbstractPage;


public class RegistrationStepTwoPage extends AbstractPage {

    private String lastNameField = "//input[@data-id='reg-int-lastname']";
    private String firstNameField = "//input[@data-id='reg-int-firtname']";
    private String middleNameField = "//input[@data-id='reg-int-middlename']";
    private String innField = "//input[@data-id='reg-int-personalid']";
    private String continueButton = "//span[@class='app-button_text ng-star-inserted']";
    private String numberField = "//input[@data-id='doc-int-number']";
    private String giveOutOne = "//span[@class='ng-arrow-wrapper']";
    private String giveOutTwo = ".ng-option-label.ng-star-inserted";
    private String dateField = "//input[@data-id='doc-int-date_issued']";
    private String lastName = "Друщиц";
    private String firstName = "Александр";
    private String middleName = "Викторович";
    private String date = "15082017";


    public RegistrationStepTwoPage fillLastName() {
        waitForElementVisible(getElementBy(lastNameField));
        getElement(lastNameField).sendKeys(lastName);
        return this;
    }

    public RegistrationStepTwoPage fillFirstName() {
        getElement(firstNameField).sendKeys(firstName);
        return this;
    }

    public RegistrationStepTwoPage fillMiddleName() {
        getElement(middleNameField).sendKeys(middleName);
        return this;
    }

    public RegistrationStepTwoPage fillInn(String inn){
        getElement(innField).sendKeys(inn);
        return this;
    }

    public RegistrationStepTwoPage clickContinueButton(){
        getElement(continueButton).click();
        return this;
    }

    public RegistrationStepTwoPage fillNumberPassport(String number){
        waitForElementVisible(getElementBy(numberField));
        getElement(numberField).sendKeys(number);
        return this;
    }

    public RegistrationStepTwoPage clickGiveOutPassport(){
        getElement(giveOutOne).click();
        getElementByCss(giveOutTwo).click();
        return this;
    }

    public RegistrationStepTwoPage fillDateGiveOut(){
        getElement(dateField).sendKeys(date);
        return this;
    }

}
