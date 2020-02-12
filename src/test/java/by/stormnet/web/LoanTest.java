package by.stormnet.web;

import by.stormnet.automation.core.utils.IOUtils;
import by.stormnet.web.helpers.loanHelpers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoanTest {

    private LoanDMEHelper verifyLoanHelper = new LoanDMEHelper();
    private LoanApprovalLoanClientHelper loanApproval = new LoanApprovalLoanClientHelper();
    private LoanStopHelper loanStopHelper = new LoanStopHelper();
    private LoanActiveHelper loanActiveHelper = new LoanActiveHelper();
    private IncameHelper incameHelper = new IncameHelper();

    private String username;
    private String password;

    @BeforeClass
    public void setUp() {
        username = IOUtils.loadGenericProperties("username", "configuration");
        password = IOUtils.loadGenericProperties("password", "configuration");
        verifyLoanHelper.openUrl();
        verifyLoanHelper.loginAdmin(username, password);

    }

    @Test(priority = 1,invocationCount = 2)
    public void approvalLoan() { verifyLoanHelper.openUrl().approvalLoan(); }

    @Test(priority = 2)
    public void approvalLoanClient() { loanApproval.openUrl1().approvalClienLoan(); }

    @Test(priority = 3,skipFailedInvocations = true)
    public void stopFromLoan() {
        loanStopHelper.openUrlLoan().stopLoan();
    }

    @Test(priority = 4)
    public void giveOutLoan(){ loanApproval.openApproval().giveoutLoan(); }
`
    @Test(priority = 5)
    public void stopCashFromLoan() {
        loanActiveHelper.openUrlLoanPage().stopCash();
    }

    @Test(priority = 6)
    public void returnCashFromLoan() {
        loanActiveHelper.openUrlLoanPage().returnCash();
    }

    @Test(priority = 7)
    public void assigmentVerifier() throws InterruptedException { loanActiveHelper.openUrlLoanPage().assigmentVerifier(); }

    @Test(priority = 8)
    public void errorWorkingLoan() { loanActiveHelper.openUrlLoanPage().errorLoan(); }

    @Test(priority = 9)
    public void changeLoanDate() {
        loanActiveHelper.openUrlLoanPage().changeDate();
    }

    @Test(priority = 10)
    public void makeOverdue() {
        loanActiveHelper.openUrlLoanPage().makeOverdueLoan();
    }

    @Test(priority = 11)
    public void addCommenFromLoan() { loanActiveHelper.openUrlLoanPage().addCommentLoan(); }

    @Test(priority = 12, skipFailedInvocations = true)
    public void closeLoan() {
        loanActiveHelper.openUrlLoanPage().closeLoan();
    }

    @Test(priority = 13,invocationCount = 3)
    public void incameTest(){ incameHelper.openUrlLoanPage().addIncameLoan(); }

}

