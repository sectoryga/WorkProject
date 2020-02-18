package by.stormnet.web.helpers.registrationHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.registartionPage.RegistrationStepFourPage;

public class RegistrationStepFourHelper extends AbsractHelper {

    RegistrationStepFourPage registrationStepFourPage = new RegistrationStepFourPage();

    public RegistrationStepFourHelper updateInformationEmployment() {
        registrationStepFourPage.updateEmployment()
                .updateAdressEmployment()
                .clickContinueButton()
                .updateIncome(phoneGeneration())
                .clickContinueButton()
                .updateIban()
                .clickContinueButton();
        System.out.print("Registration Step Four Сompleted");

        return this;
    }

    private String phoneGeneration() {
        String phone = "" + "777" + (int) (Math.random() * 9999999 + 10);
        return phone;
    }
}
