package by.stormnet.web.pages.settingsPage;

import by.stormnet.web.pages.AbstractPage;

import javax.xml.soap.SAAJResult;

public class AddAffilatePage extends AbstractPage {

    private String addButton = "//a[@class='sonata-action-element']";
    private String nameAffilateField = "//input[@id='sb44d0e6657_name']";
    private String nameAffilate = "My Affilate";
    private String postBackField = "//input[@id='sb44d0e6657_url']";
    private String postBack = "https://testPostBack/com";
    private String parametrField = "//input[@id='sb44d0e6657_orderFieldName']";
    private String parametr = "MeParametr";
    private String settings = "//div[@class='content-wrapper']//li[2]//a[1]";
    private String finalButton = "//button[@name='btn_create_and_edit']";
    private String utmField = "//input[@id='sb44d0e6657_utmSource']";

    public AddAffilatePage navigateToAffilatePage() {
        openUrl(baseUrl6);
        return this;
    }

    public AddAffilatePage clickAddButton() {
        getElement(addButton).click();
        return this;
    }

    public AddAffilatePage fillAffilateName() {
        getElement(nameAffilateField).sendKeys(nameAffilate);
        return this;
    }

    public AddAffilatePage fillUrlPostBack() {
        getElement(postBackField).sendKeys(postBack);
        return this;
    }

    public AddAffilatePage fillUtmSource(){
        getElement(utmField).sendKeys("wwww.onliner.by");
        return this;
    }

    public AddAffilatePage fillParametr() {
        getElement(parametrField).sendKeys(parametr);
        return this;
    }

    public AddAffilatePage clickSettings() {
        getElement(settings).click();
        return this;
    }

    public AddAffilatePage clickFinalButtonThis() {
        getElement(finalButton).click();
        return this;
    }

}
