package by.stormnet.web.helpers.collectionHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.collectionPage.LoanAllCollectionPage;

public class LoanAllCollectionHelper extends AbsractHelper {

    LoanAllCollectionPage loanAddCommentCollectorPage = new LoanAllCollectionPage();

    public LoanAllCollectionHelper openUrlCollection() {
        loanAddCommentCollectorPage.navigateToPage();
        return this;
    }

    public LoanAllCollectionHelper addComment() {
        loanAddCommentCollectorPage.scroll().clickMainButton();
        loanAddCommentCollectorPage.clickCommentButton()
                .dropDawnSelect()
                .resultSelectDropDawn()
                .fillDataField()
                .fillCommentField()
                .clickFinalButton()
                .checkMessage();
        return this;
    }

    public LoanAllCollectionHelper saleLoan() {
        loanAddCommentCollectorPage.scroll();
        loanAddCommentCollectorPage.clickMainButton();
        loanAddCommentCollectorPage.clickButtonSale().clickFinalButton().checkMessage();
        return this;
    }

    public LoanAllCollectionHelper outSourceLoan() {
        loanAddCommentCollectorPage.scroll();
        loanAddCommentCollectorPage.clickMainButton();
        loanAddCommentCollectorPage.clickOutSourceButton().clickFinalButton().checkMessage();
        return this;
    }

    public LoanAllCollectionHelper legalExpertLoan() {
        loanAddCommentCollectorPage.scroll().clickMainButton();
        loanAddCommentCollectorPage.clickLegalExpertButton().clickFinalButton().checkMessage();
        return this;
    }

    public LoanAllCollectionHelper assigmentCollector() {
        loanAddCommentCollectorPage.scroll();
        loanAddCommentCollectorPage.clickMainButton();
        loanAddCommentCollectorPage.clickAssigmentButton().clickFinalButton().checkMessage();
        return this;
    }
}
