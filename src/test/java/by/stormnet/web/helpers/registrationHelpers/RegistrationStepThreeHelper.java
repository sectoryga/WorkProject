package by.stormnet.web.helpers.registrationHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.registartionPage.RegistrationStepThreePage;

public class RegistrationStepThreeHelper extends AbsractHelper {

    RegistrationStepThreePage registrationStepThreePage = new RegistrationStepThreePage();

    public RegistrationStepThreeHelper updateAdresInformation() {
        registrationStepThreePage.fillAdress()
                .fillPhone(phoneGeneration())
                .clickRegion()
                .clickContinueButton()
                .addContactName(phoneGeneration())
                .clickContinueButton();
        System.out.print("Registration Step Three Сompleted");
        return this;
    }

    private String phoneGeneration() {
        String phone = "" + "777" + (int) (Math.random() * 9999999 + 10);
        return phone;
    }

}
