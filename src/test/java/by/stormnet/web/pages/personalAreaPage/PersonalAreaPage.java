package by.stormnet.web.pages.personalAreaPage;

import by.stormnet.web.pages.AbstractPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PersonalAreaPage extends AbstractPage {

    private String switchUserButton = "//tr[1]//td[1]//div[1]//a[1]";
    private String fieldInformation = "//div[@class='panel myCredit']//div[@class='panel-header']//span";
    private String informationText = "Активный заём";
    private String history = "//div[@id='wrapper']//li[2]//a[1]";
    private String document = "//div[@id='wrapper']//li[3]//a[1]";
    private String personal = "//div[@id='wrapper']//li[4]//a[1]";
    private String personInformationField = "//li[@class='active']//a";
    private String text = "Личные данные";
    private String howGetButton = "//li[2]//a[1]";
    private String howGetField = "//h1[@class='page-title page-title_orange']";
    private String howText = "Как получить";


    public PersonalAreaPage openPersonalAreaPage() {
        openUrl(baseUrl1);
        return this;
    }

    public PersonalAreaPage nextPage() {
        getTabs();
        navigateToTab(1, getTabs());
        return this;
    }

    public PersonalAreaPage clickSwitchUserButton() {
        getElement(switchUserButton).click();
        return this;
    }

    public PersonalAreaPage checkInformation() {
        waitForElementVisible(getElementBy(fieldInformation));
        WebElement element = getElement(fieldInformation);
        Assert.assertEquals(informationText, element.getText());
        return this;
    }

    public PersonalAreaPage checkHistory() {
        waitForElementClickable(getElementBy(history));
        getElement(history).click();
        return this;
    }

    public PersonalAreaPage checkDocument() {
        waitForElementClickable(getElementBy(document));
        getElement(document).click();
        return this;
    }

    public PersonalAreaPage checkPersonal() {
        waitForElementClickable(getElementBy(personal));
        getElement(personal).click();
        WebElement element1 = getElement(personInformationField);
        Assert.assertEquals(text, element1.getText());
        return this;
    }

    public PersonalAreaPage checkHowGetLoan() {
        waitForElementClickable(getElementBy(howGetButton));
        getElement(howGetButton).click();
        WebElement element = getElement(howGetField);
        Assert.assertEquals(howText, element.getText());
        return this;
    }
}
