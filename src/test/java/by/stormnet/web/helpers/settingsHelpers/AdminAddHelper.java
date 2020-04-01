package by.stormnet.web.helpers.settingsHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.settingsPage.AdminAddPage;

public class AdminAddHelper extends AbsractHelper {

    AdminAddPage adminAddPage = new AdminAddPage();

    public AdminAddHelper openUrlLoanPage() {
        adminAddPage.navigateToAdminPage();
        return this;
    }

    public AdminAddHelper addNewAdmin() {
        adminAddPage.clickAddButton()
                .fillNameLogin()
                .fillName()
                .fillFirstname()
                .fillPhone()
                .fillEmail()
                .clickcheckBox()
                .clickcreateButton()
                .checkMessage();

        return this;
    }
}
