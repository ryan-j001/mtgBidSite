package com.mtg;

import org.springframework.security.crypto.bcrypt.BCrypt;

/**
 * Created by ryanj on 5/23/2017.
 */
public class CustomLogin {
    private static final int WORKLOAD = 4;
    public String getApplicationRole(String userName, String password) {
        //password green bounce
        if (userName.equalsIgnoreCase("Fish") &&
                BCrypt.checkpw(password, "$2a$10$M5GcdnvZb3l2fyG.np5aUuu4AslV3ocvVULDpdNaYvrkl0bqt0aRa"))
               {
            return "ROLE_USER";
        }
        return null;
    }

}
