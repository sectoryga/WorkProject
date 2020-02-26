package by.stormnet.web.pages.settingsPage;

import by.stormnet.web.pages.AbstractPage;

public class AddRemainderPage extends AbstractPage {

    private String addButton = "//a[@class='sonata-action-element']";
    private String daysRemainderField = "//input[@id='s53b2e07b97_days']";
    private String checkBox = "//div[@class='iradio_square-blue']//ins[@class='iCheck-helper']";
    private String finalBtn = "//button[@name='btn_create_and_list']";

    public AddRemainderPage navigateRemainderPage() {
        openUrl(baseUrl7);
        return this;
    }

    public AddRemainderPage clickAddButton() {
        getElement(addButton).click();
        return this;
    }

    public AddRemainderPage fillDaysRemainder(String chislo) {
        getElement(daysRemainderField).sendKeys(chislo);
        return this;
    }

    public AddRemainderPage clickCheckBox() {
        getElement(checkBox).click();
        return this;
    }

    public AddRemainderPage clickFinalBtn() {
        waitForElementClickable(getElementBy(finalBtn));
        getElement(finalBtn).click();
        return this;
    }


}
