package com.mtg;

import org.springframework.security.crypto.bcrypt.BCrypt;

/**
 * Created by ryanj on 5/23/2017.
 */
public class CustomLogin {
    private static final int WORKLOAD = 4;

    public String getApplicationRole(String userName, String password) {
        if (userName.equalsIgnoreCase("Fish") &&
                BCrypt.checkpw(password,"$2a$04$h4z3rbbEVz4D59U2SI597e.i3UysOBr/I6nZQc2yKpIxvxY0vEA/C"))

               {
            return "ROLE_USER";
        }
        return null;
    }

}
