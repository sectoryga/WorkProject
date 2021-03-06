package by.stormnet.web.pages.loanPage;

import by.stormnet.web.pages.AbstractPage;


public class IncamePage extends AbstractPage {

    private String incameButton = "//a[@class='sonata-action-element']";
    private String cashField = "//input[@id='s04cb01c657_income']";
    private String dateField = "//input[@id='s04cb01c657_incomeDate']";
    private String viewButton = "//button[@name='btn_preview']";
    private String approveIncameButton = "//button[@name='btn_preview_approve_to_loan_edit']";
    private String addIncameButtonMain = "//div[@class='content-wrapper']//ul[1]//li[4]//a[1]";
    private String button = "/html/body/div[1]/div/section[1]/div/nav/div/div/ul[1]/li/a";

    public IncamePage clickButtonAdd() {
        waitForElementClickable(getElementBy(addIncameButtonMain));
        getElement(addIncameButtonMain).click();
        return this;
    }

    public boolean cliakAddIncame() {
        waitForElementVisible(getElementBy(button));
        getElement(button).isDisplayed();
        return true;
    }

    public IncamePage clickButtonElse() {
        if (cliakAddIncame()) {
            waitForElementClickable(getElementBy(button));
            getElement(button).click();
        } else {
            clickIncame();
        }
        return this;
    }

    public IncamePage clickIncame() {
        waitForElementClickable(getElementBy(incameButton));
        getElement(incameButton).click();
        return this;
    }

    public IncamePage fillCash(String sum) {
        waitForElementVisible(getElementBy(cashField));
        getElement(cashField).sendKeys(sum);
        return this;
    }

    public IncamePage clickView() {
        waitForElementClickable(getElementBy(viewButton));
        getElement(viewButton).click();
        return this;
    }


    public IncamePage clickApproveIncame() {
        jsScroll();
        jsScroll();
        waitForElementVisible(getElementBy(approveIncameButton));
        getElement(approveIncameButton).click();
        return this;
    }

}