package by.stormnet.web.pages.loanPage;

import by.stormnet.web.helpers.loanHelpers.LoanApprovalLoanClientHelper;
import by.stormnet.web.pages.AbstractPage;

public class LoanApprovalLoanClientPage extends AbstractPage {

    private String clientApproveButton = "//div[@class='row']//button[2]";
    private String saveButton = "//button[@name='btn_update_and_edit']";
    private String giveLoanButton = "//div[@class='row']//button[2]";
    private String checkBox = "//div[@id='sonata-ba-field-container-s0f7350442f_give_out_force']//span[@class='control-label__text']";

    public LoanApprovalLoanClientPage navigateToPageClient() {
        openUrl(baseUrl3);
        return this;
    }

    public LoanApprovalLoanClientPage navigateApprobalPage() {
        openUrl(baseUrl5);
        return this;
    }

    public LoanApprovalLoanClientPage navigateGiveOut() {
        openUrl(baseUrl3);
        return this;
    }

    public LoanApprovalLoanClientPage clickApproveButton() {
        getElement(clientApproveButton).click();
        return this;
    }

    public LoanApprovalLoanClientPage clickSaveButton() {
        getElement(saveButton).click();
        return this;
    }

    public LoanApprovalLoanClientPage geteLoan() {
        getElement(giveLoanButton).click();
        return this;
    }

    public LoanApprovalLoanClientPage clickCheckBox() {
        getElement(checkBox).click();
        return this;
    }

}
