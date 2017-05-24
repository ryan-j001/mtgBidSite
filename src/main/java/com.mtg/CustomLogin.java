package com.mtg;

/**
 * Created by ryanj on 5/23/2017.
 */
public class CustomLogin {
	public String getApplicationRole(String userName, String password) {

		if (userName.equalsIgnoreCase("Fish")) {
			return "ROLE_USER";
		}
		return null;
	}
}
