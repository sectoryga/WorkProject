package by.stormnet.web.helpers.loanHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.loanPage.IncamePage;

public class IncameHelper extends AbsractHelper {

    IncamePage incamePage = new IncamePage();

    public IncameHelper openUrlLoanPage() {
        incamePage.navigateToPageLoan();
        return this;
    }

    public IncameHelper addIncameLoan() {
        incamePage.clickButtonAdd()
                .clickButtonElse();
        incamePage.fillDateCash()
                .fillCash(getRandom())
                .clickView()
                .clickApproveIncame()
                .checkMessageCreate();
        return this;
    }

}
