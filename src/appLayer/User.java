package appLayer;

public class User {

    public boolean isValidUserCredentials(String sUserName, String sUserPassword) {

        if (sUserName.equals("jan") && sUserPassword.equals("123")) {
            return true;
        }

        return false;
    }
}
