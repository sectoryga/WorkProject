package by.stormnet.web.helpers.registrationHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.registartionPage.RegistrationStepOnePage;

public class RegistrationStepOneHelper extends AbsractHelper {

    RegistrationStepOnePage registrationStepOnePage = new RegistrationStepOnePage();


    public RegistrationStepOneHelper openUrlRegistration() {
        registrationStepOnePage.navigateToPageSteoOne();
        return this;
    }

    public RegistrationStepOneHelper clickGetMoneyButtonAndOneStep() {
        registrationStepOnePage.clickGetMoneyButton()
                .fillEmail(emailGeneration())
                .fillPhoneNumber(phoneGeneration())
                .clickGetButton()
                .clickCheckBox()
                .fillPasswordOne()
                .fillPasswordTwo()
                .clickLink()
                .getCode();
        System.out.print("Registration Step One Сompleted");
        return this;
    }

    private String phoneGeneration() {
        String phone = "" + "777" + (int) (Math.random() * 9999999 + 10);
        return phone;
    }

    private String emailGeneration() {
        String email = "test" + (int) (Math.random() * 999999 + 10) + "@mail.ru";
        return email;
    }
}
