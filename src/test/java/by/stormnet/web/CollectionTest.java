package by.stormnet.web;

import by.stormnet.automation.core.utils.IOUtils;
import by.stormnet.web.helpers.collectionHelpers.LoanAllCollectionHelper;
import by.stormnet.web.helpers.loanHelpers.LoanDMEHelper;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CollectionTest {

//    private String username;
//    private String password;
//
//    @BeforeClass
//    public void setUp() {
//        username = IOUtils.loadGenericProperties("username", "configuration");
//        password = IOUtils.loadGenericProperties("password", "configuration");
//        verifyLoanHelper.openUrl();
//        verifyLoanHelper.loginAdmin(username, password);
//
//    }

    private LoanAllCollectionHelper loanAllCollectionHelper = new LoanAllCollectionHelper();
    private LoanDMEHelper verifyLoanHelper = new LoanDMEHelper();

    @Test(priority = 1)
    public void loanCollectionForSale() {
        loanAllCollectionHelper.openUrlCollection().saleLoan();
    }

    @Test(priority = 2)
    public void loanCollectionForOutSource() {
        loanAllCollectionHelper.openUrlCollection().outSourceLoan();
    }

    @Test(priority = 3)
    public void loanCollectionForLegalExpert() {
        loanAllCollectionHelper.openUrlCollection().legalExpertLoan();
    }

    @Test(priority = 4)
    public void assigmentCollector() {
        loanAllCollectionHelper.openUrlCollection().assigmentCollector();
    }

    @Test(priority = 5)
    public void addCommentCollector() {
        loanAllCollectionHelper.openUrlCollection().addComment();
    }

}


