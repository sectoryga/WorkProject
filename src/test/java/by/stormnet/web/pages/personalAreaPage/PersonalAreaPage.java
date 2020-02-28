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
    private String howGetText = "Как получить кредит?";
    private String howGetpayButton = "//li[3]//a[1]";
    private String howGetPayField = "//h1[@class='page-title page-title_orange']";
    private String howPayText = "Как погасить";
    private String howGetProlongationButton = "//li[4]//a[1]";
    private String howGetProlongationField = "//h1[@class='page-title page-title_orange']";
    private String howProlongationText = "Как продлить";
    private String QuestionsButton = "//li[5]//a[1]";
    private String QuestionsField = "//h1[@class='page-title page-title_orange']";
    private String QuestionsText = "Как продлить";
    private String AboutUsButton = "//li[6]//a[1]";
    private String AboutUsField = "//h1[@class='page-title page-title_orange']";
    private String AboutUsText = "О нас";
    private String quitButton = "//li[7]//a[1]";


    public PersonalAreaPage openPersonalAreaPage() {
        openUrl(baseUrl1);
        return this;
    }

    public PersonalAreaPage openUrlFront() {
        openUrl(baseUrl13);
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
        getElement(howGetButton).click();
        waitForElementVisible(getElementBy(howGetField));
        WebElement element = getElement(howGetField);
        Assert.assertEquals(howGetText, element.getText());
        return this;
    }

    public PersonalAreaPage checkHowPay() {
        getElement(howGetpayButton).click();
        waitForElementVisible(getElementBy(howGetPayField));
        WebElement element = getElement(howGetPayField);
        Assert.assertEquals(howPayText, element.getText());
        return this;
    }

    public PersonalAreaPage checkHowProlongation() {
        getElement(howGetProlongationButton).click();
        waitForElementVisible(getElementBy(howGetProlongationField));
        WebElement element = getElement(howGetProlongationField);
        Assert.assertEquals(howProlongationText, element.getText());
        return this;
    }

    public PersonalAreaPage checkQuestions() {
        getElement(QuestionsButton).click();
        waitForElementVisible(getElementBy(QuestionsField));
        WebElement element = getElement(QuestionsField);
        Assert.assertEquals(QuestionsText, element.getText());
        return this;
    }

    public PersonalAreaPage checkAboutUs() {
        getElement(AboutUsButton).click();
        waitForElementVisible(getElementBy(AboutUsField));
        WebElement element = getElement(AboutUsField);
        Assert.assertEquals(AboutUsText, element.getText());
        return this;
    }

    public PersonalAreaPage quitPersonalArea() {
        getElement(quitButton).click();
        return this;
    }
}
