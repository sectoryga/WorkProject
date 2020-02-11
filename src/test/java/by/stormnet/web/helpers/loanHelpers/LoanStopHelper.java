package by.stormnet.web.helpers.loanHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.loanPage.LoanStopPage;

public class LoanStopHelper extends AbsractHelper {

    LoanStopPage stopFromLoanPage = new LoanStopPage();

    public LoanStopHelper openUrlLoan() {
        stopFromLoanPage.navigateToPage();
        return this;
    }

    public LoanStopHelper stopLoan() {
        stopFromLoanPage.clickMainButton();
        stopFromLoanPage.clickTransitionButton()
                .checkBoxSms()
                .checkBoxEmail()
                .clickDefault()
                .clickResults()
                .clickFinalButton()
                .checkMessage();
        return this;
    }
}
