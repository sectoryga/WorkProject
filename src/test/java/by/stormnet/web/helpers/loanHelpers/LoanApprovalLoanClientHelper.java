package by.stormnet.web.helpers.loanHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.loanPage.LoanApprovalLoanClientPage;

public class LoanApprovalLoanClientHelper extends AbsractHelper {

    LoanApprovalLoanClientPage approvalLoanClientPage = new LoanApprovalLoanClientPage();

    public LoanApprovalLoanClientHelper openUrl1() {
        approvalLoanClientPage.navigateGiveOut();
        return this;
    }

    public LoanApprovalLoanClientHelper openApproval(){
        approvalLoanClientPage.navigateApprobalPage();
        return this;
    }


    public LoanApprovalLoanClientHelper approvalClienLoan() {
        approvalLoanClientPage.clickMainButton();
        approvalLoanClientPage.clickApproveButton()
                .clickSaveButton()
                .checkMessage();
        return this;
    }

    public LoanApprovalLoanClientHelper giveoutLoan() {
        approvalLoanClientPage.clickMainButton();
        approvalLoanClientPage.geteLoan()
                .clickCheckBox()
                .clickFinalButton()
                .checkMessage();
        return this;
    }
}
