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
        String brt = "19" + birth_yy + "-" + birth_mm + "-" + birth_dd;
        String date = "" + birth_yy + birth_mm + birth_dd + sex + justice;
        char[] strToArray = date.toCharArray();
        for (int i = 0; i < strToArray.length; i++) {
            tr += (i + 1) * strToArray[i];
        }
        int sum = tr % 11;
        if (sum <= 10) {
            inn = "" + date + sum;
        } else {
            generatorInn();
        }
        return inn;
    }

    private String generatorNumberPassport() {
        String num = "1" + (int) (Math.random() * 999999999 + 10);
        return num;
    }
}