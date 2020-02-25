package by.stormnet.web.helpers.loanHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.loanPage.IncamePage;

public class IncameHelper extends AbsractHelper {

    IncamePage incamePage = new IncamePage();

    public IncameHelper addIncameLoan() throws InterruptedException {
        incamePage.clickButtonAdd()
                .clickButtonElse();
        Thread.sleep(3000);
        incamePage.fillDateCash()
                .fillCash(getRandom())
                .clickView()
                .clickApproveIncame()
                .checkMessageCreate();
        return this;
    }

}
