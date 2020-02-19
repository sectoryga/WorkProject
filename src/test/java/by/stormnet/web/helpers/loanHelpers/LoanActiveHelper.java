package by.stormnet.web.helpers.loanHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.loanPage.LoanActivePage;

public class LoanActiveHelper extends AbsractHelper {

    LoanActivePage loanChangeDatePage = new LoanActivePage();

    public LoanActiveHelper openUrlLoanPage() {
        loanChangeDatePage.navigateToPageLoan();
        return this;
    }

    public LoanActiveHelper changeDate() {
        loanChangeDatePage.clickChangeButton().clearDateField().fillDate().getFinalButton().clickFinalButton();
        loanChangeDatePage.checkDateChange();
        return this;
    }

    public LoanActiveHelper makeOverdueLoan() {
        loanChangeDatePage.clickOverdueButton().clickFinalButton().checkMessage();
        return this;
    }

    public LoanActiveHelper addCommentLoan() {
        loanChangeDatePage.clickAddCommentButton().fillCommentField().clickFinalButton().checkMessage();
        return this;
    }

    public LoanActiveHelper closeLoan() {
        loanChangeDatePage.clickCloseLoanButton().fillDateClose().fillCommentCloseLoan().clickFinalButton();
        loanChangeDatePage.checkCommisionLoanChange();
        return this;
    }

    public LoanActiveHelper errorLoan() {
        loanChangeDatePage.clickMainButton();
        loanChangeDatePage.clickError();
        loanChangeDatePage.clickFinalButton().checkMessage();
        return this;
    }

    public LoanActiveHelper stopCash() {
        loanChangeDatePage.clickStopCashButton().clickFinalButton().checkMessage();
        return this;
    }

    public LoanActiveHelper returnCash() {
        loanChangeDatePage.clickStopCashButton().clickFinalButton().checkMessage();
        return this;
    }

    public LoanActiveHelper assigmentVerifier() throws InterruptedException {
        loanChangeDatePage.clickButtonVerifire()
                .clickListVerifires();
        Thread.sleep(2000);
        loanChangeDatePage.getElementVerifire().clickVerifariName();
        Thread.sleep(2000);
        loanChangeDatePage.getFinalButton()
                .clickFinalButton()
                .checkMessage();

        return this;
    }


}
