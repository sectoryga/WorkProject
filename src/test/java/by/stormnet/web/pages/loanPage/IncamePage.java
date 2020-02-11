package by.stormnet.web.pages.loanPage;

import by.stormnet.web.pages.AbstractPage;


public class IncamePage extends AbstractPage {

    private String incameButton = "//div[@class='content-wrapper']//ul[1]//li[4]//a[1]";
    private String cashField = "//input[@id='s04cb01c657_income']";
    private String dateField = "//input[@id='s04cb01c657_incomeDate']";
    private String viewButton = "//button[@name='btn_preview']";
    private String approveIncameButton = "//button[@name='btn_preview_approve']";
    private String otherIncame = "//a[@class='sonata-action-element']";

    public IncamePage navigateToPageLoan() {
        openUrl(baseUrl1);
        return this;
    }

    public boolean displayButton() {
        getElement(incameButton).isDisplayed();
        return false;
    }

    public IncamePage clickIncame() {
        getElement(incameButton).click();
        return this;
    }

    public void click() {
        if (displayButton()) {
            clickIncame();
        } else {
            clickOtherIncame();
        }
    }

    public IncamePage clickOtherIncame() {
        getElement(otherIncame).click();
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
