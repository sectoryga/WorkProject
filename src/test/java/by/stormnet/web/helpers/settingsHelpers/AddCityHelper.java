package by.stormnet.web.helpers.settingsHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.settingsPage.AddCityPage;

public class AddCityHelper extends AbsractHelper {

    AddCityPage addCityPage = new AddCityPage();

    public AddCityHelper openUrlCityPage() {
        addCityPage.navigateCityPage()
                .getAddCityButton()
                .clickAddCityButton()
                .fillCity()
                .clickFinalBtnRegion()
                .checkMessageCreate();

        return this;
    }
}
