package by.stormnet.web.pages.settingsPage;

import by.stormnet.web.pages.AbstractPage;

public class AddRegionPage extends AbstractPage {

    private String addRegionButton = "//a[@class='sonata-action-element']";
    private String regionField = "//input[@id='s071f0e3d12_name']";
    private String finalButtonRegion = "//button[@name='btn_create_and_list']";

    public AddRegionPage navigateRegionPage() {
        openUrl(baseUrl9);
        return this;
    }

    public AddRegionPage getAddRegionButton(){
        waitForElementClickable(getElementBy(addRegionButton));
        return this;
    }

    public AddRegionPage clickAddReginButton() {
        getElement(addRegionButton).click();
        return this;
    }

    public AddRegionPage fillRegion(){
        getElement(regionField).sendKeys("Амстэрдам");
        return this;
    }

    public AddRegionPage clickFinalBtnRegion(){
        getElement(finalButtonRegion).click();
        return this;
    }
}
