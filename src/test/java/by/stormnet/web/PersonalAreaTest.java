package by.stormnet.web;

import by.stormnet.automation.core.utils.IOUtils;
import by.stormnet.web.helpers.personalAreaHelpers.PersonalAreaHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PersonalAreaTest {

    PersonalAreaHelper personalAreaHelper = new PersonalAreaHelper();

//    private String username;
//    private String password;
//
//    @BeforeClass
//    public void setUp() {
//        username = IOUtils.loadGenericProperties("username", "configuration");
//        password = IOUtils.loadGenericProperties("password", "configuration");
//        personalAreaHelper.openUrl();
//        personalAreaHelper.loginAdmin(username, password);
//
//    }


    @Test(priority = 1, skipFailedInvocations = true)
    public void howGetAndOutTest() {
        personalAreaHelper.openUrlFront().HowGetAndOutPersonal();
    }

    @Test(priority = 2, skipFailedInvocations = true)
    public void personalAreaTest() throws InterruptedException {
        personalAreaHelper.openUrl().personalAreatest();
    }

    @AfterClass
    public void tearDowmn() {
        personalAreaHelper.close();
    }

}
