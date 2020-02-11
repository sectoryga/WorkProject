package by.stormnet.web.pages.loanPage;


import by.stormnet.web.pages.AbstractPage;

public class LoanStopPage extends AbstractPage {

    private String transitonButton = "//div[@id='sonata-ba-field-container-s0f7350442f_transition']//button[1]";
    private String checkBoxSms = "//span[contains(text(),'sms')]";
    private String checkBoxEmail = "//span[contains(text(),'email')]";
    private String defaultButton = ".select2-choice.select2-default";
    private String resultsButton = "//div[@id='select2-result-label-26']";

    public LoanStopPage navigateToPage() {
        openUrl(baseUrl5);
        return this;
    }

    public LoanStopPage clickTransitionButton() {
        getElement(transitonButton).click();
        return this;
    }

    public LoanStopPage checkBoxSms() {
        getElement(checkBoxSms).click();
        return this;
    }

    public LoanStopPage checkBoxEmail() {
        getElement(checkBoxEmail).click();
        return this;
    }

    public LoanStopPage clickDefault() {
        getElementByCss(defaultButton).click();
        return this;
    }

    public LoanStopPage clickResults() {
        getElement(resultsButton).click();
        return this;
    }
}
