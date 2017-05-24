package com.mtg;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ryanj on 5/22/2017.
 */
public class CustomAuthenticationProvider implements AuthenticationProvider {
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String userName = authentication.getName().trim();
		String password = authentication.getCredentials().toString().trim();
		Authentication auth = null;
		CustomLogin login = new CustomLogin();
		//Authenticate the user based on your custom logic
		String role = login.getApplicationRole(userName, password);
		if (role != null) {

			Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
			grantedAuthorities.add(new SimpleGrantedAuthority(role.trim()));
			User appUser = new ApplicationUser(userName, password, true, true, true, true, grantedAuthorities, "TestEmail");
			auth = new UsernamePasswordAuthenticationToken(appUser, password, grantedAuthorities);
			return auth;
		} else {
			return null;
		}
	}


	public boolean supports(Class<? extends Object> authentication) {
		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}
}
