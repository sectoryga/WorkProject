package by.stormnet.web.helpers.personalAreaHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.personalAreaPage.PersonalAreaPage;

public class PersonalAreaHelper extends AbsractHelper {

    PersonalAreaPage personalAreaPage = new PersonalAreaPage();


    public PersonalAreaHelper openUrl() {
        personalAreaPage.openPersonalAreaPage();
        return this;
    }

    public PersonalAreaHelper openUrlFront() {
        personalAreaPage.openUrlFront();
        return this;
    }

    public PersonalAreaHelper personalAreatest() throws InterruptedException {
        personalAreaPage.clickSwitchUserButton()
                .nextPage();
        Thread.sleep(1000);
        personalAreaPage.checkInformation()
                .checkHistory()
                .checkDocument()
                .checkPersonal();

        return this;
    }

    public PersonalAreaHelper HowGetAndOutPersonal() {
        personalAreaPage.checkHowGetLoan()
                .checkHowPay()
                .checkHowProlongation()
                .checkQuestions()
                .checkAboutUs()
                .quitPersonalArea();
        return this;
    }

}
