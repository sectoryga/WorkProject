package api;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class ApiTest {

    private static final Logger logger = Logger.getLogger(api.ApiTest.class);
    private int SmsCode;
    private int UserId;
    private int LoanId;
    private String UserToken;
    private String url = "https://api3.kz.aventus.work/user/";


    @Test
    public void registrationStepOne() {
        RestAssured.baseURI = "https://api3.kz.aventus.work";
        JSONObject requestParams = new JSONObject();
        RequestSpecification httpRequest = io.restassured.RestAssured.given();
        requestParams.put("mobile_phone", "777" + (int) (Math.random() * 9999999 + 10));
        requestParams.put("email", "test" + (int) (Math.random() * 999 + 10) + "@mail.ru");
        requestParams.put("agreed", "1");
        httpRequest.header("Content-type", "application/json");
        httpRequest.body(requestParams.toString());
        io.restassured.response.Response response = httpRequest.request(Method.POST, "/user");
        String responseBody = response.body().asString();
        JSONObject myResposnseBody = new JSONObject(responseBody);
        SmsCode = myResposnseBody.getInt("code");
        UserId = myResposnseBody.getInt("id");
        UserToken = myResposnseBody.getString("token");
        logger.info(myResposnseBody);
        Assert.assertEquals(201, response.getStatusCode());
        logger.info("UserRegistration complited");
    }


    @Test(dependsOnMethods = "registrationStepOne")
    protected void registrationStepTwo() {
        RestAssured.baseURI = url + UserId + "/phone-confirmation";
        JSONObject requestParams = new JSONObject();
        RequestSpecification httpRequest = RestAssured.given();
        requestParams.put("code", SmsCode);
        httpRequest.header("Content-Type", "application/json");
        httpRequest.header("apikey", UserToken);
        httpRequest.body(requestParams.toString());
        io.restassured.response.Response response = httpRequest.request(Method.POST);
        Assert.assertEquals(response.getStatusCode(), 200);
        logger.info("PhoneConfirmation complited");
    }

    @Test(dependsOnMethods = "registrationStepTwo")
    public void registrationStepThree() {
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
        if (sum == 10) {
            sum = sum-2;
        } else {
            inn = "" + date + sum;
        }
        RestAssured.baseURI = url + UserId;
        JSONObject requestParams = new JSONObject();
        RequestSpecification httpRequest = RestAssured.given();
        requestParams.put("date_of_birth", brt);
        requestParams.put("first_name", "Александр");
        requestParams.put("gender", "m");
        requestParams.put("last_name", "Друщиц");
        requestParams.put("middle_name", "Викторович" + (int) (Math.random() * 999 + 10));
        requestParams.put("personal_id", inn);
        requestParams.put("date_issued", "2018-12-01");
        requestParams.put("document_number", "1" + (int) (Math.random() * 99999999 + 10));
        requestParams.put("document_type", "1");
        requestParams.put("issued_by", 1);
        requestParams.put("apartment_registered", (int) (Math.random() * 99 + 10));
        requestParams.put("city_registered", "almaty_city");
        requestParams.put("home_phone_registered", "777" + (int) (Math.random() * 9999999 + 10));
        requestParams.put("house_registered", (int) (Math.random() * 99 + 10));
        requestParams.put("not_actual_address", 1);
        requestParams.put("region_registered", "astana_city_region");
        requestParams.put("street_registered", "варовапрв");
        requestParams.put("apartment_actual", (int) (Math.random() * 99 + 10));
        requestParams.put("city_actual", "almaty_city");
        requestParams.put("house_actual", (int) (Math.random() * 99 + 10));
        requestParams.put("region_actual", "astana_city_region");
        requestParams.put("street_actual", "вапывап");
        requestParams.put("contact_name", "Василий");
        requestParams.put("contact_phone_registered", "777" + (int) (Math.random() * 9999999 + 10));
        requestParams.put("contact_type", 3);
        requestParams.put("home_phone_registered", "777" + (int) (Math.random() * 9999999 + 10));
        requestParams.put("education", 1);
        requestParams.put("employer", "название");
        requestParams.put("employer_activity", "1");
        requestParams.put("employer_address", "адресс");
        requestParams.put("position", "1");
        requestParams.put("position_typ", "3");
        requestParams.put("work_experience_last", 1);
        requestParams.put("additional_income_amount", "15000");
        requestParams.put("work_phone", "777" + (int) (Math.random() * 9999999 + 10));
        requestParams.put("marital_status", 1);
        requestParams.put("monthly_income", "100000");
        requestParams.put("number_of_children", 1);
        requestParams.put("bank_account_number", "KZ694507456745686478");
        requestParams.put("method_of_disbursement", 1);
        httpRequest.body(requestParams.toString());
        httpRequest.header("Content-Type", "application/json");
        httpRequest.header("apikey", UserToken);
        io.restassured.response.Response response = httpRequest.request(Method.PATCH);
        String responseHeader = response.getHeader("X-Debug-Token-Link");
        logger.info(responseHeader);
        Assert.assertEquals(response.getStatusCode(), 200);
        logger.info("UpdateUserInformation complited");
    }

    @Test(dependsOnMethods = "registrationStepThree")
    public void registrationStepFour() {
        RestAssured.baseURI = "https://api3.kz.aventus.work/loan";
        JSONObject requestParams = new JSONObject();
        RequestSpecification httpRequest = RestAssured.given();
        requestParams.put("loan_period", 10);
        requestParams.put("loan_sum", 10000);
        requestParams.put("user_id", UserId);
        httpRequest.body(requestParams.toString());
        httpRequest.header("Content-Type", "application/json");
        httpRequest.header("apikey", UserToken);
        io.restassured.response.Response response = httpRequest.request(Method.POST);
        String responseBody = response.body().asString();
        String responseHeader = response.getHeader("X-Debug-Token-Link");
        logger.info(responseHeader);
        JSONObject myResposnseBody = new JSONObject(responseBody);
        logger.info(myResposnseBody);
        LoanId = myResposnseBody.getInt("id");
        logger.info("LoanRequest sent successfully");
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("Create User id = " + UserId);
        System.out.println("Create Loan id = " + LoanId);
    }

}