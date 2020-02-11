package by.stormnet.web.pages.settingsPage;


import by.stormnet.web.pages.AbstractPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AdminAddPage extends AbstractPage {

    private String addButton = "//a[@class='sonata-action-element']";
    private String nameLoginField = "//input[@id='s531089f2c9_username']";
    private String nameLogin = "Александр";
    private String nameField = "//input[@id='s531089f2c9_name']";
    private String name = "Имя Администратор";
    private String firstnameField = "//input[@id='s531089f2c9_surname']";
    private String firstname = "Фамилия Администратор";
    private String phoneField = "//input[@id='s531089f2c9_phone']";
    private String phone = "777754644564";
    private String emailField = "//input[@id='s531089f2c9_email']";
    private String email = "sectoryga@yandex.ru";
    private String passwordField = "//input[@id='s531089f2c9_newPassword']";
    private String password = "12343432432";
    private String checkBox = "//*[@id=\"s531089f2c9_roles\"]/li[1]/div/label/div";
    private String createButton = "//button[@name='btn_create_and_edit']";
    private String checker = "//div[@class='alert alert-success alert-dismissable']";
    private String success = "×\n" +
            "Элемент создан успешно";


    public AdminAddPage navigateToAdminPage() {
        openUrl(baseUrl2);
        return this;
    }

    public AdminAddPage clickAddButton() {
        getElement(addButton).click();
        return this;
    }

    public AdminAddPage fillNameLogin() {
        getElement(nameLoginField).sendKeys(nameLogin);
        return this;
    }

    public AdminAddPage fillName() {
        getElement(nameField).sendKeys(name);
        return this;
    }

    public AdminAddPage fillFirstname() {
        getElement(firstnameField).sendKeys(firstname);
        return this;
    }

    public AdminAddPage fillPhone() {
        getElement(phoneField).sendKeys(phone);
        return this;
    }

    public AdminAddPage fillEmail() {
        getElement(emailField).sendKeys(email);
        return this;
    }

    public AdminAddPage fillPassword() {
        getElement(passwordField).sendKeys(password);
        return this;
    }

    public AdminAddPage clickcheckBox() {
        getElement(checkBox).click();
        return this;
    }

    public AdminAddPage clickcreateButton(){
        getElement(createButton).click();
        return this;
    }

    public AdminAddPage checkMessage() {
        WebElement element = getElement(checker);
        waitForElementVisible(getElementBy(checker));
        Assert.assertEquals(success, element.getText());
        return this;
    }
}
