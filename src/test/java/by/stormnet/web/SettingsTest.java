package by.stormnet.web;

import by.stormnet.automation.core.utils.IOUtils;
import by.stormnet.web.helpers.loanHelpers.LoanActiveHelper;
import by.stormnet.web.helpers.loanHelpers.LoanApprovalLoanClientHelper;
import by.stormnet.web.helpers.loanHelpers.LoanDMEHelper;
import by.stormnet.web.helpers.loanHelpers.LoanStopHelper;
import by.stormnet.web.helpers.settingsHelpers.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SettingsTest {

    private AddRemainderHelper addRemainderHelper = new AddRemainderHelper();
    private AddMarketingHelper addMarketingHelper = new AddMarketingHelper();
    private AdminAddHelper adminAddHelper = new AdminAddHelper();
    private AddAffilateHelper addAffilateHelper = new AddAffilateHelper();
    private AddRegionHelper addRegionHelper = new AddRegionHelper();
    private AddCityHelper addCityHelper = new AddCityHelper();
    private LoanDMEHelper verifyLoanHelper = new LoanDMEHelper();

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

    @Test(priority = 1)
    public void addNewAdmin() {
        adminAddHelper.openUrlLoanPage().addNewAdmin();
    }

    @Test(priority = 2)
    public void addAffilate() {
        addAffilateHelper.openUrlAffilatePage().addAffilate();
    }

    @Test(priority = 3)
    public void addRemainder() {
        addRemainderHelper.openUrlRemainderPage().addRemainder();
    }

    @Test(priority = 4)
    public void addMarketingSettings() {
        addMarketingHelper.OpenUrlMarketingPage().addMarketingSettings();
    }

    @Test(priority = 5)
    public void addRegion() {
        addRegionHelper.openUrlRemainderPage();
    }

    @Test(priority = 6)
    public void addCity() {
        addCityHelper.openUrlCityPage();
    }

}
