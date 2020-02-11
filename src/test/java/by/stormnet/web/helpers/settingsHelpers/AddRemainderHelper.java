package by.stormnet.web.helpers.settingsHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.settingsPage.AddRemainderPage;


public class AddRemainderHelper extends AbsractHelper {

    AddRemainderPage addRemainderPage = new AddRemainderPage();

    public AddRemainderHelper openUrlRemainderPage() {
        addRemainderPage.navigateRemainderPage();
        return this;
    }


    public AddRemainderHelper addRemainder() {
        addRemainderPage.clickAddButton()
                .fillDaysRemainder(getRandom())
                .clickCheckBox()
                .clickFinalBtn()
                .checkMessageCreate();
        return this;
    }
}
