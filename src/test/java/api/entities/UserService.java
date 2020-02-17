package api.entities;

import by.stormnet.automation.core.FrameworkHttpClient;
import by.stormnet.automation.core.Response;

public class UserService extends AbstractService {

    private FrameworkHttpClient client = new FrameworkHttpClient();
    private String userUrl = baseAppUrl + "/user";

    public Response getUsersList() {
        System.out.println("Get users list request");
        return client.doGet(userUrl);
    }

    public Response createNewUser(String userPhone) {
        System.out.println("Create new user with data" + userPhone);
        return client.doPost(userUrl, userPhone);
    }
}