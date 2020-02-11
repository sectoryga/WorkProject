package by.stormnet.web.helpers.settingsHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.settingsPage.AddRegionPage;

public class AddRegionHelper extends AbsractHelper {

    AddRegionPage addRegionPage = new AddRegionPage();

    public AddRegionHelper openUrlRemainderPage() {
        addRegionPage.navigateRegionPage()
                .getAddRegionButton()
                .clickAddReginButton()
                .fillRegion()
                .clickFinalBtnRegion()
                .checkMessageCreate();

        return this;
    }
}
