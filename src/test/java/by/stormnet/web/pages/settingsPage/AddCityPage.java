package by.stormnet.web.pages.settingsPage;

import by.stormnet.web.pages.AbstractPage;

public class AddCityPage extends AbstractPage {

    private String addRegionButton = "//a[@class='sonata-action-element']";
    private String regionField = "//input[@id='saa679a17e0_name']";
    private String finalButtonRegion = "//button[@name='btn_create_and_list']";


    public AddCityPage navigateCityPage() {
        openUrl(baseUrl10);
        return this;
    }

    public AddCityPage getAddCityButton() {
        waitForElementClickable(getElementBy(addRegionButton));
        return this;
    }

    public AddCityPage clickAddCityButton() {
        getElement(addRegionButton).click();
        return this;
    }

    public AddCityPage fillCity() {
        getElement(regionField).sendKeys("Алматинск");
        return this;
    }

    public AddCityPage clickFinalBtnRegion() {
        getElement(finalButtonRegion).click();
        return this;
    }
}
