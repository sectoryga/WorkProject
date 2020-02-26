package by.stormnet.web.helpers.loanHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.loanPage.IncamePage;

public class IncameHelper extends AbsractHelper {

    IncamePage incamePage = new IncamePage();

    public IncameHelper addIncameLoan() {
        incamePage.clickButtonAdd()
                .clickButtonElse();
        incamePage.fillCash(getRandom())
                .clickView()
                .clickApproveIncame()
                .checkMessageCreate();
        return this;
    }

}
