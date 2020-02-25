package by.stormnet.web.helpers.registrationHelpers;

import by.stormnet.web.helpers.AbsractHelper;
import by.stormnet.web.pages.registartionPage.RegistrationStepTwoPage;

public class RegistrationStepTwoHelper extends AbsractHelper {

    RegistrationStepTwoPage registrationStepTwoPage = new RegistrationStepTwoPage();


    public RegistrationStepTwoHelper uploadInformation() {
        registrationStepTwoPage.fillLastName()
                .fillFirstName()
                .fillMiddleName()
                .fillInn(generatorInn())
                .clickContinueButton()
                .fillNumberPassport(generatorNumberPassport())
                .clickGiveOutPassport()
                .fillDateGiveOut()
                .clickContinueButton();
        System.out.print("Registration Step Two Сompleted");
        return this;
    }

    private String generatorInn() {
        int tr = 0;
        String inn = "";
        int birth_yy = (int) (Math.random() * (39 + 1) + 60);
        int birth_mm = (int) (Math.random() * (3) + 10);
        int birth_dd = (int) (Math.random() * (18 + 1) + 10);
        int justice = (int) (Math.random() * (8888 + 1) + 1000);
        int sex = 1;
        String date = "" + birth_yy + birth_mm + birth_dd + sex + justice;
        char[] strToArray = date.toCharArray();
        tr = (strToArray[0] + 2 * strToArray[1] +
                3 * strToArray[2] + 4 * strToArray[3] +
                5 * strToArray[4] + 6 * strToArray[5] +
                7 * strToArray[6] + 8 * strToArray[7] +
                9 * strToArray[8] + 10 * strToArray[9] +
                11 * strToArray[10]) % 11;
        inn = "" + date + tr;
        return inn;
    }

    private String generatorNumberPassport() {
        String num = "1" + (int) (Math.random() * 999999999 + 10);
        return num;
    }
}