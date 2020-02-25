package by.stormnet.web;

import by.stormnet.web.helpers.registrationHelpers.RegistrationStepFourHelper;
import by.stormnet.web.helpers.registrationHelpers.RegistrationStepOneHelper;
import by.stormnet.web.helpers.registrationHelpers.RegistrationStepThreeHelper;
import by.stormnet.web.helpers.registrationHelpers.RegistrationStepTwoHelper;
import org.testng.annotations.Test;

public class RegistrationFrontTest {

    RegistrationStepOneHelper registrationStepOneHelper = new RegistrationStepOneHelper();
    RegistrationStepTwoHelper registrationStepTwoHelper = new RegistrationStepTwoHelper();
    RegistrationStepThreeHelper registrationStepThreeHelper = new RegistrationStepThreeHelper();
    RegistrationStepFourHelper registrationStepFourHelper = new RegistrationStepFourHelper();

    @Test(priority = 1)
    public void registrationStepOneTest() {
        registrationStepOneHelper.openUrlRegistration().clickGetMoneyButtonAndOneStep(); }

    @Test(priority = 2)
    public void registrationStepTwoTest() {
        registrationStepTwoHelper.uploadInformation();
    }

    @Test(priority = 3)
    public void registrationStepTwoThree() {
        registrationStepThreeHelper.updateAdresInformation();
    }

    @Test(priority = 4)
    public void registrationStepTwoFour() {
        registrationStepFourHelper.updateInformationEmployment();
    }


}
