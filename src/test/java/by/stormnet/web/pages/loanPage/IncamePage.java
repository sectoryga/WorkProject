package by.stormnet.web.pages.loanPage;

import by.stormnet.web.pages.AbstractPage;


public class IncamePage extends AbstractPage {

    private String incameButton = "//a[@class='sonata-action-element']";
    private String cashField = "//input[@id='s04cb01c657_income']";
    private String dateField = "//input[@id='s04cb01c657_incomeDate']";
    private String viewButton = "//button[@name='btn_preview']";
    private String approveIncameButton = "//button[@name='btn_preview_approve_to_loan_edit']";
    private String otherIncame = "//ul[@class='nav navbar-nav navbar-right']//a[@class='sonata-action-element']";
    private String addIncameButtonMain = "//div[@class='content-wrapper']//ul[1]//li[4]//a[1]";
    private String button = "/html/body/div[1]/div/section[1]/div/nav/div/div/ul[1]/li/a";

    public IncamePage navigateToPageLoan() {
        openUrl(baseUrl1);
        return this;
    }

    public IncamePage clickButtonAdd() {
        getElement(addIncameButtonMain).click();
        return this;
    }

    public boolean cliakAddIncame() {
        getElement(button).isDisplayed();
        return true;
    }

    public void clickButtonElse() {
        if (cliakAddIncame()) {
            getElement(button).click();
        } else {
            clickIncame();
        }
    }

    public IncamePage clickIncame() {
        waitForElementClickable(getElementBy(incameButton));
        getElement(incameButton).click();
        return this;
    }


    public IncamePage fillDateCash() {
        getElement(dateField).sendKeys("2020-01-11T09:03:59");
        return this;
    }

    public IncamePage fillCash(String sum) {
        getElement(cashField).sendKeys(sum);
        return this;
    }

    public IncamePage clickView() {
        getElement(viewButton).click();
        return this;
    }

    public IncamePage getFinalBtn() {
        waitForElementVisible(getElementBy(approveIncameButton));
        return this;
    }

    public IncamePage clickApproveIncame() {
        jsScroll();
        jsScroll();
        getFinalBtn();
        getElement(approveIncameButton).click();
        return this;
    }

}