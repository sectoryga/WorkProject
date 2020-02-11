package by.stormnet.web.pages.settingsPage;

import by.stormnet.web.pages.AbstractPage;

public class AddMarketingPage extends AbstractPage {


    private String addButton = "//a[@class='sonata-action-element']";
    private String nameField = "//input[@id='s441ba10103_name']";
    private String checkBox = "//*[@id=\"sonata-ba-field-container-s441ba10103_enabled\"]/div/div/label/div/ins";
    private String startDate = "//input[@id='s441ba10103_dateFrom']";
    private String stopDate = "//input[@id='s441ba10103_dateTo']";
    private String timeField = "//input[@id='s441ba10103_startTime']";
    private String prolongation = "//*[@id=\"sonata-ba-field-container-s441ba10103_extendUnusedDiscount\"]/div/div/label/div/ins";
    private String filtrButton = "//div[@class='content-wrapper']//li[2]//a[1]";
    private String finalBtn = "//button[@name='btn_create_and_list']";
    private String validity = "//input[@id='s441ba10103_discountTermDay']";
    private String addFiltrButton = "//a[@class='btn btn-success btn-sm sonata-ba-action']";
    private String valueField = "//input[@id='s441ba10103_filters_0_value']";
    private String returnMarketing = "//div[@class='content-wrapper']//li[1]//a[1]";


    public AddMarketingPage navigateMarketingPage() {
        openUrl(baseUrl8);
        return this;
    }

    public AddMarketingPage clickAddButton() {
        getElement(addButton).click();
        return this;
    }

    public AddMarketingPage addName() {
        getElement(nameField).sendKeys("My Marketing");
        return this;
    }

    public AddMarketingPage getNameElement() {
        waitForElementClickable(getElementBy(nameField));
        return this;
    }

    public AddMarketingPage clickCheckBox() {
        getElement(checkBox).click();
        return this;
    }

    public AddMarketingPage dataStart() {
        getElement(startDate).sendKeys("1 янв. 2020 г.");
        return this;
    }

    public AddMarketingPage dataStop() {
        getElement(stopDate).sendKeys("19 июня 2020 г.");
        return this;
    }

    public AddMarketingPage filltime() {
        getElement(timeField).sendKeys("10:10");
        return this;
    }

    public AddMarketingPage clickCheckBoxProlongation() {
        jsScroll();
        getElement(prolongation).click();
        return this;
    }

    public AddMarketingPage fillValidity() {
        getElement(validity).sendKeys("10");
        return this;
    }

    public AddMarketingPage clickFinalBtnCreate() {
        jsScroll();
        getElement(finalBtn).click();
        return this;
    }

    public AddMarketingPage getFiltrElement() {
        waitForElementVisible(getElementBy(filtrButton));
        return this;
    }

    public AddMarketingPage clickFiltr() {
        getFiltrElement();
        getElement(filtrButton).click();
        return this;
    }

    public AddMarketingPage getAddFiltrElement() {
        waitForElementClickable(getElementBy(addFiltrButton));
        return this;
    }

    public AddMarketingPage clickAddFiltr() {
        getAddFiltrElement();
        getElement(addFiltrButton).click();
        return this;
    }

    public AddMarketingPage getValueElement() {
        waitForElementVisible(getElementBy(valueField));
        return this;
    }

    public AddMarketingPage fillValue() {
        getValueElement();
        getElement(valueField).sendKeys("11");
        return this;
    }

    public AddMarketingPage getMarketingElement() {
        waitForElementVisible(getElementBy(returnMarketing));
        return this;
    }

    public AddMarketingPage clickMarketing() {
        getMarketingElement();
        getElement(returnMarketing).click();
        return this;
    }

}
