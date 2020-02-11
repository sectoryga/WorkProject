package by.stormnet.web.helpers.loanHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.loanPage.LoanApprovalLoanClientPage;

public class LoanApprovalLoanClientHelper extends AbsractHelper {

    LoanApprovalLoanClientPage approvalLoanClientPage = new LoanApprovalLoanClientPage();

    public LoanApprovalLoanClientHelper openUrl1() {
        approvalLoanClientPage.navigateToPageClient();
        return this;
    }

    public LoanApprovalLoanClientHelper approvalClienLoan() {
        approvalLoanClientPage.clickMainButton();
        approvalLoanClientPage.clickApproveButton()
                .clickSaveButton()
                .checkMessage();
        approvalLoanClientPage.geteLoan().clickCheckBox().clickFinalButton().checkMessage();
        return this;
    }
}
