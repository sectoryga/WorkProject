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

    @Test
    public void registrationStepOneTest() {
        registrationStepOneHelper.openUrlRegistration().clickGetMoneyButtonAndOneStep();

    }

    @Test(dependsOnMethods = "registrationStepOneTest")
    public void registrationStepTwoTest() {
        registrationStepTwoHelper.uploadInformation();
    }

    @Test(dependsOnMethods = "registrationStepTwoTest")
    public void registrationStepTwoThree() {
        registrationStepThreeHelper.updateAdresInformation();
    }

    @Test(dependsOnMethods = "registrationStepTwoThree")
    public void registrationStepTwoFour() {
        registrationStepFourHelper.updateInformationEmployment();
    }


}
