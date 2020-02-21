package by.stormnet.web.pages.loanPage;

import by.stormnet.web.pages.AbstractPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class LoanActivePage extends AbstractPage {

    private String changeDataButton = "//button[3]";
    private String dataField = "//*[@id=\"sd7abac8d1f_giveDate\"]";
    private String closeDate = "//input[@id='sd7abac8d1f_force_close_date']";
    private String check = "//div[@class='read-more-wrap']";
    private String text = "Дата выдачи изменена успешно.";
    private String text1 = "Комиссия кредита успешно обновлена.";
    private String check1 = "//div[@class='read-more-wrap']";
    private String stopCashButton = "//button[@class='btn btn-primary']";
    private String verifireButton = ".btn.btn-warning";
    private String listVerifiresButton = ".btn.btn-info.btn-sm.sonata-ba-action";
    private String verifireName = "//tr[4]//td[5]//a[1]";
    private String finalButton = "//button[@name='btn_update_and_edit']";
    private String overdueButton = "//button[5]";
    private String closeButton = "//*[@id=\"divsd7abac8d1f_transition\"]/button[2]";
    private String errorButton = ".btn.btn-danger";
    private String errorButton2 = "//button[@class='btn btn-danger']";
    private String addCommentLoanButton = "//button[5]";
    private String fieldComment = "//textarea[@id='sd7abac8d1f_comment']";
    private String textComment = "ВОЗВРАЩЕН В ОФИСЕ КОМПАНИИ";
    private String fielfCommentClose = "//input[@id='sd7abac8d1f_force_close_reason']";
    private String commentClose = "ВОЗВРАЩЕН В ОФИСЕ ПО ПРОСЬБЕ МЕНЕДЖЕРА НАШЕЙ КОМПАНИИ";
    private String date = "2019-11-11T23:00:23";
    private String other = "//div[@class='row']//button[2]";


    public LoanActivePage navigateToPageLoan() {
        openUrl(baseUrl1);
        return this;
    }

    public LoanActivePage clickChangeButton() {
        getElement(changeDataButton).click();
        return this;
    }

    public LoanActivePage clearDateField(){
        getElement(dataField).clear();
        return this;
    }

    public LoanActivePage fillDate() {
        getElement(dataField).sendKeys(date);
        return this;
    }

    public LoanActivePage checkDateChange() {
        WebElement element = getElement(check);
        Assert.assertEquals(text, element.getText());
        return this;
    }

    public LoanActivePage checkCommisionLoanChange() {
        WebElement element = getElement(check1);
        Assert.assertEquals(text1, element.getText());
        return this;
    }

    public LoanActivePage clickOverdueButton() {
        getElement(overdueButton).click();
        return this;
    }

    public LoanActivePage clickAddCommentButton() {
        getElement(addCommentLoanButton).click();
        return this;
    }

    public LoanActivePage fillCommentField() {
        getElement(fieldComment).sendKeys(textComment);
        return this;
    }

    public LoanActivePage clickCloseLoanButton() {
        getElement(closeButton).click();
        return this;
    }

    public LoanActivePage fillDateClose() {
        getElement(closeDate).sendKeys(date);
        return this;
    }

    public LoanActivePage fillCommentCloseLoan() {
        getElement(fielfCommentClose).sendKeys(commentClose);
        return this;
    }

    public LoanActivePage clickButtonError() {
        getElement(errorButton2).click();
        return this;
    }

    public LoanActivePage clickOtherButton() {
        getElement(other).click();
        return this;
    }
    public int getElementlist(){
        return getElements(errorButton).size();
    }

    public void clickError() {
        if (getElementlist() == 2 ) {
            clickOtherButton();
        } else {
            clickButtonError();
        }
    }

    public LoanActivePage clickStopCashButton() {
        getElement(stopCashButton).click();
        return this;
    }

    public LoanActivePage clickButtonVerifire() {
        getElementByCss(verifireButton).click();
        return this;
    }

    public LoanActivePage clickListVerifires() {
        getElementByCss(listVerifiresButton).click();
        return this;
    }


    public LoanActivePage getElementVerifire() {
        waitForElementVisible(getElementBy(verifireName));
        return this;
    }

    public LoanActivePage clickVerifariName() {
        getElement(verifireName).click();
        return this;
    }

    public LoanActivePage getFinalButton() {
        waitForElementVisible(getElementBy(finalButton));
        return this;
    }

}