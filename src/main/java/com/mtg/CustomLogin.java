package com.mtg;

import org.springframework.security.crypto.bcrypt.BCrypt;

/**
 * Created by ryanj on 5/23/2017.
 */
public class CustomLogin {

    public String getApplicationRole(String userName, String password) {

        String localPassword = BCrypt.hashpw("fish", BCrypt.gensalt());

        if (userName.equalsIgnoreCase("Fish") &&
                BCrypt.checkpw(password,localPassword))

               {
            return "ROLE_USER";
        }
        return null;
    }

}
