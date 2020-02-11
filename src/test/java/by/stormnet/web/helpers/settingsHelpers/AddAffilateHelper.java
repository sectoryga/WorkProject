package by.stormnet.web.helpers.settingsHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.settingsPage.AddAffilatePage;

public class AddAffilateHelper extends AbsractHelper {

    AddAffilatePage addAffilatePage = new AddAffilatePage();

    public AddAffilateHelper openUrlAffilatePage() {
        addAffilatePage.navigateToAffilatePage();
        return this;
    }


    public AddAffilateHelper addAffilate() {
        addAffilatePage.clickAddButton()
                .fillAffilateName()
                .fillUrlPostBack()
                .fillParametr()
                .clickSettings()
                .clickFinalButtonThis()
                .checkMessageCreate();

        return this;
    }

}
