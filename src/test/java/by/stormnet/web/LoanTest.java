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

    @Test(priority = 1, skipFailedInvocations = true)
    public void approvalLoanOne() {
        verifyLoanHelper.openUrl().approvalLoanOne();
    }

    @Test(priority = 1, skipFailedInvocations = true)
    public void approvalLoanTwo() {
        verifyLoanHelper.openUrl().approvalLoanTwo();
    }

    @Test(priority = 2, invocationCount = 2, skipFailedInvocations = true)
    public void approvalLoanClient() {
        loanApproval.openUrl1().approvalClienLoan();
    }

    @Test(priority = 3, skipFailedInvocations = true)
    public void giveOutLoan() {
        loanApproval.openApproval().giveoutLoan();
    }

    @Test(priority = 4, skipFailedInvocations = true)
    public void addCommenFromLoan() {
        loanActiveHelper.addCommentLoan();
    }

    @Test(priority = 5, skipFailedInvocations = true)
    public void changeLoanDate() {
        loanActiveHelper.changeDate();
    }

    @Test(priority = 6, invocationCount = 3, skipFailedInvocations = true)
    public void incameTest() {
        incameHelper.addIncameLoan();
    }

    @Test(priority = 7, skipFailedInvocations = true)
    public void assigmentVerifier() throws InterruptedException {
        loanActiveHelper.assigmentVerifier();
    }

    @Test(priority = 8, skipFailedInvocations = true)
    public void stopCashFromLoan() {
        loanActiveHelper.stopCash();
    }

    @Test(priority = 9, skipFailedInvocations = true)
    public void returnCashFromLoan() {
        loanActiveHelper.returnCash();
    }

    @Test(priority = 10, skipFailedInvocations = true)
    public void makeOverdue() {
        loanActiveHelper.makeOverdueLoan();
    }

    @Test(priority = 11, skipFailedInvocations = true)
    public void closeLoan() {
        loanActiveHelper.closeLoan();
    }

    @Test(priority = 12, skipFailedInvocations = true)
    public void errorWorkingLoan() {
        loanActiveHelper.openUrlLoanPage().errorLoan();
    }

    @Test(priority = 13, skipFailedInvocations = true)
    public void stopFromLoan() {
        loanStopHelper.openUrlLoan().stopLoan();
    }

}

