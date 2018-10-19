package com.mtg;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * Created by ryanj on 5/23/2017.
 */
public class ApplicationUser extends User{

	private static final long serialVersionUID = 1L;
	private final String email;

	public ApplicationUser(String username, String password, boolean enabled,
						   boolean accountNonExpired, boolean credentialsNonExpired,
						   boolean accountNonLocked,
						   Collection<GrantedAuthority> authorities,
						   String email) {
		super(username, password, enabled, accountNonExpired,
				credentialsNonExpired, accountNonLocked, authorities);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
}


