package by.stormnet.web.helpers.settingsHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.settingsPage.AddMarketingPage;

public class AddMarketingHelper extends AbsractHelper {

    AddMarketingPage addMarketingPage = new AddMarketingPage();

    public AddMarketingHelper OpenUrlMarketingPage() {
        addMarketingPage.navigateMarketingPage();
        return this;
    }

    public AddMarketingHelper addMarketingSettings() {
        addMarketingPage.clickAddButton()
                .clickFiltr()
                .clickAddFiltr()
                .fillValue()
                .clickMarketing()
                .getNameElement()
                .addName()
                .clickCheckBox()
                .dataStart()
                .dataStop()
                .filltime()
                .clickCheckBoxProlongation()
                .fillValidity()
                .clickFinalBtnCreate()
                .checkMessageCreate();
        return this;
    }
}
