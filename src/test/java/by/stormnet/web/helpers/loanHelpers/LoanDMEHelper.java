package by.stormnet.web.helpers.loanHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.loanPage.LoanDMEPage;

public class LoanDMEHelper extends AbsractHelper {

    LoanDMEPage verifyLoanPage = new LoanDMEPage();

    public LoanDMEHelper openUrl() {
        verifyLoanPage.navigateToPage();
        return this;
    }

    public LoanDMEHelper approvalLoanOne() {
        verifyLoanPage.clickMainButton();
        verifyLoanPage.clickBeVerify()
                .clickSaveButton()
                .clickDecidebutton()
                .clickApproval()
                .checkApprovalOne()
                .checkBox()
                .clickFinalButton()
                .checkMessage();
        return this;
    }

    public LoanDMEHelper approvalLoanTwo() {
        verifyLoanPage.clickMainButton();
        verifyLoanPage.clickBeVerify()
                .clickSaveButton()
                .clickDecidebutton()
                .clickApproval()
                .checkApprovalTwo()
                .checkBox()
                .clickFinalButton()
                .checkMessage();
        return this;
    }
}
