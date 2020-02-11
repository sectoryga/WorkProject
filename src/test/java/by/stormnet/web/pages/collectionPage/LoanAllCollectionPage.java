package by.stormnet.web.pages.collectionPage;

import by.stormnet.web.pages.AbstractPage;

public class LoanAllCollectionPage extends AbstractPage {

    private String legalExpertButton = "//button[4]";
    private String commentButton = "//button[6]";
    private String outSourceButton = "//button[5]";
    private String assigmentButton = "//div[@class='row']//button[2]";
    private String selectDropDawn = "//span[@id='select2-chosen-5']";
    private String resultsDropDawn = ".select2-results-dept-0.select2-result.select2-result-selectable:nth-child(3)";
    private String dataField = ".input_loan_collector_need_riview.form-control";
    private String commentField = ".input_loan_comment.form-control";
    private String comment = "ПЕРЕЗВАНИТЬ ПО ИСТЕЧЕНИЮ СРОКА";
    private String data = "2019-09-10";
    private String saleButton = ".btn.btn-warning";


    public LoanAllCollectionPage navigateToPage() {
        openUrl(baseUrl4);
        return this;
    }

    public LoanAllCollectionPage scroll() {
        jsScroll();
        return this;
    }

    public LoanAllCollectionPage clickCommentButton() {
        getElement(commentButton).click();
        return this;
    }

    public LoanAllCollectionPage dropDawnSelect() {
        getElement(selectDropDawn).click();
        return this;
    }

    public LoanAllCollectionPage resultSelectDropDawn() {
        getElementByCss(resultsDropDawn).click();
        return this;
    }

    public LoanAllCollectionPage fillDataField() {
        getElementByCss(dataField).sendKeys(data);
        return this;
    }

    public LoanAllCollectionPage fillCommentField() {
        getElementByCss(commentField).sendKeys(comment);
        return this;
    }

    public LoanAllCollectionPage clickButtonSale() {
        getElementByCss(saleButton).click();
        return this;
    }

    public LoanAllCollectionPage clickOutSourceButton() {
        getElement(outSourceButton).click();
        return this;

    }

    public LoanAllCollectionPage clickLegalExpertButton() {
        getElement(legalExpertButton).click();
        return this;
    }

    public LoanAllCollectionPage clickAssigmentButton() {
        getElement(assigmentButton).click();
        return this;
    }

}


